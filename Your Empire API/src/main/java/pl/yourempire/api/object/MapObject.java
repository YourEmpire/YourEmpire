package pl.yourempire.api.object;

import pl.yourempire.api.map.Map;
import pl.yourempire.api.object.terrain.TerrainObject;
import pl.yourempire.api.positioning.Location;

public class MapObject
{
    private Location location;
    private ID id;
    private Map map;

    public Map getMap()
    {
        return map;
    }

    public ID getId()
    {
        return id;
    }

    public Location getLocation()
    {
        return location;
    }

    public TerrainObject getTerrain()
    {
        return map.get(location);
    }

    public void setLocation(Location location)
    {
        this.location = location;
    }
}
