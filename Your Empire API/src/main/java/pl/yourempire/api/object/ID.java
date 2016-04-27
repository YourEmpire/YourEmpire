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

    public ID(String textID)
    {
        String[] split = textID.split(":");
        addon = split[0];
        name = split[1];
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

    @Override
    public boolean equals(Object anObject)
    {
        return anObject instanceof ID && ((ID) anObject).getTextID().equals(getTextID());
    }
}
