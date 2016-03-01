package pl.yourempire.api.event;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
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
