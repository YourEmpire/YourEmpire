package pl.yourempire.api.event;

import java.lang.reflect.Method;

import pl.yourempire.api.validator.Validator;

public class ListenerCaller
{
    private Object instance;
    private Method eventMethod;

    public ListenerCaller(Object instance, Method eventMethod)
    {
        Validator.notNull(instance, "Instance cannot be null!");
        Validator.notNull(eventMethod, "Event method cannot be null!");
        this.instance = instance;
        this.eventMethod = eventMethod;
    }

    public Object getInstance()
    {
        return instance;
    }
    public Method getEventMethod()
    {
        return eventMethod;
    }
}
