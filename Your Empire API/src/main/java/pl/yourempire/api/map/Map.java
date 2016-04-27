package pl.yourempire.api.map;

import pl.yourempire.api.object.terrain.TerrainObject;
import pl.yourempire.api.positioning.Location;

public class Map
{
    private String name, description, mapVersion;
    private TerrainObject[][] mapTerrain;
    private int width, height;
    private byte minPlayers, maxPlayers;

    public Map(String version, int width, int height)
    {
        this.name = name;
        this.description = "";
        this.width = width;
        this.height = height;
        this.mapTerrain = new TerrainObject[height][width];
    }

    public TerrainObject get(int x, int y)
    {
        return this.mapTerrain[y][x];
    }

    public TerrainObject get(Location loc)
    {
        return get(loc.getX(), loc.getY());
    }

    public void set(int x, int y, TerrainObject tile)
    {
        this.mapTerrain[y][x] = tile;
    }

    public void set(Location loc, TerrainObject tile)
    {
        set(loc.getX(), loc.getY(), tile);
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public byte getMinPlayers()
    {
        return minPlayers;
    }

    public byte getMaxPlayers()
    {
        return maxPlayers;
    }

    public void setMinPlayers(byte minPlayers)
    {
        this.minPlayers = minPlayers;
    }

    public void setMaxPlayers(byte maxPlayers)
    {
        this.maxPlayers = maxPlayers;
    }

    public String getMapVersion()
    {
        return mapVersion;
    }
}
