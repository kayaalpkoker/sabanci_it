package edu.sabanciuniv.it524.abstraction;

public class PetrolEngine extends Engine {
	
	public PetrolEngine() {
		super();
	}

	@Override
	public void start() {
		if (fuel > 0) {
			System.out.println("Petrol engine started son");
		}
		else {
			System.out.println("Need fuel to start!");
		}
	}

	@Override
	public void stop() {
		System.out.println("Petrol engine stopped");
	}

}
