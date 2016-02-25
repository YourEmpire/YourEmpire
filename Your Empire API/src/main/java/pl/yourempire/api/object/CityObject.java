package pl.yourempire.api.object;

import pl.yourempire.api.Religen;

public class CityObject extends MapObject
{
    private int population;
    private Religen religen;

    public int getPopulation() {
        return this.population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public Religen getReligen() {
        return this.religen;
    }

    public void setReligen(Religen religen) {
        this.religen = religen;
    }
}
