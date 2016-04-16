package pl.yourempire.api.object.unit;

public class Bonus
{
    private int plusDmg, plusHp;

    public Bonus(int plusDmg, int plusHp)
    {
        this.plusDmg = plusDmg;
        this.plusHp = plusHp;
    }

    public int getPlusDmg()
    {
        return plusDmg;
    }

    public void setPlusDmg(int plusDmg)
    {

        this.plusDmg = plusDmg;
    }

    public int getPlusHp()
    {
        return plusHp;
    }

    public void setPlusHp(int plusHp)
    {
        this.plusHp = plusHp;
    }
}