package pl.yourempire.client.addon;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Properties;
import java.util.jar.JarFile;

import pl.yourempire.api.addon.Addon;
import pl.yourempire.client.Start;

public class JavaAddonLoader extends AddonLoader
{
    private static JavaAddonLoader ourInstance = new JavaAddonLoader();

    public static JavaAddonLoader getInstance()
    {
        return ourInstance;
    }

    private JavaAddonLoader()
    {
    }

    @Override
    public Addon load(File f) throws IOException
    {
        JarFile jar = new JarFile(f);
        Properties addonProps = new Properties();
        if (jar.getInputStream(jar.getJarEntry("addon.properties")) == null)
        {
            throw new BadAddonException("Corrupted addon file! Null addon properties!");
        }
        addonProps.load(jar.getInputStream(jar.getJarEntry("addon.properties")));
        URLClassLoader jarLoader = new URLClassLoader(new URL[]{f.toURI().toURL()}, getClass().getClassLoader());
        Class<? extends Addon> addonMain = null;
        try
        {
            addonMain = (Class<? extends Addon>) Class.forName(addonProps.getProperty("main"), true, jarLoader);
        } catch (ClassNotFoundException e)
        {
            throw new BadAddonException("Could not find main class file!", e);
        }
        Addon addon = null;
        try
        {
            addon = addonMain.newInstance();
        } catch (InstantiationException | IllegalAccessException e)
        {
            throw new BadAddonException("Could not create new instance of " + addonMain.getName() + "!", e);
        }
        try
        {
            Field dataFolder = addon.getClass().getDeclaredField("dataFolder");
            dataFolder.setAccessible(true);
            dataFolder.set(addon, new File(Start.EXEC_JAR_DIR, "addons" + File.separator + addonProps.getProperty("name")));
            Field addonPropsField = addon.getClass().getDeclaredField("addonProps");
            addonPropsField.setAccessible(true);
            addonPropsField.set(addon, addonProps);
        } catch (NoSuchFieldException | IllegalAccessException e)
        {
            throw new BadAddonException(e);
        }
        AddonRegistry.register(addon);
        addon.onLoad();
        addon.setLoaded(true);
        return addon;
    }
}
