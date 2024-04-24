package edu.sabanciuniv.it524.main2.sKeywordAndSingleton;

import java.util.Random;

public class MainClass {

	public static void main(String[] args) {
		
		//Singleton design pattern sonrası test
		
		
		// static field ve metodlara class adı veya obje ref'i ile ulaşıyoruz
		// ancak best practice class adı ile ulaşmak, bu sayede ilgili field/metodun static olduğu anlaşılıyor
		Student s1 = Student.createStudent("Ahmet");
		
		System.out.println(s1);
		System.out.println(Student.onlyStudent.getName());
		
		
		//Singleton pattern implement ettiğimiz için createStudent() yeni öğrenci yaratmıyor
		Student s2 = Student.createStudent("Caner");		
		System.out.println(s2);
		
	}

}
