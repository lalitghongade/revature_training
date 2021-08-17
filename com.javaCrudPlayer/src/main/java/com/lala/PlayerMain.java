package com.lala;

import java.util.Scanner;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PlayerMain {
	private static final Logger log = Logger.getLogger(PlayerMain.class);
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//log4j error Quick solution
		String log4jConfPath = "/home/lala/Documents/revature/my_practice/com.javaCrudPlayer/src/main/resources/log4j2.Properties";
		PropertyConfigurator.configure(log4jConfPath);
		
		
		//Scanner object for taking input
		Scanner scanner = new Scanner(System.in);
		int choice =0;
		log.debug("choice == "+choice);
		
		  log.info("Info level log message");
	      log.debug("Debug level log message");
	      log.error("Error level log message");
		
	}

}
