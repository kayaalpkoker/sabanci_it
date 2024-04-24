package edu.sabancuniv.it524.domain;

public class Driver {
	
	private String driverName;
	
	public Driver(String name) {
		this.driverName = name;
	}

	public void drive(Vehicle anyVehicle)
	{
		System.out.print(this.driverName + " is driving --> ");
		anyVehicle.go();
	}
	

}
