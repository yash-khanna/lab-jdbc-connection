package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		//load Driver Classs
		Class.forName("oracle.jdbc.OracleDriver");
		
		//Establishing Connection
		Connection con=null;
		
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl","system","oracle");
		
		return con;
	}



}
