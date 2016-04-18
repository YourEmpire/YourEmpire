package pl.yourempire.api.object.unit;

import pl.yourempire.api.object.*;
import pl.yourempire.api.object.terrain.TerrainObject;
import pl.yourempire.api.object.terrain.TerrainObjectType;
import pl.yourempire.api.object.unit.info.UnitInfo;
import pl.yourempire.api.object.unit.info.UnitInfoImpl;
import pl.yourempire.api.positioning.Location;

import java.util.ArrayList;
import java.util.List;

public class Unit extends MapObject
{
    private UnitInfoImpl info;
    protected Squad s;
    protected Location loc;
    private int hp;

    protected Unit() // Special constructor for these, who want to create "special" unit.
    {
    }

    public Unit(UnitInfoImpl info, Squad s, Location loc)
    {
        this.info = info;
        this.hp = info.getStartHP();
        this.loc = loc;
        this.s = s;
    }

    public Unit(UnitInfoImpl info, Location loc)
    {
        this.info = info;
        this.hp = info.getStartHP();
        this.loc = loc;
        this.s = new Squad(this);
    }

// Getters

    public Squad getSquad()
    {
        if (this.s == null)
        {
            this.s = new Squad(this);
        }
        return this.s;
    }

    public int getSpeed()
    {
        return info.getSpeed();
    }

    public boolean canMoveOn(TerrainObject object)
    {
        return info.getMovableTerrain().contains(object.getType()) || getMap().get(getLocation()).canStayOn(this);
    }

    public Texture getTexture()
    {
        return info.getTexture();
    }

    public boolean isAlive()
    {
        return this.hp > 0;
    }

    // Setters && Modify

    public void setHP(int hp)
    {
        this.hp = hp;
    }







}