package pl.yourempire.api.object.city;

public class CityBonus
{
    private int defenseBonus;

    public CityBonus(int defenseBonus)
    {
        this.defenseBonus = defenseBonus;
    }

    public int getDefenseBonus()
    {
        return defenseBonus;
    }

    public void setDefenseBonus(int defenseBonus)
    {
        this.defenseBonus = defenseBonus;
    }
}
