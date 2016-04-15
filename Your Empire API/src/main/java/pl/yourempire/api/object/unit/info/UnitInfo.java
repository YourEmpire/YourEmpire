package pl.yourempire.api.object.unit.info;

import java.util.List;
import java.util.Map;

import pl.yourempire.api.object.unit.Bonus;
import pl.yourempire.api.object.ID;
import pl.yourempire.api.object.terrain.TerrainObjectType;


public interface UnitInfo
{
    ID getID();
    int getStartHP();
    int getDamage();
    int getSpeed();

    Map<TerrainObjectType, List<Bonus>> getBonuses();
}

