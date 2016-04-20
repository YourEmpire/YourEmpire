package pl.yourempire.client.addon;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import pl.yourempire.api.addon.Addon;

public class AddonRegistry
{
    private static Map<String, Addon> addons = new HashMap<>();

    public static void register(Addon a)
    {
        if (addons.containsValue(a))
        {
            throw new IllegalArgumentException("Addon " + a.getAddonProperties().getProperty("name") + " is already registered!");
        }
        addons.put(a.getAddonProperties().getProperty("name"), a);
    }

    public static Addon get(String name)
    {
        return addons.get(name);
    }

    public static Collection<Addon> list()
    {
        return addons.values();
    }


}
