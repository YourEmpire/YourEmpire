package pl.yourempire.api.object.unit;

import pl.yourempire.api.Technology;
import pl.yourempire.api.object.*;
import pl.yourempire.api.object.terrain.TerrainObject;
import pl.yourempire.api.object.terrain.TerrainObjectType;
import pl.yourempire.api.object.unit.info.UnitInfo;
import pl.yourempire.api.positioning.Location;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class Unit extends MapObject implements UnitInfo
{
    private int hp, dmg, spd;
    private List<TerrainObjectType> terrainCanMoves = new ArrayList<>();
    private List<TerrainObjectType> bonusTerrain = new ArrayList<>();
    private Squad b;
    private Location loc;
    private Texture texture;
    private HashMap<WeatherType,Bonus> weatherBonuses = new HashMap<>();
    private HashMap<Technology,Bonus> technologyBonuses = new HashMap<>();
    private HashMap<Commander,Bonus> commanderBonuses = new HashMap<>();

    protected Unit()
    {
    }

    protected Unit(int h, int d, int spd)
    {
        this.hp = h;
        this.dmg = d;
        this.spd = spd;
        this.b = new Squad();
    }

    public int getHP()
    {
        return this.hp;
    }

    public int getDMG()
    {
        return this.dmg;
    }

    public int getSPD()
    {
        return this.spd;
    }

    public int getATKBonus()
    {
        return this.dmg;
    }

    public void setHP(int hp)
    {
        this.hp = hp;
    }

    public void setDMG(int dmg)
    {
        this.dmg = dmg;
    }

    public void setSPD(int spd)
    {
        this.spd = spd;
    }

    public Location getLocation()
    {
        return this.loc;
    }

    public void setLocation(Location newLoc)
    {
        if (newLoc == null)
        {
            throw new IllegalArgumentException("New location cannot be null!");
        }
        this.loc = newLoc;
    }

    public Texture getTexture()
    {
        return this.texture;
    }

    public void addTerrainCanMove(TerrainObjectType t)
    {
        this.terrainCanMoves.add(t);
    }

    public void addBonusTerrain(TerrainObjectType t)
    {
        this.bonusTerrain.add(t);
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
        return terrainCanMoves.contains(object.getType());
    }



}
