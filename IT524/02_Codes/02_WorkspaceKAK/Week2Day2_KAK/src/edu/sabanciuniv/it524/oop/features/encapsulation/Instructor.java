package edu.sabanciuniv.it524.oop.features.encapsulation;

public class Instructor {
	
	private String name;
	private String lastName;
	private boolean great;
	private String university;
	private String city;
	
	/*
	 Constructor ve get() ile set() methodlarını auto-generate edebiliyoruz
	 
	 Terminal içinde:
	 * sağ click > source > generate Getters and Setters 
	 * sağ click > source > generate Constructor using Fields
	 * sağ click > source > generate toString()

	 */
	
	public Instructor() {
		
	}

	public Instructor(String name, String lastName, boolean great, String university, String city) {

		this.name = name;
		this.lastName = lastName;
		this.great = great;
		this.university = university;
		this.city = city;
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

	public boolean isGreat() {
		return great;
	}

	public void setGreat(boolean great) {
		this.great = great;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Instructor [name=" + name + ", lastName=" + lastName + ", great=" + great + ", university=" + university
				+ ", city=" + city + "]";
	}
	
	
	
	
	
	
	
	
}
