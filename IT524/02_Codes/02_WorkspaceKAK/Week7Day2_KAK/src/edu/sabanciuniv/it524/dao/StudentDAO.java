package edu.sabanciuniv.it524.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import edu.sabanciuniv.it524.domain.Student;

public class StudentDAO {

	public static final String url = "jdbc:mysql://localhost/IT524";
	public static final String username = "root";
	public static final String password = "Sabanci99!!";
	private Connection connection;

	
	public StudentDAO()
	{
		try {
			this.connection = DriverManager.getConnection(url, username, password);	
			System.out.println("Connection successful!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void insert(Student student) {
		try {
			PreparedStatement ps = this.connection.prepareStatement("insert into students (name,lastname) values(?,?)");
			ps.setString(1, student.getName());
			ps.setString(2, student.getLastName());
			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public void delete(int studentId) {
		try {
			PreparedStatement ps = this.connection.prepareStatement("delete from students where id =?");
			ps.setInt(1, studentId);
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// select işlemi yapıyorsam her zaman ResultSet olacaak!
	public Student findById(int studentId) {
		try {
			PreparedStatement ps = this.connection.prepareStatement("select * from students where id =?");
			
			ps.setInt(1, studentId);
			
			ResultSet resultSet = ps.executeQuery();
			resultSet.next(); //select statement'ını execute ederken where=id'deki id'yi okutmak için next() diyorum
			
			//ResultSet ile 
			int id = resultSet.getInt("id");
			String name = resultSet.getString("name"); //String getString(String columnLabel) throws SQLException;
			String lastName = resultSet.getString("lastname");
			
			Student student = new Student(name,lastName);
			student.setId(id); //Constructor'ımda id olmadığı için metod'la id değerini set ediyorum
			return student;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null; //return null = bu id'de biri olmasaydı dönecek değer?
	}

	
	//select * from ... query'si
	public List<Student> findAll() {	// birden fazla değer döneceği için bir ArrayList yaratıyorum
		
		List<Student> allStudents = new ArrayList<>();
		
		
		try {
			PreparedStatement ps = this.connection.prepareStatement("select * from students");
			ResultSet resultSet = ps.executeQuery();
			
			while (resultSet.next()) {
				int id = resultSet.getInt("id");
				String name = resultSet.getString("name"); //String getString(String columnLabel) throws SQLException;
				String lastName = resultSet.getString("lastname");
				
				Student student = new Student(name,lastName);
				student.setId(id); //Constructor'ımda id olmadığı için metod'la id değerini set ediyorum
				allStudents.add(student);
			}
			return allStudents;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
	
	//Bu DAO içindeki tüm metodları yazdıktan sonra tüm diğer tablo DAO'larına uygulanabilir
	
	
}
