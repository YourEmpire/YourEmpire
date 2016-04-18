package pl.yourempire.api.object.city;

import java.util.List;

import pl.yourempire.api.object.MapObject;
import pl.yourempire.api.object.city.building.Building;
import pl.yourempire.api.player.Player;

public class CityObject extends MapObject
{
    private int level;
    private List<Building> buildings;
    private Player owner;

    public CityObject(Player owner, int level)
    {
        this.owner = owner;
        this.level = level;
    }

    public CityObject(Player owner)
    {
        this(owner, 1);
    }

    public int getPopulation()
    {
        return level * 10000;
    }

    public int getLevel()
    {
        return level;
    }

    public void setLevel(int level)
    {
        this.level = level;
    }

    public List<Building> getBuildings()
    {
        return buildings;
    }

    public Player getOwner()
    {
        return owner;
    }
}
