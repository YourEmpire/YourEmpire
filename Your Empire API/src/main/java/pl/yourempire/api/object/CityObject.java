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

    public Religion getReligen() {
        return this.religion;
    }

    public void setReligen(Religion religen) {
        this.religion = religen;
    }
}
