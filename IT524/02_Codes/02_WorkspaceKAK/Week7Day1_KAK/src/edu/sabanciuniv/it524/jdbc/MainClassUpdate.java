package edu.sabanciuniv.it524.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClassUpdate {

	public static final String url = "jdbc:mysql://localhost/IT524";
	public static final String username = "root";
	public static final String password = "Sabanci99!!";
	
	
	public static void main(String[] args) {
		
		try {			
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Bağlandık");
			
			
			PreparedStatement ps = conn.prepareStatement("update students set name=? where id =?");
			
			ps.setString(1, "Ahmet");
			ps.setInt(2, 1);
			//Query işlemleri için iki metod kullandım > 1- prepareStatement() 2- setString/Int()
			
			
			int updatedRowCount = ps.executeUpdate(); //this method returns the row count for SQL DML statements
			System.out.println("Değişen satır sayısı : "+updatedRowCount);
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
