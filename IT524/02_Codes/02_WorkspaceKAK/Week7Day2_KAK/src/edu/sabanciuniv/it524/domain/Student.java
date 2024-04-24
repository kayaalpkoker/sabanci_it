package edu.sabanciuniv.it524.domain;

public class Student {
	
	private int id;
	private String name;
	private String lastName;
	
	public Student() {
		super();
	}

	public Student(String name, String lastName) { //MySQL tablomu yaratırken "id" sütunu için auto-increment demiştim
												   //o yüzden "int id" diye bir parametre eklemiyorum!
		super();
		this.name = name;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", lastName=" + lastName + "]";
	}
	
	
	
	
	
	
	
	
}
