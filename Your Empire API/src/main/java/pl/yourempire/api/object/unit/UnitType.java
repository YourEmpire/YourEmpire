package pl.yourempire.api.object.unit;

import java.util.Collection;

import pl.yourempire.api.extensibleenum.ExtensibleEnum;
import pl.yourempire.api.object.unit.info.UnitInfo;

public class UnitType
{
    private static ExtensibleEnum<UnitInfo> extEnum = new ExtensibleEnum<>();

    public static void add(String enumId, UnitInfo type)
    {
        extEnum.addConstant(enumId, type);
    }

    public static UnitInfo get(String enumId)
    {
        return extEnum.valueOf(enumId);
    }

    public static Collection<UnitInfo> getAll()
    {
        return extEnum.values();
    }

    public static void remove(String enumId)
    {
        extEnum.remove(enumId);
    }

    public static int getAddedCount()
    {
        return extEnum.getSize();
    }
}
