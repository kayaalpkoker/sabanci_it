package edu.sabanciuniv.it524.oop.features;

import edu.sabanciuniv.it524.oop.features.encapsulation.Instructor;
import edu.sabanciuniv.it524.oop.features.encapsulation.Student;

public class MainClass {

	public static void main(String[] args) {
		/*
		 * Object Oriented Programming Language Features
		 * 
		 * 1) Abstraction
		 * 
		 * 2) Encapsulation
		 * 
		 * 3) Inheritance
		 * 
		 * 4) Polymorphism
		 *
		 */
		
		Student student1 = new Student(1,"Ahmet","Demirelli",100,100);
		
		System.out.println(student1.getId());
		
		
		
		Instructor i2 = new Instructor("Ahmet", "Demirelli", true,"Sabanci University", "Istanbul");
		
		
		System.out.println(i2.toString());
		i2.setName("Dersimiz");
		i2.setLastName("Bitti");
		
		System.out.println(i2.toString());
	


	}

}
