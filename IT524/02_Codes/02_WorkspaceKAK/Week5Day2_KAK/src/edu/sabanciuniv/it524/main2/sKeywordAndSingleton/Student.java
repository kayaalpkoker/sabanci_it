package edu.sabanciuniv.it524.main2.sKeywordAndSingleton;

public class Student {
	
	//static keyword'u kullandığınızda bu artık bireysel obje özelliğinden çıkıyor
	//tüm objeler için ortak bir attribute oluyor
	//static'ler genelde (%99) public olur

	
	/*
	 * SINGLETON DESIGN PATTERN
	 * 	> Ensure a class only has one instance, and provide a global point of access to it.


	 * Soru: Eğer sadece 1 adet class objesi yaratılabilmesini istiyorsam nasıl yaparım?
	 * 			> Singleton pattern ile
	 * 
	 * 1. Create a public-static field with class-object type
	 * 		> public static Student onlyStudent;
	 * 2. Create a private constructor
	 * 3. Create a public-static createObject() method to create objects, which controls if a single object already exists
	 */ 
	 
	
	
	// 1. Create a public-static field with class-object type
	public static Student onlyStudent = null; //null dememe gerek yoktu, field zaten objeye null geliyor
	private String name;
	
	// 2. Create a private constructor
	private Student(String name) {
		this.name = name;
	}
	
	// 3. Create a public-static createObject() method to create objects, which controls if a single object already exists
	//Why static? --> Detailed answer below --> TLDR: This method wants to access a static variable, it needs to be static
	public static Student createStudent(String name) {
		if(onlyStudent == null)
		{
			onlyStudent = new Student(name);
			return onlyStudent;
		}
		return onlyStudent;
	}
	
	/*
	 * Since the method createStudent(String name) needs to access the static variable onlyStudent and also needs 
	 * to return a reference to the Student object, it is defined as static. If the method would not have been 
	 * defined as static, it would have needed an object of the singleton class to access the static variable 
	 * onlyStudent and to return the reference of the singleton class object, which would have defeated the 
	 * purpose of singleton pattern.
	 */

	

	public static Student getOnlyStudent() {
		return onlyStudent;
	}

	public static void setOnlyStudent(Student onlyStudent) {
		Student.onlyStudent = onlyStudent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	
	
	
	
}