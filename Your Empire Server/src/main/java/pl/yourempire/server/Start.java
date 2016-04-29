package pl.yourempire.server;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.logging.Logger;
import java.util.logging.StreamHandler;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import pl.yourempire.client.logger.YEFormatter;

public class Start
{
    public static final String VERSION = "0.1";
    public static File SERVERS_DIR;
    static Logger log;

    static
    {
        File dir = null;
        try
        {
            dir = new File(URLDecoder.decode(Start.class.getProtectionDomain().getCodeSource().getLocation().getPath() + "/servers", "UTF-8"));
        } catch (UnsupportedEncodingException e)
        {
            Logger.getLogger("Your Empire").severe("Fatal error! Can't set servers directory!");
            e.printStackTrace();
        }
        SERVERS_DIR = dir;

    }

    public static void main(String args[])
    {
        boolean parsed = false;
        Options o = new Options();
        o.addOption(Option.builder("h").longOpt("help").desc("Displays this help message.").build());
        o.addOption(Option.builder("s").longOpt("server").desc("Specifies server files to use (default Server)").build());
        addLogger("Your Empire");
        // Parsing...
        try
        {
            CommandLine cl = new DefaultParser().parse(o, args);
            if (cl.hasOption("h"))
            {
                HelpFormatter help = new HelpFormatter();
                help.printHelp("java -jar yourempire.jar", "Your Empire Server " + VERSION + " command line options", o, "Issues? Report them on GitHub - http://github.com/YourEmpire/YourEmpire/issues");
                System.exit(0);
            }

            if (cl.hasOption("c"))
            {
                // TODO - launching server configurator - main(String[])
            }
            if(cl.hasOption("s"))
            {
                String serverName = cl.getOptionValue("s");
                File serverDir = new File(SERVERS_DIR.getPath() + "/" + serverName);
                if(!serverDir.exists())
                {
                    log.info("Server " + serverName+ " does not exist! Creating one for you...");
                    serverDir.mkdir();
                    //Create server
                }
                //Loading map, saves...
            }
        } catch (ParseException e)
        {
            parsed = true;
        }
        log.info("Staring Your Empire server " + VERSION);
    }

    public static void addLogger(String name)
    {
        log = Logger.getLogger(name);
        log.setUseParentHandlers(false);
        log.addHandler(new StreamHandler(System.out, new YEFormatter()));
    }

    public static Logger getLogger()
    {
        return log;
    }
}
