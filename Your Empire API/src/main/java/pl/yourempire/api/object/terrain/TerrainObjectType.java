package pl.yourempire.api.object.terrain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import pl.yourempire.api.extensibleenum.ExtensibleEnum;
import pl.yourempire.api.object.ID;
import pl.yourempire.api.object.Texture;
import pl.yourempire.api.object.unit.Bonus;
import pl.yourempire.api.object.unit.Unit;
import pl.yourempire.api.object.unit.UnitManager;
import pl.yourempire.api.object.unit.info.UnitInfo;

public abstract class TerrainObjectType
{
    private static ExtensibleEnum<TerrainObjectType> extEnum = new ExtensibleEnum<>();

    public static void add(String enumId, TerrainObjectType type)
    {
        extEnum.addConstant(enumId, type);
    }

    public static TerrainObjectType get(String enumId)
    {
        return extEnum.valueOf(enumId);
    }

    public static Collection<TerrainObjectType> getAll()
    {
        return extEnum.values();
    }

    public static TerrainObjectType getByID(ID id)
    {
        return (TerrainObjectType) getAll().stream().filter(t -> t.getID().equals(id)).toArray()[0];
    }

    public static void remove(String enumId)
    {
        extEnum.remove(enumId);
    }

    public static int getAddedCount()
    {
        return extEnum.getSize();
    }

    private ID id;
    private String displayName;
    private Texture texture;
    private Map<UnitInfo, List<Bonus>> bonuses;

    public abstract boolean canMoveOn(Unit u);

    public ID getID()
    {
        return id;
    }

    public void setID(ID id)
    {
        this.id = id;
    }

    public Map<UnitInfo, List<Bonus>> getBonuses()
    {
        return bonuses;
    }

    public void setBonuses(Map<UnitInfo, List<Bonus>> bonuses)
    {
        this.bonuses = bonuses;
    }

    public List<Bonus> getBonusesFor(UnitInfo type)
    {
        return getBonuses().get(type);
    }

    public void addBonusFor(UnitInfo type, Bonus b)
    {
        if (getBonuses().get(type) == null)
        {
            getBonuses().put(type, new ArrayList<>());
        }
        getBonuses().get(type).add(b);
    }

    public void addBonusesFor(UnitInfo type, Collection<Bonus> b)
    {
        if (getBonuses().get(type) == null)
        {
            getBonuses().put(type, new ArrayList<>(b));
        }
        else
        {
            getBonuses().get(type).addAll(b);
        }
    }

    public Texture getTexture()
    {
        return texture;
    }

    public void setTexture(Texture texture)
    {
        this.texture = texture;
    }

    public String getDisplayName()
    {
        return displayName;
    }

    public void setDisplayName(String displayName)
    {
        this.displayName = displayName;
    }
}
