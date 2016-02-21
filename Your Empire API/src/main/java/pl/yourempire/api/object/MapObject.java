package pl.yourempire.api.object;

import pl.yourempire.api.object.terrain.TerrainObject;
import pl.yourempire.api.positioning.Location;

public class MapObject
{
    Location l;
    TerrainObject t;
    ID id;

    public TerrainObject getTerrain()
    {
        return this.t;
    }
    public Location getLocation()
    {
        return this.l;
    }
    public ID getID()
    {
        return this.id;
    }
}
