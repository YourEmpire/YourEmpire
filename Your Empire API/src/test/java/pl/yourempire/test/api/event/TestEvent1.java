package pl.yourempire.test.api.event;

import pl.yourempire.api.event.Event;

public class TestEvent1 extends Event
{
    private String str;

    public TestEvent1(String str)
    {
        this.str = str;
    }

    public String getStr()
    {
        return this.str;
    }
}
