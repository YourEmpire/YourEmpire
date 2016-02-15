package pl.yourempire.api.registry;

import java.util.ArrayList;
import java.util.List;

import pl.yourempire.api.Technology;
import pl.yourempire.api.object.terrain.TerrainObjectType;
import pl.yourempire.api.object.unit.info.UnitInfo;

public class Registry
{
    public static List<TerrainObjectType> terrainObjectTypes;
    public static List<UnitInfo> unitInfos;
    public static List<Technology> technology;

    public static void reset()
    {
        terrainObjectTypes = new ArrayList<>();
        unitInfos = new ArrayList<>();
    }

    public static void registerObject(Object o, String id)
    {

    }
}
