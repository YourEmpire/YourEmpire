package pl.yourempire.api.object;

/**
 * Created by Administratorek on 2016-02-14.
 */
public class Bonus
{
  private int dmg;
  private int hp;
  private int spd;

  public int getDmg()
  {
    return dmg;
  }

  public int getHp()
  {
    return hp;
  }

  public int getSpd()
  {
    return spd;
  }

  public Bonus(int d , int h , int s)
  {
    this.dmg = d;
    this.hp = h;
    this.spd = s;
  }




}
