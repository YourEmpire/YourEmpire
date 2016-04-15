package pl.yourempire.api.object.terrain;

import pl.yourempire.api.object.MapObject;
import pl.yourempire.api.positioning.Location;

public class TerrainObject
{
    private TerrainObjectType type;
    private Location loc;
    private MapObject objectOn;

    public TerrainObject(TerrainObjectType type)
    {
        if (type == null)
        {
            throw new IllegalArgumentException("Type cannot be null!");
        }
        this.type = type;
    }

    public TerrainObject(TerrainObjectType type, Location loc)
    {
        this(type);
        this.loc = loc;
    }

    public TerrainObjectType getType()
    {
        return this.type;
    }

    public MapObject getObjectOn()
    {
        return objectOn;
    }

    public void setObjectOn(MapObject objectOn)
    {
        this.objectOn = objectOn;
    }
}
