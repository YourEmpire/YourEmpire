package pl.yourempire.api.object.unit;

import java.util.Collection;

import pl.yourempire.api.extensibleenum.ExtensibleEnum;
import pl.yourempire.api.object.unit.info.UnitInfo;

public class UnitType
{
    private static ExtensibleEnum<UnitInfo> extEnum = new ExtensibleEnum<>();

    public static void addUnit(String id, UnitInfo info)
    {
        extEnum.addConstant(id, info);
    }

    public static void getUnit(String id)
    {
        extEnum.valueOf(id);
    }

    public static Collection<UnitInfo> values()
    {
        return extEnum.values();
    }
}
