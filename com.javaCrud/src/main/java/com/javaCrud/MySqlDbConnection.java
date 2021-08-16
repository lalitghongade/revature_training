package com.javaCrud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlDbConnection {
	
	private static Connection connection;
	
	
	public static Connection getConnection() throws ClassNotFoundException , SQLException{
		//step 1st registering driver using singleton design pattern
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/revature_practice";
		String username ="lala";
		String password ="lala";
		connection =DriverManager.getConnection(url,username,password);
		
		
		return connection;
		
	}

}
