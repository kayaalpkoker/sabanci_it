package edu.kayaalp.koker.q2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ProductDAO {
	
	public static final String url = "jdbc:mysql://localhost/IT524";
	public static final String username = "root";
	public static final String password = "Sabanci99!!";
	private Connection connection;

	
	public ProductDAO()
	{
		try {
			this.connection = DriverManager.getConnection(url, username, password);	
			
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
/*
	public void insertStudents() 
	{
		try (PreparedStatement ps = 
				this.connection.prepareStatement("insert into product (name,lastname) values(?,?)")) {
		
		for (int i=1; i<101; i++) { //100 adet ekleme yapmak için
			String name = "Ali"+i;
			String lastname = "Desidero"+i;
			ps.setString(1, name);
			ps.setString(2, lastname);
			ps.execute();
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
*/
	
}