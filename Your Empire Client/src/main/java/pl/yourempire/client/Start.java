package pl.yourempire.client;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URLDecoder;
import java.util.Locale;
import java.util.Properties;
import java.util.logging.Logger;
import java.util.logging.StreamHandler;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import pl.yourempire.client.logger.YEFormatter;

public final class Start
{
    public static final String VERSION = "0.1";
    public static final File EXEC_JAR_DIR;


    static
    {
        File dir = null;
        try
        {
            dir = new File(URLDecoder.decode(Start.class.getProtectionDomain().getCodeSource().getLocation().getPath(), "UTF-8"));
        } catch (UnsupportedEncodingException e)
        {
            Logger.getLogger("Your Empire").severe("Fatal error! Can't set jar execution directory!");
            e.printStackTrace();
        }
        EXEC_JAR_DIR = dir;

    }

    public static Locale langugage = Locale.getDefault();
    private static boolean gameLoaded;

    protected static Properties gameProps;
    private Start()
    {
    }

    public static void main(String[] args) throws MalformedURLException
    {
        boolean parsed = false;
        Options o = new Options();
        o.addOption(Option.builder("h").longOpt("help").desc("Displays this help message.").build());
        o.addOption(Option.builder("s").longOpt("server").desc("Enables YE server configuration").build());
        
        // Parsing...
        try
        {
            CommandLine cl = new DefaultParser().parse(o, args);
            if (cl.hasOption("h"))
            {
                HelpFormatter help = new HelpFormatter();
                help.printHelp("java -jar yourempire.jar", "Your Empire " + VERSION + " command line options", o, "Issues? Report them on GitHub - http://github.com/YourEmpire/YourEmpire/issues");
                System.exit(0);
            }
            
            if (cl.hasOption("s"))
            {
                // TODO - launching server configurator - main(String[])
            }
            
        }
        catch (ParseException e)
        {
            parsed = true;
        }
        
        System.out.println("Starting Your Empire " + VERSION + "...");
        // Creating default logger
        Logger log = Logger.getLogger("Your Empire");

        if (! parsed)
        {
            log.severe("Command line has not been parsed!");
        }
    }

    public static void addLogger(String name)
    {
        Logger log = Logger.getLogger("Your Empire");
        log.setUseParentHandlers(false);
        log.addHandler(new StreamHandler(System.out, new YEFormatter()));
    }

    public String getGameProperty(String name)
    {
        return gameProps.getProperty(name);
    }

    public boolean isGameLoaded()
    {
        return gameLoaded;
    }
}
