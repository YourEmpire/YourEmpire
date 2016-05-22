package pl.yourempire.api.player;

/**
 * Fake player class is used, when loader's creating slots for players
 */
public class FakePlayer extends Player
{
    public FakePlayer()
    {
        super("", new HomeSessionID());
    }
}
