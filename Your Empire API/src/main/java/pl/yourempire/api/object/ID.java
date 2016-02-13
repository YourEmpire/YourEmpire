package pl.yourempire.api.object;

public class ID
{
    private String addon, name;

    public ID(String addon, String name)
    {
        if (addon == null || addon.isEmpty())
        {
            throw new IllegalArgumentException("Addon name cannot be null, or empty!");
        }
        if (name == null || name.isEmpty())
        {
            throw new IllegalArgumentException("Name cannot be null, or empty!");
        }
        this.addon = addon;
        this.name = name;
    }

    public String getAddon()
    {
        return this.addon;
    }

    public String getName()
    {
        return this.name;
    }

    public String getTextID()
    {
        return addon + ":" + name;
    }
}
