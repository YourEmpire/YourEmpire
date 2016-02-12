package pl.yourempire.api.object;

import java.util.List;

import pl.yourempire.api.positioning.Location;
import pl.yourempire.api.unit.Unit;

public class Squad extends Unit
{
    private Location   loc;
    private Commander  com;
    private List<Unit> units;

}
