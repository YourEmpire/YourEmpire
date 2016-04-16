package pl.yourempire.api.object.unit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import pl.yourempire.api.object.Texture;
import pl.yourempire.api.object.terrain.TerrainObjectType;

public class Commander extends Unit
{
    private Map<TerrainObjectType, List<Bonus>> bonuses;
    private List<Bonus> unitBonuses;
    private Unit u;

    public Commander(Unit unit)
    {
        this.u = unit;
        this.bonuses = new HashMap<>();
        this.unitBonuses = new ArrayList<>();
    }

    public void addUnitBonuses(Collection<Bonus> bonuses)
    {
        unitBonuses.addAll(bonuses);
    }

    public void addUnitBonus(Bonus b)
    {
        unitBonuses.add(b);
    }

    public List<Bonus> getUnitBonuses()
    {
        return unitBonuses;
    }

    @Override
    public int getStartHP()
    {
        return u.getStartHP();
    }

    @Override
    public int getDamage()
    {
        return u.getDamage();
    }

    @Override
    public int getSpeed()
    {
        return u.getSpeed();
    }

    @Override
    public Texture getTexture()
    {
        return u.getTexture();
    }

    @Override
    public Map<TerrainObjectType, List<Bonus>> getBonuses()
    {
        return bonuses;
    }
}
