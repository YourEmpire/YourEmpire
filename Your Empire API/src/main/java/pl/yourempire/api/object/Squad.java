package pl.yourempire.api.object;

import java.util.List;

import pl.yourempire.api.object.unit.Unit;

public class Squad extends Unit
{
    private Commander  com;
    private List<Unit> units;


    public void addUnit(Unit u)
    {
    this.units.add(u);
    }
}
