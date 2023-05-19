package Day13;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class C03_Log4j {


    public static void main(String[] args) {

        PropertyConfigurator.configure("log4j.properties");

        Logger logger = Logger.getLogger(C03_Log4j.class);

        // trace --> logger.trace("This is a trace message");
        logger.trace("This is a trace message");
        //debug --> logger.debug("This is a debug message");
        logger.debug("This is a debug message");
        //info --> logger.info("This is an info message");
        logger.info("This is an info message");
        //warn --> logger.warn("This is a warning message");
        logger.warn("This is a warning message");
        //error --> logger.error("This is an error message");
        logger.error("This is an error message");
        //fatal --> logger.fatal("This is a fatal message");
        logger.fatal("This is a fatal message");

    }




}
