package pl.yourempire.server.server;

import pl.yourempire.api.addon.Addon;
import pl.yourempire.api.game.Game;
import pl.yourempire.client.addon.AddonManager;
import pl.yourempire.server.Start;

import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Server
{
    private Game game;
    private InetAddress ip;
    private int port;
    private String name;
    private File dir;
    private File addonsDir;
    private int slots;
    private Map<String, Addon> addons; //Name and Addon

    public Server(Game game, int port, String name, int slots) throws UnknownHostException
    {
        this.game = game;
        this.ip = InetAddress.getLocalHost();
        this.port = port;
        this.name = name;
        this.dir = new File(Start.SERVERS_DIR + "/" + name);
        this.addonsDir = new File(this.dir.getPath() + "/addons");
        this.slots = slots;

        this.addons = new HashMap<>();

        for(File addon : addonsDir.listFiles())
        {
            //TODO: Loading addons
        }
    }

    public Game getGame()
    {
        return game;
    }

    public int getPort()
    {
        return port;
    }

    public InetAddress getIp()
    {
        return ip;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public File getDir()
    {
        return this.dir;
    }

    public int getSlots()
    {
        return this.slots;
    }

    public void setSlots(int slots)
    {
        this.slots = slots;
    }

    public Map<String, Addon> getAddons()
    {
        return this.addons;
    }

}
