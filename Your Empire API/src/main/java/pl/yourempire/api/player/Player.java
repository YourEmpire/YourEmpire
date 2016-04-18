package pl.yourempire.api.player;

import java.util.ArrayList;
import java.util.List;

import pl.yourempire.api.object.city.CityObject;
import pl.yourempire.api.object.unit.Unit;

public class Player
{
    private String nickname;
    private SessionID sessionID;
    private List<Unit> ownUnits;
    private List<CityObject> ownCities;

    public Player(String nickname, SessionID sessionID)
    {
        if (sessionID == null)
        {
            this.sessionID = new HomeSessionID();
        }
        else
        {
            this.sessionID = sessionID;
        }
        this.nickname = nickname;
        this.ownUnits = new ArrayList<>();
        this.ownCities = new ArrayList<>();
    }

    public String getNickname()
    {
        return nickname;
    }

    public void setNickname(String nickname)
    {
        this.nickname = nickname;
    }

    public SessionID getSessionID()
    {
        return sessionID;
    }

    public void setSessionID(SessionID sessionID)
    {
        this.sessionID = sessionID;
    }

    public List<Unit> getUnits()
    {
        return ownUnits;
    }

    public List<CityObject> getCities()
    {
        return ownCities;
    }

    public void addUnit(Unit u)
    {
        ownUnits.add(u);
    }

    public void addCity(CityObject city)
    {
        ownCities.add(city);
    }
}
