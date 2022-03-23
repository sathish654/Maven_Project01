package com.Logger_File;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Property_configuration {
	
	static Logger log = Logger.getLogger(Property_configuration.class);
	
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		log.debug("debug");
		log.info("information");
		log.warn("warning");
		log.error("err");
		log.fatal("fatal");
		
		
	}

}
