package edu.sabanciuniv.it524.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class MainClassInsertBetterCode {

	//url, username, password birçok metodda kullandığım için global değişken olarak yaratıyorum
	public static final String url = "jdbc:mysql://localhost/IT524";
	public static final String username = "root";
	public static final String password = "Sabanci99!!";
	
	
	public static void main(String[] args) {
		
		try {			
			insertStudents();
			System.out.println("Student eklendi");
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
			//e.printStackTrace();
			if (e.getMessage().contains("doesn't exist")) { //Buradaki if'i en başa yazamıyoruz çünkü tablo olup olmadığını
															//anlayabilmek için bir sorgu göndermemiz gerekiyor
				createStudentTable();
				insertStudents();
			}
		}
	}
	//main metodundan çıktım
	

	private static void createStudentTable() {
		try {
		Connection conn = DriverManager.getConnection(url, username, password);
		
		//Statement objesi yerine PreparedStatement objesi kullanıyorum
		//Güvenli seçenek bu!
		PreparedStatement ps = conn.prepareStatement("CREATE TABLE IT524.students ("
				+ "  id INT NOT NULL AUTO_INCREMENT,"
				+ "  name VARCHAR(100) NULL,"
				+ "  lastname VARCHAR(100) NULL,"
				+ "  PRIMARY KEY (id)); ");
		
		ps.execute();
		
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	
	public static void insertStudents() 
	{
		try {
		Connection conn = DriverManager.getConnection(url, username, password);
		System.out.println("Bağlandık");
		
		for (int i=1; i<101; i++) { //100 adet ekleme yapmak için
			String name = "Ali"+i;
			String lastname = "Desidero"+i;
			PreparedStatement ps = conn.prepareStatement("insert into students (name,lastname,age) values (?,?,?)");
			ps.setString(1, name);
			ps.setString(2, lastname);
			ps.execute();
		}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}	
	
	
}
