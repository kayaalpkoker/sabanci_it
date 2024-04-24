package edu.sabanciuniv.it524.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
public class MainClassDelete {
	public static void main(String[] args) {		
		try {			
			String url = "jdbc:mysql://localhost/IT524";
			String username = "root";
			String password = "1q2w3e4r";
			Connection conn = 
					DriverManager.getConnection(url, username, password);
			System.out.println("Bağlandık");
			PreparedStatement ps = 
					conn.prepareStatement("delete from students where id > ?");
			ps.setInt(1, 1);
			int updatedRowCount = ps.executeUpdate();
			System.out.println("Silinen satır sayısı : "+updatedRowCount);
		
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
