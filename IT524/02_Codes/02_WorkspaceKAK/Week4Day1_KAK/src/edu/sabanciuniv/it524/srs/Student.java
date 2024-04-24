package edu.sabanciuniv.it524.srs;

import java.util.ArrayList;
import java.util.List;

public class Student extends Object{	// extends keyword'u inheritance için > GradStudent class'ına bak
										// her class, yazmasa da, "extends Object" barındırır
										// her class Object class'ına bağlıdır > java mimarisi
	private int id;
	private String name;
	private String lastname;
	
	// Bir class field'ı olarak ArrayList tanımlıyorum. Böylelikle her öğrenci objesi bir adres listesine sahip
	// Mevcut dizayn > Bir öğrencinin sınırsız adresi olabilir (one-to-many relationship)
	private ArrayList<Address> addresses = new ArrayList<Address>();


	
	public Student() {	
	}
	
	// Bir öğrenci objesi yaratırlırken başta adrese ihtiyaç yok, adresi constructor a eklemiyorum
	public Student(int id, String name, String lastname) {
		this.id = id;
		this.name = name;
		this.lastname = lastname;
	}

	
	//Adres ekleme
	public void addAddress(Address address) {
		this.addresses.add(address);
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
