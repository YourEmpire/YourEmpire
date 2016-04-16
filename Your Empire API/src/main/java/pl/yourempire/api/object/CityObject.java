package pl.yourempire.api.object;

import pl.yourempire.api.religion.Religion;

public class CityObject extends MapObject
{
    private int population;
    private Texture texture;

    public int getPopulation() {
        return this.population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
