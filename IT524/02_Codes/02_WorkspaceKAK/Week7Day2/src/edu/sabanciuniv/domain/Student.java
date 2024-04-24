package edu.sabanciuniv.domain;

public class Student {
	
	private int id;
	private String name;
	private String lastname;
	
	
	public Student(String name, String lastname) {
		super();
		this.name = name;
		this.lastname = lastname;
	}
	
	
	
	public Student() {
		super();
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
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", lastname=" + lastname + "]";
	}
	
	

}
