package pl.yourempire.server.server;

import pl.yourempire.api.game.Game;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Server
{
    private Game game;
    private InetAddress ip;
    private int port;

    public Server(Game game, int port) throws UnknownHostException {
        this.game = game;
        this.ip = InetAddress.getLocalHost();
        this.port = port;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public InetAddress getIp() {
        return ip;
    }
}
