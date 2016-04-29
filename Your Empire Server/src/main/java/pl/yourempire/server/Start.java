package pl.yourempire.server;

import java.util.logging.Logger;

public class Start
{
    public static final String VERSION = "0.1";
    static final Logger log = Logger.getLogger("Your Empire");

    public static void main(String args[]){
        log.info("Staring Your Empire server " + VERSION + " Issues? Report them on GitHub - http://github.com/YourEmpire/YourEmpire/issues");
    }

    public static Logger getLogger(){
        return log;
    }
}
