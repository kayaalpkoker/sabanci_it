package edu.sabanciuniv.it524.domain;

///abstract class için "abstract" keyword ekledim
public abstract class Vehicle {
	
	private String owner;
	
	
	public Vehicle() {
	}	
	
	public Vehicle(String owner) {
		this.owner = owner;
	} 

	//abstract method için "abstract" keyword ekledim
	//bir tane bile abstract metod olunca class'a abstract keyword eklemek zorundayız
	public abstract void go();

	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	
}
