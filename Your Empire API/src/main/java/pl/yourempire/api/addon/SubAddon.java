package pl.yourempire.api.addon;

import java.io.File;
import java.util.Properties;

public class SubAddon extends Addon
{
    private Addon parent;
    private Properties subAddonProps;
    public SubAddon(Addon parent, Properties subAddonProps)
    {
        this.parent = parent;
        this.subAddonProps = subAddonProps;
        this.dataFolder = new File(parent.getDataFolder(), subAddonProps.getProperty("name"));
    }

    @Override
    public File getDataFolder()
    {
        return dataFolder;
    }

    @Override
    public Properties getAddonProperties()
    {
        return subAddonProps;
    }
}
