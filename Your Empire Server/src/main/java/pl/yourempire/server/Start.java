package pl.yourempire.server;

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
    static final Logger log = Logger.getLogger("Your Empire");

    public static void main(String args[])
    {
        boolean parsed = false;
        Options o = new Options();
        o.addOption(Option.builder("h").longOpt("help").desc("Displays this help message.").build());
        o.addOption(Option.builder("s").longOpt("server").desc("Specifies server files to use (default Server)").build());
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

        } catch (ParseException e)
        {
            parsed = true;
        }
        addLogger("Your Empire");
        log.info("Staring Your Empire server " + VERSION);

    }

    public static void addLogger(String name)
    {
        Logger log = Logger.getLogger(name);
        log.setUseParentHandlers(false);
        log.addHandler(new StreamHandler(System.out, new YEFormatter()));
    }

    public static Logger getLogger()
    {
        return log;
    }
}
