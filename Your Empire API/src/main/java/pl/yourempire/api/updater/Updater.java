package pl.yourempire.api.updater;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by mikigal on 2016-04-29.
 */
public class Updater
{
    public static boolean isUpdate(String gameVersion, UpdateEnum update) throws IOException {
        URL url = null;
        if(update.equals(UpdateEnum.CLIENT))
        {
            url = new URL("http://yourempire.com/version-client.txt"); //Maybe from GitHub?
        }
        else if(update.equals(UpdateEnum.SERVER))
        {
            url = new URL("http://yourempire.com/version-server.txt");
        }
        Scanner s = new Scanner(url.openStream());
        String newVersion = s.next();
        s.close();
        return gameVersion.equals(newVersion);
    }

    public static String getNewVersion(UpdateEnum update) throws IOException
    {
        URL url = null;
        if(update.equals(UpdateEnum.CLIENT))
        {
            url = new URL("http://yourempire.com/version-client.txt"); //Maybe from GitHub?
        }
        else if(update.equals(UpdateEnum.SERVER))
        {
            url = new URL("http://yourempire.com/version-server.txt");
        }
        Scanner s = new Scanner(url.openStream());
        String newVersion = s.next();
        s.close();
        return newVersion;
    }

    public static void downloadUpdate(UpdateEnum update) throws IOException
    {
        URL url = null;
        if(update.equals(UpdateEnum.CLIENT))
        {

        }
        else if(update.equals(UpdateEnum.SERVER))
        {

        }
        //TODO: Download update
    }
}
