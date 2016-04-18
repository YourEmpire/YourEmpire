package pl.yourempire.api.addon;

import java.io.File;
import java.util.Properties;

public class AddonLoaderData
{
    private File dataFolder;
    private Properties props;

    public AddonLoaderData(File dataFolder, Properties props)
    {
        this.dataFolder = dataFolder;
        this.props = props;
    }

    public File getDataFolder()
    {
        return dataFolder;
    }

    public Properties getProperties()
    {
        return props;
    }
}
