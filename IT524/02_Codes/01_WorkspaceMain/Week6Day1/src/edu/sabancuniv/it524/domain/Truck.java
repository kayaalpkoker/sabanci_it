package edu.sabancuniv.it524.domain;

public class Truck extends Vehicle implements Insurable {

	public Truck(String owner) {
		super(owner);
	}
	
	@Override
	public void go() {
		
		System.out.println(this.getOwner() + "`s Truck is going");
		
	}
	
	@Override
	public void getInsured() {
		System.out.println(this.getOwner() + "`s Truck is Insured by ???");
		
	}
	

}
