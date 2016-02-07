package pl.yourempire.api.unit;

import pl.yourempire.api.object.Squad;
import pl.yourempire.api.object.TerrainObject;
import pl.yourempire.api.object.TerrainObjectType;
import pl.yourempire.api.unit.info.UnitInfo;

import java.util.ArrayList;
import java.util.List;
/**
 * Created by Administratorek on 2016-02-07.
 */
public class Unit implements UnitInfo
{

    private int HP;
    private int DMG;
    private int SPD;
    private List<TerrainObjectType> terrainCanMoves = new ArrayList<TerrainObjectType>();
    private List<TerrainObjectType> bonusTerrain = new ArrayList<TerrainObjectType>();
    private Squad b;
    public Unit()
    {

    }
    public Unit(int h , int d , int spd )
    {
        this.HP = h;
        this.DMG = d;
        this.SPD = spd;
        this.b = new Squad();

    }
    public int getHP()
    {
        return this.HP;
    }


    public int getDMG()
    {
        return this.DMG;
    }


    public int getSPD()
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
