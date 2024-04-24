package edu.sabanciuniv.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import edu.sabanciuniv.domain.Student;

public class StudentDAO {

	public static final String url = "jdbc:mysql://localhost/IT524";
	public static final String username = "root";
	public static final String password = "1q2w3e4r";
	private Connection connection;
	
	public StudentDAO()
	{
		try {
			this.connection = 
					DriverManager.getConnection(url, username, password);	
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public void insert(Student player1) {
		try {
			PreparedStatement ps =
		this.connection.
		prepareStatement("insert into students (name,lastname) values(?,?)");
		ps.setString(1, player1.getName());
		ps.setString(2, player1.getLastname());
		ps.executeUpdate();
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void delete(int studentId) {
		try {
			PreparedStatement ps =
		this.connection.
		prepareStatement("delete from students where id =?");
		ps.setInt(1, studentId);
		ps.executeUpdate();
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}



	public Student findById(int studentId) {
		
		try {
			PreparedStatement ps =
		this.connection.
		prepareStatement("select * from students where id =?");
		ps.setInt(1, studentId);
		ResultSet rs = ps.executeQuery();
		rs.next();
		
		int id = rs.getInt("id");
		String n = rs.getString("name");
		String l = rs.getString("lastname");
		
		Student student = new Student(n, l);
		student.setId(id);
		return student;
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}



	public List<Student> findAll() {
		List<Student> allStudents = new ArrayList<>();
		try {
			PreparedStatement ps =
		this.connection.
		prepareStatement("select * from students");
		ResultSet rs = ps.executeQuery();
		while(rs.next())
		{
			int id = rs.getInt("id");
			String n = rs.getString("name");
			String l = rs.getString("lastname");
			
			Student student = new Student(n, l);
			student.setId(id);
			allStudents.add(student);
		}
		return allStudents;
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
