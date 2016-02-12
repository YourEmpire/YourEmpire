package pl.yourempire.api.unit;


/**
 * Created by Administratorek on 2016-02-07.
 */
public class Archer extends Unit
{
    public Archer()
    {
        setDMG(12);
        setHP(100);
        setSPD(10);
        addBonusTerrain(TerrainObjectType.hillsTerrain);

    }

}
