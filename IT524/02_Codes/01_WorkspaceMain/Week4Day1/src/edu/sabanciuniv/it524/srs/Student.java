package edu.sabanciuniv.it524.srs;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private int id;
	private String name;
	private String lastname;

	
	private ArrayList<Address> addresses = new ArrayList<Address>();

	
	
	public Student()
	{
		super();
	}
	
	public void addAddress(Address adres)
	{
		this.addresses.add(adres);
	}
	
	public Student(int id, String name, String lastname) {
		this.id = id;
		this.name = name;
		this.lastname = lastname;
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

	public ArrayList<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(ArrayList<Address> addresses) {
		this.addresses = addresses;
	}
	
public void printInfo() {
		System.out.println("-----------------------------------------");
		System.out.println("Student id : "+this.getId());
		System.out.println("Student name : "+this.getName());
		System.out.println("Student lastname : "+this.getLastname());
		System.out.println("-----------------------------------------");
		System.out.println("											");

	}
	

//Overloading
public void printInfo(String abc) {
	System.out.println("-----------------------------------------");
	System.out.println("Student id : "+this.getId());
	System.out.println("Student name : "+this.getName());
	System.out.println("Student lastname : "+this.getLastname());
	System.out.println("-----------------------------------------");
	System.out.println("											");

}
	



}
