package com.schoolofnet.Java_Jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SetupDatabase {

    public static void main( String[] args ) throws SQLException
    {
        try {
			// Class.forName("com.mysql.jdbc.Driver"); // for backward compatibility
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Loaded");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Failed to Load");
			e.printStackTrace();
		}
        
        Connection connection = null;
        
        try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db?serverTimeZone=UTC&useSSL=false&allowPublicKeyRetrieval=true", "root", "***REMOVED***");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        if (connection == null) {
        	System.out.println("Connection failed");
        }
        
        // statement
        Statement statement = connection.createStatement();
        
        String sql = "CREATE TABLE IF NOT EXISTS movies (id INTEGER NOT NULL AUTO_INCREMENT, name VARCHAR(191) NOT NULL, PRIMARY KEY (id))";
        
//        String sql2 = "DROP TABLE movies";
        
//        statement.executeUpdate(sql2); // for DDL
        statement.executeUpdate(sql); // for DDL
//        statement.executeQuery(sql); // for DML
    }
}
