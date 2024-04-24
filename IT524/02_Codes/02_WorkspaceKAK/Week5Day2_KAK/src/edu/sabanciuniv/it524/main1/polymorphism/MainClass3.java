package edu.sabanciuniv.it524.main1.polymorphism;

import java.util.ArrayList;

public class MainClass3 {
	
	public static void main(String[] args) {
		
		Lion lion1 = new Lion();
		
		Cat cat1 = new Cat();
		
		Dog dog1 = new Dog();
		
		Animal animal1 = new Animal();
		
		
		ArrayList<Animal> animals = new ArrayList<>();
		
		animals.add(animal1);
		animals.add(dog1);
		animals.add(cat1);
		animals.add(lion1);
		
		for (Animal animal : animals) {
			animal.sound();;
		}
		
		
		
	}

}
