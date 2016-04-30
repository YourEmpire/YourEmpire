package pl.yourempire.api.updater;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.util.Scanner;

/**
 * Created by mikigal on 2016-04-29.
 */
public class Updater
{
    public static final String API_VERSION = "0.1"; //API version

    public static boolean isUpdate(String installedVersion, UpdateEnum update) throws IOException {
        return installedVersion.equals(getNewVersion(update));
    }

    public static String getNewVersion(UpdateEnum update) throws IOException
    {
        URL url = null;
        if(update.equals(UpdateEnum.CLIENT))
        {
            url = new URL("https://raw.githubusercontent.com/YourEmpire/YourEmpire/master/Your%20Empire%20Client/src/main/resources/version-client.txt"); //Maybe from GitHub?
        }
        else if(update.equals(UpdateEnum.SERVER))
        {
            url = new URL("https://raw.githubusercontent.com/YourEmpire/YourEmpire/master/Your%20Empire%20Server/src/main/resources/version-server.txt");
        }
        else if(update.equals(UpdateEnum.API))
        {
            url = new URL("https://raw.githubusercontent.com/YourEmpire/YourEmpire/master/Your%20Empire%20API/src/main/resources/version-api.txt");
        }
        Scanner s = new Scanner(url.openStream());
        String newVersion = s.next();
        s.close();
        return newVersion;
    }

    public static File downloadUpdate(File downloadDir, UpdateEnum update) throws IOException
    {
        URL url = null;
        File download;
        if(update.equals(UpdateEnum.CLIENT))
        {

        }
        else if(update.equals(UpdateEnum.SERVER))
        {

        }
        else if(update.equals(UpdateEnum.API))
        {

        }
        Files.copy(url.openStream(), downloadDir.toPath()); //Can it work?
        return new File(downloadDir + "/updater.jar");
        //TODO: Download update
    }

    public static String getApiVersion(){
        return API_VERSION;
    }
}
