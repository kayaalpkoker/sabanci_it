package edu.sabanciuniv.it524.ui.statictest;

public class MainClass {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Ahmet");
		
		s1.count = 1001;
		
		Student s2 = new Student(2, "Ali");
		
		System.out.println(s1.count);
		System.out.println(s2.count);
		System.out.println(Student.count);
		
		s2.count=999;
		
		
		System.out.println(s1.count);
		System.out.println(s2.count);
		System.out.println(Student.count);
		
		
	}

}
