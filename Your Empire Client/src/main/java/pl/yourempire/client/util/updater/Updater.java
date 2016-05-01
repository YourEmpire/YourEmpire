package pl.yourempire.client.util.updater;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

import pl.yourempire.client.Start;

/**
 * This updater is used, when <b>client</b> wants to check latest version, or download updater
 */
public class Updater
{
    public static final String LATEST_UPDATE_URL = "https://raw.githubusercontent.com/YourEmpire/YourEmpire/VERSION";

    private Updater()
    {
    }

    public static boolean isUpdateAvailable() throws IOException
    {
        Scanner in = new Scanner(new URL(LATEST_UPDATE_URL).openStream());
        String latest = in.nextLine();
        in.close();
        return latest.equalsIgnoreCase(Start.VERSION);
    }
}
