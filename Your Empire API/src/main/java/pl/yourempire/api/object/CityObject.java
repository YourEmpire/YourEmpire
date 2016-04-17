package pl.yourempire.api.object;

import pl.yourempire.api.object.unit.Squad;
import pl.yourempire.api.object.unit.Unit;
import pl.yourempire.api.object.unit.info.UnitInfo;
import pl.yourempire.api.object.unit.info.UnitInfoImpl;
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
