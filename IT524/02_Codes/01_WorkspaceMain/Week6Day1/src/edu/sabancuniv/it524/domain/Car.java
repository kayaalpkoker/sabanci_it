package edu.sabancuniv.it524.domain;

public class Car extends Vehicle implements Insurable{
	
	public Car(String owner) {
		//super(owner); Böyle de olur
		super();    //Yukarıdaki tek satır yerine 
		this.setOwner(owner); // Bu iki satır yazılabilir
	}

	@Override
	public void go() {
		
		System.out.println(this.getOwner() + "`s Car is going");
		
	}

	@Override
	public void getInsured() {
		System.out.println(this.getOwner() + "`s Car is Insured by ???");
		
	}

}
