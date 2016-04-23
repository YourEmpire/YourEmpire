package pl.yourempire.client.addon;

import java.util.Map;

import pl.yourempire.api.addon.Addon;

public class AddonManager
{
    private static AddonManager ourInstance = new AddonManager();

    public static AddonManager getInstance()
    {
        return ourInstance;
    }

    private AddonManager()
    {
    }

    private Map<String, Addon> addons;

    public void registerAddon(Addon a)
    {
        if (addons.containsValue(a))
        {
            throw new IllegalArgumentException("Addon " + a.getAddonProperties().getProperty("name") + " is already registered!");
        }
        if (addons.containsKey(a.getAddonProperties().getProperty("name")))
        {
            throw new IllegalArgumentException("There is already an addon with name  " + a.getAddonProperties().getProperty("name") + "!");
        }
        addons.put(a.getAddonProperties().getProperty("name"), a);
    }

    public Addon getAddon(String name)
    {
        return addons.get(name);
    }

    public boolean isRegistered(String name)
    {
        return addons.containsKey(name);
    }

    public boolean isRegistered(Addon a)
    {
        return isRegistered(a.getAddonProperties().getProperty("name"));
    }

    public void enable(Addon a)
    {
        a.onEnable();
        a.setEnabled(true);
    }

    public void disable(Addon a)
    {
        a.onDisable();
        a.setEnabled(false);
    }
}
