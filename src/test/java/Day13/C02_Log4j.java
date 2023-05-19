package Day13;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class C02_Log4j {


    public static void main(String[] args) {


        Logger logger = LogManager.getLogger(C02_Log4j.class.getName());

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
