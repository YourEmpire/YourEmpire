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
    private UnitInfo info;
    protected Squad s;
    protected Location loc;
    private Texture t;

    protected Unit()
    {
    }

    public Unit(UnitInfo info, Squad s)
    {
        this.info = info;
        this.t = info.getTexture();
        this.s = s;
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
        if (this.s == null)
        {
            this.s = new Squad();
        }
        return this.s;
    }

    public boolean canMoveOn(TerrainObject object)
    {
        return movableTerrain.contains(object.getType());
    }

    public Texture getTexture()
    {
        return t;
    }

    public void setTexture(Texture t)
    {
        this.t = t;
    }
}