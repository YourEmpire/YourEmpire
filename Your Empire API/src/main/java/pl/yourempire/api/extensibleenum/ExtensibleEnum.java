package pl.yourempire.api.extensibleenum;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

public class ExtensibleEnum
{
    private Map<String, ExtensibleEnum> constants;

    private ExtensibleEnum()
    {
        constants = new HashMap<>();
        for (Field f : getClass().getFields())
        {
            if (Modifier.isFinal(f.getModifiers()) && Modifier.isStatic(f.getModifiers()))
            {
                try
                {
                    addConstant(f.getName(), (ExtensibleEnum) f.get(null), false);
                } catch (IllegalAccessException e)
                {
                    // Can't throw IllegalAccessException, but printing stack trace
                    e.printStackTrace();
                }
            }
        }
    }

    public void addConstant(String name, ExtensibleEnum t, boolean showCastTrace)
    {
        if (constants.containsKey(name))
        {
            throw new IllegalArgumentException("Enum " + getClass().getName() + " contains object " + t + " with name" + name + "!");
        }
        try
        {
            t.getClass().cast(getClass());
            constants.put(name, t);
        }
        catch (ClassCastException e)
        {
            if (showCastTrace)
            {
                throw new IllegalArgumentException("Cannot add constant! " + e.getMessage(), e);
            }
        }
    }

    public void addConstant(String name, ExtensibleEnum t)
    {
        addConstant(name, t, true);
    }

    public ExtensibleEnum valueOf(String name)
    {
        return constants.get(name);
    }
}
