package pl.yourempire.api.object;


import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by mikigal on 2016-02-29.
 */
public class Player {

    private UUID uuid;
    private Integer money;
    private ArrayList<CityObject> cities = new ArrayList<>();
    private ArrayList<Squad> squads = new ArrayList<>();
    private Commander commander;

    public Player(UUID uuid, Integer money, ArrayList<CityObject> cities, ArrayList<Squad> squads, Commander commander) {
        this.uuid = uuid;
        this.money = money;
        this.cities = cities;
        this.squads = squads;
        this.commander = commander;
    }

    public Integer getMoney() {
        return this.money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public ArrayList<CityObject> getCities() {
        return cities;
    }

    public void setCities(ArrayList<CityObject> cities) {
        this.cities = cities;
    }

    public ArrayList<Squad> getSquads() {
        return squads;
    }

    public void setSquads(ArrayList<Squad> squads) {
        this.squads = squads;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Commander getCommander() {
        return commander;
    }

    public void setCommander(Commander commander) {
        this.commander = commander;
    }

    public void save(){
        //TODO: Save Player object to file
    }
}
