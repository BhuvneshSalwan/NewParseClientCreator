package com.back4app.main;

import java.util.Date;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 *
 * @author H0020 Description - used to perform logging of the whole application
 */

public class LogManager {

	public static LogManager logger;
	private static final String FILE_NAME = "log4j.properties";

	public static LogManager getInstance() {
		if (logger == null) {
			logger = new LogManager();
		}
		return logger;
	}

	public LogManager() {
		try {
			Properties logProperties = new Properties();
			// File f = new File("");
			// java.io.InputStream is =
			// getClass().getResourceAsStream("/"+FILE_NAME);
			// java.io.InputStream is = new FileInputStream(new File((new
			// StringBuilder()).append(f.getAbsolutePath()).append(File.separator).append("/"+FILE_NAME).toString()));
			// logProperties.load(is);
			// PropertyConfigurator.configure(logProperties);
			// System.out.println("Property file configured..");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void log(String className, String message) {
		Logger logger = Logger.getLogger(className);
		logger.info(message);

	}

	public void debug(String className, String message) {
		Logger logger = Logger.getLogger(className);
		logger.debug(message);

	}

	public void error(String className, Exception e) {
		Logger logger = Logger.getLogger(className);
		// logger.setLevel(Level.ALL);
		StringBuffer bf = new StringBuffer();
		bf.append(e.toString());
		for (int i = 0; i < e.getStackTrace().length; i++) {
			bf.append("\n").append(e.getStackTrace()[i].toString());

		}
		bf.append("\n").append(new Date());
		logger.error("ERROR::" + bf.toString());
	}

}
