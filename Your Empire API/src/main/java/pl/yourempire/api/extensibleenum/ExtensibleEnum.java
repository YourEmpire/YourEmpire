package pl.yourempire.api.extensibleenum;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ExtensibleEnum<T>
{
    private Map<String, T> constants;

    public ExtensibleEnum()
    {
        this.constants = new HashMap<>();
    }


    public void addConstant(String id, T constant)
    {
        if (constants.containsKey(id))
        {
            throw new IllegalArgumentException(id + " already in use!");
        }
        constants.put(id, constant);
    }

    public T valueOf(String name)
    {
        return constants.get(name);
    }

    public Collection<T> values()
    {
        return constants.values();
    }

}
