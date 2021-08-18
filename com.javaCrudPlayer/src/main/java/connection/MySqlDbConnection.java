package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlDbConnection {
	private static Connection connection;
	
	
	private MySqlDbConnection()
	{	}
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/players";
        String username="lala";
        String password ="lala";
        
        
        connection = DriverManager.getConnection(url, username, password);
        
        return connection;
	}
	
	
}
