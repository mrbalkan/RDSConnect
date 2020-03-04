package net.muratbalkan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class RDSConnect {
	public static void main(String[] args) {
		Properties properties = new Properties();
		properties.setProperty("sslMode", "VERIFY_IDENTITY");
		properties.setProperty("useSSL", "true");
		properties.setProperty("requireSSL", "true");
		properties.setProperty("verifyServerCertificate", "true");
		properties.put("user", "user");
		properties.put("password", "pass");
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	        return;
	    }
	    Connection connection = null;
	    String DBHOST="rds host";
	    String DBNAME="";
	    String connStr="jdbc:mysql://"+DBHOST+":3306/"+DBNAME;
	    try {
	        connection = DriverManager.getConnection(connStr, properties);
	    } catch (SQLException e) {
	    	e.printStackTrace();
	    }
	    if (connection != null) 
	        System.out.println("SUCCESS!");
	    
	}
}
