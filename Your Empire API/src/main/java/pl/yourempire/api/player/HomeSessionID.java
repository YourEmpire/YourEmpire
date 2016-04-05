package pl.yourempire.api.player;

public class HomeSessionID extends SessionID
{
    public HomeSessionID()
    {
        this.sessionID = new char[] {'h', 'o', 'm', 'e', 's', 'e', 's', 's', 'i', 'o', 'n'};
        this.expiration = null;
    }
}
