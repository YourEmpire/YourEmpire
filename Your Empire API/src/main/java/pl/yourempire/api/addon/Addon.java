package pl.yourempire.api.addon;

import java.io.File;
import java.util.Properties;

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

    public Properties getAddonProperties()
    {
        return ald.getProperties();
    }

    public File getDataFolder()
    {
        return ald.getDataFolder();
    }
}
