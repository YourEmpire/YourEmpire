package pl.yourempire.api.object.unit;

public class Commander extends Unit
{
    private int hp , spd , dmg;
    private List<Bonus> squadBonuses;

    public Bonus getBonus() {
        return bonus;
    }

}
