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
    private Texture t;
    private int hp;

    protected Unit()
    {
    }

    public Unit(UnitInfoImpl info, Squad s,Location loc)
    {
        this.info = info;
        this.t = info.getTexture();
        this.hp = info.getStartHP();
        this.loc = loc;
        this.s = s;

    }

    public Unit(UnitInfoImpl info)
    {
        this.info = info;
        this.t = info.getTexture();
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
        return info.getMovableTerrain().contains(object.getType());
    }

    public Texture getTexture()
    {
        return info.getTexture();
    }

    public boolean isAlive()
    {
        if(this.hp >0)
        {
            return true;
        }

        if(this.hp <=0)
        {
            return false;
        }

        else
        {
            return false;
        }
    }

    // Setters && Modify

    public void setHP(int hp)
    {
        this.hp = hp;
    }







}