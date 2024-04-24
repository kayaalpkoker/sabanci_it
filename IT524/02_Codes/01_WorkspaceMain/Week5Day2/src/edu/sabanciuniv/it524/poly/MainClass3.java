package edu.sabanciuniv.it524.poly;

import java.util.ArrayList;

public class MainClass3 {

	public static void main(String[] args) {
		
		Lion l = new Lion();
		
		Cat c = new Cat();
		
		Animal a = new Animal();
		
		Dog d = new Dog();
		
		
		ArrayList<Animal>  animals = new ArrayList<>();
		animals.add(l);
		animals.add(c);
		animals.add(a);
		animals.add(d);
		
		
		for (Animal animal : animals)
		{
			animal.sound();
		}
			

	}

}
