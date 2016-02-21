package pl.yourempire.client;

import java.io.IOException;
import java.util.Locale;
import java.util.Properties;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.StreamHandler;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import pl.yourempire.api.logger.YEFormatter;

public final class Start
{
    public static final String VERSION = "0.1";
    public static Locale langugage = Locale.ENGLISH;

    protected static Properties gameProps;
    protected static boolean debug = false;
    private Start()
    {
    }
    
    public static void main(String[] args)
    {
        boolean notParsed = false;
        Options o = new Options();
        o.addOption(Option.builder("h").longOpt("help").desc("Displays this help message.").build());
        o.addOption(Option.builder("d").longOpt("debug").desc("Enables logging messages to log file").build());
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
            
            if (cl.hasOption("d"))
            {
                debug = true;
            }
            
            if (cl.hasOption("s"))
            {
                // TODO - launching server configurator - main(String[])
            }
            
        }
        catch (ParseException e)
        {
            notParsed = true;
        }
        
        System.out.println("Starting Your Empire " + VERSION + "...");
        
        // Creating default logger
        Logger log = Logger.getLogger("Your Empire");
        log.setUseParentHandlers(false);
        log.addHandler(new StreamHandler(System.out, new YEFormatter()));
        
        if (notParsed)
        {
            log.severe("Command line has not been parsed!");
        }
        
        if (debug)
        {
            log.info("Enabling debug mode...");
            try
            {
                log.addHandler(new FileHandler());
                
            }
            catch (SecurityException | IOException e)
            {
                log.log(Level.SEVERE, "Cannot start debug mode!", e);
            }
        }
        
    }
}
