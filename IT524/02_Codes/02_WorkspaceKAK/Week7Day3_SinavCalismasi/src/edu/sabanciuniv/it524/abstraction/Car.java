package edu.sabanciuniv.it524.abstraction;

public class Car {
	
	Engine engine;
	
	
	public Car (Engine engine) {
		this.engine = engine;
	}

	
	public void start() {
		this.engine.start();
	}
	
	public void stop() {
		this.engine.stop();
	}
	
	public void addFuel(int fuel) {
		this.engine.addFuel(fuel);
	}
}
