package com.curdoperation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DaoImplements implements DaoInterface {

	static Connection connection = null;

	@Override
	public void saveData(PogoEmlpyee pogoEmlpyee) {

		try {
			connection = DBConnectionClass.getConnection();
			PreparedStatement stmt = connection.prepareStatement("insert into Emp values(?,?,?,?)");
			stmt.setInt(1, pogoEmlpyee.getId());
			stmt.setString(2, pogoEmlpyee.getName());
			stmt.setString(3, pogoEmlpyee.getEmail());
			stmt.setString(4, pogoEmlpyee.getAddress());
			int i = stmt.executeUpdate();
			if (i > 0) {
				System.out.println("data is inserted");

			} else {
				System.out.println("data is not inserted");
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
