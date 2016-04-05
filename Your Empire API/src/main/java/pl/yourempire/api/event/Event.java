package pl.yourempire.api.event;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Event
{
    private static Map<Class<Event>, ArrayList<ListenerCaller>> listenerMap = new HashMap<>();

    public static void callEvent(Event e)
    {
        if (listenerMap.containsKey(e.getClass()))
        {
            for (ListenerCaller lc : listenerMap.get(e.getClass()))
            {
                try
                {
                    lc.getEventMethod().invoke(lc.getInstance(), e);
                } catch (IllegalAccessException e1)
                {
                    e1.printStackTrace();
                } catch (InvocationTargetException e1)
                {
                    e1.printStackTrace();
                }
            }
        }
    }

    public static boolean isEvent(Class<?> clazz)
    {
        try
        {
            clazz.cast(Event.class);
            return true;
        } catch(ClassCastException e)
        {
            return false;
        }
    }

    public static void registerListener(Listener l)
    {
        Arrays.asList(l.getClass().getMethods()).forEach(m -> {
            if (m.getParameterTypes().length == 1 && isEvent(m.getParameterTypes()[0]))
            {
                listenerMap.get(m.getParameterTypes()[0]).add(new ListenerCaller(l, m));
            }
        });
    }

    protected boolean cancelled;

    public Event()
    {
        cancelled = false;
    }

    public void setCancelled(boolean flag)
    {
        this.cancelled = flag;
    }

    public boolean isCancelled()
    {
        return this.cancelled;
    }
}
