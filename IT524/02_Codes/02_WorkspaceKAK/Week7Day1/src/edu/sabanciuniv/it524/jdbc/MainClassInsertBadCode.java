package edu.sabanciuniv.it524.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class MainClassInsertBadCode {
	public static void main(String[] args) {		
		try {			
			String url = "jdbc:mysql://localhost/IT524";
			String username = "root";
			String password = "1q2w3e4r";
			Connection conn = 
					DriverManager.getConnection(url, username, password);
			System.out.println("Bağlandık");
			String name = "';-- ; drop table students;";
			String lastname = "Desidero";
			Statement statement = conn.createStatement();
			statement.execute("insert into students (name,lastname) values ('"+name+"','"+lastname+"')");
			System.out.println("Student eklendi");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
