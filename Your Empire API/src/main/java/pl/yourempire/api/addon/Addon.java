package pl.yourempire.api.addon;

import java.io.File;
import java.util.Properties;

public class Addon
{
    protected File dataFolder;
    protected Properties addonProps;
    protected boolean loaded, enabled;

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
        return addonProps;
    }

    public File getDataFolder()
    {
        return dataFolder;
    }

    public boolean isEnabled()
    {
        return enabled;
    }

    public void setEnabled(boolean enabled)
    {
        this.enabled = enabled;
    }

    public boolean isLoaded()
    {
        return loaded;
    }

    public void setLoaded(boolean loaded)
    {
        this.loaded = loaded;
    }
}
