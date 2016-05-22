package pl.yourempire.api.map;

import pl.yourempire.api.object.terrain.TerrainObject;
import pl.yourempire.api.player.FakePlayer;
import pl.yourempire.api.player.HomeSessionID;
import pl.yourempire.api.player.Player;
import pl.yourempire.api.positioning.Location;

public class Map
{
    private String name, description, mapVersion;
    private TerrainObject[][] mapTerrain;
    private int width, height, registerdPlayers;
    private byte minPlayers, maxPlayers;
    private Player[] players; // field added, because map loader need to give start units; these players are fake

    public Map(String version, int width, int height)
    {
        this.description = "";
        this.width = width;
        this.height = height;
        this.mapTerrain = new TerrainObject[height][width];
        this.registerdPlayers = 0;
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

    public Player getPlayer(String name)
    {
        for (Player p : players)
        {
            if (p.getNickname().equals(name))
            {
                return p;
            }
        }
        return null;
    }

    public Player getPlayer(int index)
    {
        if (index > players.length)
        {
            throw new IllegalArgumentException("Index cannot be higher than " + players.length + "!");
        }
        return players[index];
    }

    public void setPlayer(int index, Player p)
    {
        players[index] = p;
    }

    public void addPlayer(Player p)
    {
        if (!(this.registerdPlayers == players.length))
        {
            setPlayer(this.registerdPlayers, p);
        }
    }
}
