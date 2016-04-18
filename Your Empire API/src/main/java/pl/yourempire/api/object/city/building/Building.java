package pl.yourempire.api.object.city.building;

import pl.yourempire.api.object.Texture;
import pl.yourempire.api.object.city.CityBonus;
import pl.yourempire.api.object.city.CityObject;

public class Building
{
    private CityBonus bonus;
    private CityObject parent;
    private Texture image;

    public Building(CityObject parent)
    {
        this.parent = parent;
    }

    public CityBonus getBonus()
    {
        return bonus;
    }

    public void setBonus(CityBonus bonus)
    {
        this.bonus = bonus;
    }

    public CityObject getParent()
    {
        return parent;
    }

    public Texture getImage()
    {
        return image;
    }
}
