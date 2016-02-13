package pl.yourempire.api.object.terrain;

import pl.yourempire.api.positioning.Location;

public class TerrainObject
{
    private TerrainObjectType type;
    private Location loc;

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
}
