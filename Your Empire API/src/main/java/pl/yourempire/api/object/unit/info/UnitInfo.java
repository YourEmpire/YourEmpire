package pl.yourempire.api.object.unit.info;

import pl.yourempire.api.extensibleenum.Constant;
import pl.yourempire.api.object.ID;

public interface UnitInfo extends Constant<UnitInfo>
{
    ID getID();

    int getHP(); // retrun HP

    int getDamage(); // Return DMG without bonus

    int getSpeed(); // returns Speed of Unit



}

