package pl.yourempire.api.object.unit;

import pl.yourempire.api.object.*;
import pl.yourempire.api.object.terrain.TerrainObject;
import pl.yourempire.api.object.unit.info.UnitInfoImpl;
import pl.yourempire.api.player.Player;
import pl.yourempire.api.positioning.Location;


public class Unit
{
    private UnitInfoImpl info;
    protected Squad s;
    protected Location loc;
    private int hp;
    private Player owner;

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


    public boolean canMoveOn(TerrainObject object)
    {
        return info.getMovableTerrain().contains(object.getType()) || s.getMap().get(s.getLocation()).canStayOn(this);
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

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

}