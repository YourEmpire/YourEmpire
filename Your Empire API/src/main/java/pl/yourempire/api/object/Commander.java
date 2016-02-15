package pl.yourempire.api.object;

import pl.yourempire.api.object.unit.info.UnitInfo;

public class Commander implements UnitInfo
{
    private int hp , spd , dmg;
    private Bonus bonus;

    public void setHp(int hp)
    {
        this.hp = hp;
    }

    public void setSpd(int spd)
    {
        this.spd = spd;
    }

    public void setDmg(int dmg)
    {
        this.dmg = dmg;
    }

    public void setBonus(Bonus bonus)
    {
        this.bonus = bonus;
    }

    public Bonus getBonus() {
        return bonus;
    }

    public int getHP()
    {
        return this.hp;
    }

    public int getDMG()
    {
        return this.dmg;
    }

    public int getSPD()
    {
        return this.spd;
    }

}
