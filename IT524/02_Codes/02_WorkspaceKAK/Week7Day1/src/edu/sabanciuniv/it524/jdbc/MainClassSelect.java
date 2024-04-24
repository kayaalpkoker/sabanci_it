package edu.sabanciuniv.it524.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MainClassSelect {

	public static void main(String[] args) {
		try {			
			String url = "jdbc:mysql://localhost/IT524";
			String username = "root";
			String password = "Sabanci99!!";
			Connection conn = DriverManager.getConnection(url, username, password);
			
			PreparedStatement ps = conn.prepareStatement("select * from students where id>?");
			
			ps.setInt(1,0);
			ResultSet resultSet =  ps.executeQuery();
			
			while(resultSet.next())
			{
				int id = resultSet.getInt("id");
				String n = resultSet.getString("name");
				String l = resultSet.getString("lastname");
				System.out.println(id+" ) "+n + " ---- "+ l);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
