package pl.yourempire.test.api.event;

import pl.yourempire.api.event.EventHandler;
import pl.yourempire.api.event.Listener;

public class ListenerTwo implements Listener
{
    @EventHandler
    public void listener(TestEvent2 test)
    {
        System.out.println(test.getNum());
    }

    @EventHandler
    public void listener2(TestEvent2 test)
    {
        System.out.println(test.getNum());
    }
}
