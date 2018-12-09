package com.revature.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.log4j.Logger;

public class Connector {
	
	final static Logger cLogger = Logger.getLogger(Connector.class);

	public static Connection getConnection() throws SQLException {
		try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException e) {
        	cLogger.error(e.getMessage());
            e.printStackTrace();
        }
		String url = "jdbc:oracle:thin:@[ENDPOINT]:1521:ORCL"; 
		String user = USERNAME; 
		String pass = PASSWORD;
		// enter these locally
		return DriverManager.getConnection(url, user, pass); // establish connection
	}
	
}
