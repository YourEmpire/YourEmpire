package pl.yourempire.api.object.unit;

import pl.yourempire.api.object.*;
import pl.yourempire.api.object.terrain.TerrainObject;
import pl.yourempire.api.object.terrain.TerrainObjectType;
import pl.yourempire.api.object.unit.info.UnitInfo;
import pl.yourempire.api.positioning.Location;

import java.util.ArrayList;
import java.util.List;

public abstract class Unit extends MapObject implements UnitInfo
{
    protected List<TerrainObjectType> movableTerrain = new ArrayList<>();
    protected Squad b;
    protected Location loc;

    protected Unit()
    {
    }

    public Unit(UnitInfo info, Squad s)
    {

    }

    public Unit(UnitInfo info)
    {
        this(info, new Squad());
    }

    public void addMovableTerrain(TerrainObjectType t)
    {
        this.movableTerrain.add(t);
    }

    public Squad getSquad()
    {
        if (this.b == null)
        {
            this.b = new Squad();
        }
        return this.b;
    }

    public boolean canMoveOn(TerrainObject object)
    {
        return movableTerrain.contains(object.getType());
    }
}