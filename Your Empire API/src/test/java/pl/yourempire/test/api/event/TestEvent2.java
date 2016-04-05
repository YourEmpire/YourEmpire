package pl.yourempire.test.api.event;

import pl.yourempire.api.event.Event;

public class TestEvent2 extends Event
{
    private int num;

    public TestEvent2(int num)
    {
        this.num = num;
    }

    public int getNum()
    {
        return this.num;
    }
}
