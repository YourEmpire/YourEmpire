package pl.yourempire.api.object;

/**
 * Created by mikigal on 2016-02-29.
 */
public class Player {

    private ID id;
    private Integer money;
    private CityObject[] cities;
    private Bonus bonus;

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

    public Bonus getBonus() {
        return this.bonus;
    }

    public void setBonus(Bonus bonus) {
        this.bonus = bonus;
    }
}
