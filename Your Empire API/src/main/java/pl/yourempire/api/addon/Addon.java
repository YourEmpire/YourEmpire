package pl.yourempire.api.addon;

import java.io.File;

public class Addon
{
    protected AddonLoaderData ald;

    protected Addon()
    {
    }

    public void onLoad()
    {
    }

    public void onEnable()
    {
    }

    public void onDisable()
    {
    }

    public File getDataFolder()
    {
        return ald.getDataFolder();
    }
}
