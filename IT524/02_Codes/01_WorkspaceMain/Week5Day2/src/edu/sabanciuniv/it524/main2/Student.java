package edu.sabanciuniv.it524.main2;


//Singleton design pattern
public class Student {
	
	public static Student onlyStudent = null;
	private String name;
	private Student(String name)
	{
		this.name = name;
	}
	public static Student createStudent(String name)
	{
		
		if(onlyStudent == null)
		{
			onlyStudent = new Student(name);
			return onlyStudent;
		}
		return onlyStudent;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	

}
