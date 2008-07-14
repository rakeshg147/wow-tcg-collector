package common;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Logs {

	public static Logger logger = Logger.getLogger(Main.class);

	public static void start() {
		
		
		// Set up a simple configuration that logs on the console.
	    BasicConfigurator.configure();
		Logs.logger.info("Logs started");
	}

}
