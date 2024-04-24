package edu.sabanciuniv.it524.mainfinal2;

public class Student {
	
	private final int id ;
	
	private String name;
	

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
