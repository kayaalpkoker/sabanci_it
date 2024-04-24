package edu.sabanciuniv.it524.main4.abstractClass;

public abstract class Animal {
	
	//abstract class'lardan obje yaratılamıyor, dolayısıyla constructor yaratmama gerek yok
	//fakat istersem constructor yaratabilirim 
	
	
	
	//abstract bir metod yaratıyorsam method body koyamıyorum!
	//metodu abstract yaratınca, bu class'ı extend eden tüm class'lara oto bu metod override ile geliyor!
	public abstract void sound();
	
	
	public void nonAbstractMethod() {
		System.out.println("I am a non-abstract method son!");
	}
	
	
	
}
