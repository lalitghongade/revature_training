package com.lala;
import java.io.Console;
import java.util.Arrays;
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
		
		
		//failed trails of string masking in command line
		//String password =new jline.ConsoleReader().readLine(new Character('*'));;
		//log.debug("choice == "+password);
		//Console console = System.console() ;

		//char [] password = console.readPassword("Enter password: ");
		//System.out.println("Password was: " + Arrays.toString(password));
		//Arrays.fill(password,' ');
		//log.info("Info level log message"+password);
	      log.debug("Debug level log message");
	      log.error("Error level log message");
		
	}

}
