package edu.sabancuniv.it524.domain;

public abstract class Vehicle {
	
	private String owner;
	
	
	
	public Vehicle() {
		super();
	}

	public Vehicle(String owner)
	{
		this.owner = owner;
	}
	
	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public abstract void go();

}
