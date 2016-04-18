package pl.yourempire.api.game;

import java.util.List;
import java.util.Map;

import pl.yourempire.api.player.Player;

public class Game
{
    private List<Player> players;
    private Map map;

    public Game(List<Player> players, Map map)
    {
        this.players = players;
        this.map = map;
    }

    public List<Player> getPlayers()
    {
        return players;
    }

    public Map getMap()
    {
        return map;
    }
}
