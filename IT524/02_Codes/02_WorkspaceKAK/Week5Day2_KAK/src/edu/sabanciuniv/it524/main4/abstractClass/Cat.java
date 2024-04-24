package edu.sabanciuniv.it524.main4.abstractClass;

public class Cat extends Animal {
	
	//Class'ı yaratırken Animal'ı extend ettirdiğim için aşağıdaki metod oto geldi!	
	@Override
	public void sound() {
		System.out.println("Miyouuuv");
	}

}
