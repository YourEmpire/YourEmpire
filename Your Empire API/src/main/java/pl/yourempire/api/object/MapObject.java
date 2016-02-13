package pl.yourempire.api.object;

import pl.yourempire.api.object.terrain.TerrainObject;
import pl.yourempire.api.positioning.Location;

public class MapObject
{
    Location l;
    TerrainObject t;


    public final TerrainObject getTerrain()
    {
        return this.t;
    }
}
