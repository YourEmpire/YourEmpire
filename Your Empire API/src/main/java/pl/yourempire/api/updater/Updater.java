package pl.yourempire.api.updater;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 * Created by mikigal on 2016-04-29.
 */
public class Updater
{
    public static boolean isUpdate(String gameVersion) throws IOException {
        URL url = new URL("http://yourempire.com/version.txt"); //Maybe from GitHub?
        Scanner s = new Scanner(url.openStream());
        String newVersion = s.next();
        return gameVersion.equals(newVersion);
    }
    public static void downloadUpdate()
    {
        //TODO: Download update
    }
}
