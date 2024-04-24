package edu.sabanciuniv.it524.abstraction;

public abstract class Engine {
	
	protected int fuel;
	
	
	public Engine () {
		this.fuel = 0;
	}
	
	public abstract void start();
	
	public abstract void stop();
	
	public void addFuel(int fuel) {
		this.fuel += fuel;
	}
	
	
	
}
