package edu.sabanciuniv.it524.poly;

public class MainClass {

	public static void main(String[] args) {
		Animal animal1 = new Animal();
		animal1.sound();
		
		Cat cat1 = new Cat(); 
		cat1.catMethod();
		cat1.sound();//Polymoprhism yok
		
		
		Animal cat2 = new Cat();
		cat2.animalMethod();
		cat2.sound(); //Polymorhism var!!!!!
		//cat2.catMethod(); //Ulaşamayız
		
		
		Cat newRef = ((Cat)cat2);
		
		newRef.catMethod(); //Type casting
		
		
		

	}

}
