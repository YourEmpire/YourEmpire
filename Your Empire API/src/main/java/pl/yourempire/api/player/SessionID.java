package pl.yourempire.api.player;

import java.util.Date;

public class SessionID
{
    protected char[] sessionID;
    protected Date expiration;
    protected String user;
    protected byte[] passHash;

    protected SessionID()
    {
    }

}
