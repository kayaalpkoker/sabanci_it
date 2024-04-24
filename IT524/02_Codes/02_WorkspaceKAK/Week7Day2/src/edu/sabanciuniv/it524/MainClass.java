package edu.sabanciuniv.it524;

import java.util.List;

import edu.sabanciuniv.dao.StudentDAO;
import edu.sabanciuniv.domain.Student;

public class MainClass {

	public static void main(String[] args) {
		
		
		
		Student player1 = new Student( "Cristiano", "Ronaldo");
		Student player2 = new Student( "Lionel", "Messi");
		Student player3 = new Student( "Ahmet", "Demirelli");
		
		StudentDAO sDao = new StudentDAO();
		
		sDao.insert(player1);
		sDao.insert(player2);
		sDao.insert(player3);
		
		sDao.delete(102);
		
		Student ahmet = sDao.findById(101);
		System.out.println("FindBy ID 101 "+ahmet);
		
		List<Student> all = sDao.findAll();
		System.out.println("----ALL ------");
		for (Student s : all)
		{
			System.out.println(s);
		}
		
		
		
		
		
		
		

	}

}
