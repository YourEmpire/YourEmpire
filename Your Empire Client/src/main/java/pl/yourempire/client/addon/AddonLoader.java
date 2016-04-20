package pl.yourempire.client.addon;

import java.io.File;
import java.io.IOException;

import pl.yourempire.api.addon.Addon;

public abstract class AddonLoader
{
    protected AddonLoader()
    {
    }

    public abstract Addon load(File f) throws IOException;
}
