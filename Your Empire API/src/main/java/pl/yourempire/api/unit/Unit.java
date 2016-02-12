package pl.yourempire.api.unit;

import pl.yourempire.api.object.Squad;
import pl.yourempire.api.unit.info.UnitInfo;
import pl.yourempire.api.object.MapObject;

import java.util.ArrayList;
import java.util.List;

public class Unit extends MapObject implements UnitInfo
{

    private int hp;
    private int dmg;
    private int spd;
    private List<TerrainObjectType> terrainCanMoves = new ArrayList<TerrainObjectType>();
    private List<TerrainObjectType> bonusTerrain = new ArrayList<TerrainObjectType>();
    private Squad b;
    public Unit()
    {

    }
    public Unit(int h , int d , int spd )
    {
        this.hp = h;
        this.dmg = d;
        this.spd = spd;
        this.b = new Squad();

    }
    public final int getHP()
    {
        return this.HP;
    }


    public final int getDMG()
    {
        return this.DMG;
    }


    public final int getSPD()
    {
        return this.SPD;
    }

    public int getATKBonus()
    {
        return this.DMG;
    }

    public void setHP(int hp)
    {
        this.HP = hp;
    }
    public void setDMG(int dmg)
    {
        this.DMG = dmg;
    }
    public void setSPD(int spd)
    {
        this.SPD = spd;
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
        if(this.b == null)
        {
            this.b = new Squad();
        }
        return this.b;
    }


}
