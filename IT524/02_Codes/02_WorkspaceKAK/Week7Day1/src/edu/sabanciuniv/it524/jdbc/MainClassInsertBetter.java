package edu.sabanciuniv.it524.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
public class MainClassInsertBetter {
	
	
	public static final String url = "jdbc:mysql://localhost/IT524";
	public static final String username = "root";
	public static final String password = "1q2w3e4r";
	
	
	public static void main(String[] args) {		
		try {			
		
			insertStudents();
			System.out.println("Student eklendi");
		} catch (Exception e) {
			System.err.println(e.getMessage());
			//e.printStackTrace();
			if (e.getMessage().contains("doesn't exist"))
			{
				createStudentTable();
				insertStudents();
			}
		}

	}
	
	private static void createStudentTable() {
		try
		{
		Connection conn = 
				DriverManager.getConnection(url, username, password);
		
		PreparedStatement ps = conn.prepareStatement("CREATE TABLE IT524.students ("
				+ "  id INT NOT NULL AUTO_INCREMENT,"
				+ "  name VARCHAR(100) NULL,"
				+ "  lastname VARCHAR(100) NULL,"
				+ "  PRIMARY KEY (id)); ");
		
		ps.execute();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void insertStudents() 
	{
		try {
		Connection conn = 
				DriverManager.getConnection(url, username, password);
		System.out.println("Bağlandık");
		
		for (int i=1;i<101;i++)
		{
			String name = "Ali"+i;
			String lastname = "Desidero"+i;
			PreparedStatement ps = 
					conn.prepareStatement("insert into students (name,lastname) values (?,?)");
			ps.setString(1, name);
			ps.setString(2, lastname);
			ps.execute();
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
