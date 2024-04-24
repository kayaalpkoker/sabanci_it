package edu.sabanciuniv.it524.main4.abstractClass;

public class MainClass {

	public static void main(String[] args) {
		
		//Animal a1 = new Animal();		//Animal abstract class olduğu için objesi yaratılamaz
		
		//Animal class'ının objeleri ancak Animal class'ını extend eden class objeleri ile yazılabilir
		Animal a2 = new Cat();
		Animal a3 = new Dog();
		Animal a4 = new Lion();
		
		Cat c1 = new Lion();
		//Cat c2 = new Dog();  //ilişkisi olmayan iki class
		
	}

}
