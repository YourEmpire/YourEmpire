package pl.yourempire.api.object.unit.info;

import java.util.List;
import java.util.Map;

import pl.yourempire.api.object.ID;
import pl.yourempire.api.object.Texture;
import pl.yourempire.api.object.terrain.TerrainObjectType;
import pl.yourempire.api.object.unit.Bonus;

public class UnitInfoImpl implements UnitInfo
{
    private String displayName;
    private ID id;
    private int startHP, damage, speed;
    private Texture texture;
    private Map<TerrainObjectType, List<Bonus>> bonuses;

    @Override
    public String getDisplayName()
    {
        return displayName;
    }

    @Override
    public ID getID()
    {
        return id;
    }

    @Override
    public int getStartHP()
    {
        return startHP;
    }

    @Override
    public int getDamage()
    {
        return damage;
    }

    @Override
    public int getSpeed()
    {
        return speed;
    }

    @Override
    public Texture getTexture()
    {
        return texture;
    }

    public void setDisplayName(String displayName)
    {
        this.displayName = displayName;
    }

    public void setID(ID id)
    {
        this.id = id;
    }

    public void setStartHP(int startHP)
    {
        this.startHP = startHP;
    }

    public void setDamage(int damage)
    {
        this.damage = damage;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public void setTexture(Texture texture)
    {
        this.texture = texture;
    }

    public void setBonuses(Map<TerrainObjectType, List<Bonus>> bonuses)
    {
        this.bonuses = bonuses;
    }

    @Override
    public Map<TerrainObjectType, List<Bonus>> getBonuses()
    {
        return bonuses;
    }
}
