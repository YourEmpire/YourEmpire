package pl.yourempire.test.api.unit;

import pl.yourempire.api.object.unit.info.UnitInfoImpl;

/**
 * Created by Administratorek on 2016-04-17.
 */
public class Test
{
    public void doSomething(String param)
    {
        UnitInfoImpl archer = new UnitInfoImpl();
        archer.setStartHP(20);
        archer.setSpeed(10);
        archer.setDamage(1);
    }
}
