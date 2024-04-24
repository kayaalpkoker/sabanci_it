package edu.sabanciuniv.it524.srs;

public class Address {
	
	private String street;
	private String doorNumber;
	private String city;
	private String country;
	
	
	public Address(String street, String doorNumber, String city, String country) {
		super();
		this.street = street;
		this.doorNumber = doorNumber;
		this.city = city;
		this.country = country;
	}

	
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getDoorNumber() {
		return doorNumber;
	}
	public void setDoorNumber(String doorNumber) {
		this.doorNumber = doorNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
	
	
	
}
