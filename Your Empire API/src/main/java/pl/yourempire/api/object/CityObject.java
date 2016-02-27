package pl.yourempire.api.object;

import pl.yourempire.api.religion.Religion;

public class CityObject extends MapObject
{
    private int population;
    private Religion religion;

    public int getPopulation() {
        return this.population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Religion getReligion() {
        return this.religion;
    }

    public void setReligion(Religion religion) {
        this.religion = religion;
    }
}
