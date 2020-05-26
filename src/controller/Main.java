package controller;

import java.sql.Connection;
import java.sql.SQLException;

import utility.ConnectionManager;

public class Main {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		
	// Fill your code
		Connection c=null;
		ConnectionManager cm=new ConnectionManager();
		c=cm.getConnection();
		if(c!=null) {
			System.out.println("Connection Established");
		}else {
			System.out.println("Check your Connection");
		}
	}
}
