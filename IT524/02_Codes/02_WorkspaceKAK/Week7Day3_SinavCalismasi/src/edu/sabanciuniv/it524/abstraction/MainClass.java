package edu.sabanciuniv.it524.abstraction;

public class MainClass {

	public static void main(String[] args) {
		
		Engine engine1 = new PetrolEngine();
		Car car1 = new Car(engine1);
		
		// User does not see how engine works!
		car1.start();
		
		car1.addFuel(20);
		
		car1.start();
		car1.stop();
		
		
		
	}

}
