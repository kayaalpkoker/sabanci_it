package edu.sabanciuniv.it524.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentDAO {

	public static final String url = "jdbc:mysql://localhost/IT524";
	public static final String username = "root";
	public static final String password = "Sabanci99!!";
	private Connection connection;

	
	public StudentDAO()
	{
		try {
			this.connection = DriverManager.getConnection(url, username, password);	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void insert(String text) {
		
		try (PreparedStatement ps = 
				this.connection.prepareStatement("insert into students (name,lastname) values(?,?)")) {
			
			String[] lines = text.split("\n");
			
			for (String line : lines) {
				String [] lineValues = line.split(" ");
				
				String name = "";
				for (int i = 1; i < lineValues.length-1; i++) { //15 kelimeli ispanyol isimleri de olabilir :)
					name += lineValues[i] + " ";
				}
				name = name.trim();
				
				String lastName = lineValues[lineValues.length-1];
				
				ps.setString(1, name);
				ps.setString(2, lastName);
				ps.executeUpdate();
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
