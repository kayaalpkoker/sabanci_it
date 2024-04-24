package edu.sabanciuniv.it524.domain;

public class Car extends Vehicle implements Insurable{

	public Car(String owner) {
		//super(owner); //Böyle tek satır da olur
		super(); //Yukarıdaki tek satır yerine altındaki iki satır da yazılabilir
		this.setOwner(owner); 
	}

	@Override
	public void go() {
		System.out.println(this.getOwner() + "'s Car is going!");
	}

	@Override
	public void getInsured() {
		System.out.println(this.getOwner() + "`s Car is Insured by ???");
		
	}

}
