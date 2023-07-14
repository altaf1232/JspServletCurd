package com.curdoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionClass {

	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.jdbc.Driver");                                          //database Name testdb
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "root");

		return connection;

	}

}
