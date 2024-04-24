package edu.sabanciuniv.it524.mainfinal;

public class Cat extends Animal{
	

	//Final methods can not be overridden
	public void finalMethod() {
		System.out.println("This does not work");
	}

}
