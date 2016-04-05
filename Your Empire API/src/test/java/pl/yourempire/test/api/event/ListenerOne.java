package pl.yourempire.test.api.event;

import pl.yourempire.api.event.EventHandler;
import pl.yourempire.api.event.Listener;

public class ListenerOne implements Listener
{
    @EventHandler
    public void listener(TestEvent1 test)
    {
        System.out.println(test.getStr());
    }
}
