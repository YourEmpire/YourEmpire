package pl.yourempire.test.api.event;

import org.junit.Test;
import pl.yourempire.api.event.Event;

public class EventTest
{
    @Test
    public void registerTest()
    {
        Event.registerListener(new ListenerOne());
        Event.registerListener(new ListenerTwo());
    }

    @Test
    public void callEvent()
    {
        Event.callEvent(new TestEvent1("Testy"));
        Event.callEvent(new TestEvent2(64532));
    }
}
