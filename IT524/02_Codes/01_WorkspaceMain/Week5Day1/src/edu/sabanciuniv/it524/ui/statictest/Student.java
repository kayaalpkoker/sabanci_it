package edu.sabanciuniv.it524.ui.statictest;

public class Student {
	
	public static int count;
	
	private int id;
	private String name;
	
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	

}
