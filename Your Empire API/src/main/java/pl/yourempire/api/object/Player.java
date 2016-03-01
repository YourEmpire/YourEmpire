package pl.yourempire.api.object;

import java.util.UUID;

/**
 * Created by mikigal on 2016-02-29.
 */
public class Player {

    private ID id;
    private UUID uuid;
    private Integer money;
    private CityObject[] cities;
    private Commander commander;

    public Player(ID id, UUID uuid, Integer money, CityObject[] cities, Commander commander) {
        this.id = id;
        this.uuid = uuid;
        this.money = money;
        this.cities = cities;
        this.commander = commander;
    }

    public ID getId() {
        return this.id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    public Integer getMoney() {
        return this.money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public CityObject[] getCities() {
        return this.cities;
    }

    public void setCities(CityObject[] cities) {
        this.cities = cities;
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
