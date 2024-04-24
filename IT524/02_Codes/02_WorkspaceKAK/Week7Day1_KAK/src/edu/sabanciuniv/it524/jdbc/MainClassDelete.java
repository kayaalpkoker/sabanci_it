package edu.sabanciuniv.it524.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClassDelete {

	public static final String url = "jdbc:mysql://localhost/IT524";
	public static final String username = "root";
	public static final String password = "Sabanci99!!";
	
	
	public static void main(String[] args) {
		
		try {			
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Bağlandık");
			
			
			PreparedStatement ps = conn.prepareStatement("delete from students where id > ?");
			ps.setInt(1, 1);
			
			
			int updatedRowCount = ps.executeUpdate(); //this method returns the row count for SQL DML statements
			System.out.println("Silinen satır sayısı : "+updatedRowCount);
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
