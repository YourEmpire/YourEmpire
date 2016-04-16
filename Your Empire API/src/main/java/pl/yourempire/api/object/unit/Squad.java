package pl.yourempire.api.object.unit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import pl.yourempire.api.object.MapObject;
import pl.yourempire.api.object.Texture;
import pl.yourempire.api.object.unit.Commander;
import pl.yourempire.api.object.unit.Unit;

public class Squad extends MapObject
{
    private Commander com;
    private List<Unit> units;
    private Texture t;

    public Squad(Commander com)
    {
        this.com = com;
        this.units = new ArrayList<>();
        if (com == null)
        {
            this.t = Texture.EMPTY;
            throw new IllegalArgumentException("Cannot create empty squad!");
        }
        else
        {
            this.t = com.getTexture();
        }

    }

    public Squad(Commander com, List<Unit> units)
    {
        if (units == null || units.isEmpty())
        {
            throw new IllegalArgumentException("Units cannot be null! Dev note: use new Squad(Commander) instead.");
        }
        if (com == null)
        {
            this.t = units.get(0).getTexture();
        }
        else
        {
            this.t = com.getTexture();
        }

        this.com = com;
        this.units = new ArrayList<>();

    }


    public Squad(List<Unit> firstUnits)
    {
        if (firstUnits == null || firstUnits.isEmpty())
        {
            throw new IllegalArgumentException("Cannot create empty squad!");
        }
        this.com = null;
        this.t = firstUnits.get(0).getTexture();
        this.units = new ArrayList<>(firstUnits);
    }

    public Squad(Unit firstUnit)
    {
        this(Arrays.asList(firstUnit));
    }

    public void addUnit(Unit u)
    {
    this.units.add(u);
    }
    public void addUnits(Collection<Unit> units)
    {
        this.units.addAll(units);
    }

}
