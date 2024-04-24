package edu.sabanciuniv.it524.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClassDropTable {

	public static final String url = "jdbc:mysql://localhost/IT524";
	public static final String username = "root";
	public static final String password = "Sabanci99!!";
	
	
	public static void main(String[] args) {
		
		try {			
			Connection conn = DriverManager.getConnection(url, username, password);
			System.out.println("Bağlandık");
			
			//PreparedStatement ps = conn.prepareStatement("drop table students");
			//int updatedRowCount = ps.executeUpdate();
			System.out.println("Tablo gitti : ");
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
