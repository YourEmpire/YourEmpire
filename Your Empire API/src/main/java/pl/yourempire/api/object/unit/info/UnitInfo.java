package pl.yourempire.api.object.unit.info;

public interface UnitInfo
{
    int getHP(); // retrun HP

    int getDMG(); // Return DMG without bonus

    int getSPD(); // returns Speed of Unit

    int getATKBonus(); // for exemple if bonus amount equals 20 we do this int DmgAndBonus = getDMG() * getATKBonus()

}

