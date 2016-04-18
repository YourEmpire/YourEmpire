package pl.yourempire.api.map;

import pl.yourempire.api.object.terrain.TerrainObject;
import pl.yourempire.api.positioning.Location;

public class Map
{
    private String name, desc;
    private TerrainObject[][] mapTerrain;
    private int width, height;

    public Map(String name, int width, int height)
    {
        this.name = name;
        this.desc = "";
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
}
