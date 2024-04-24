package edu.sabanciuniv.it524.main1.polymorphism;

public class Dog extends Animal {
	
	@Override
	public void sound() {
		System.out.println("Woof woof");
	}
	
	public void dogMethod()
	{
		System.out.println(" Only Dog has this method ");
	}
	
}
