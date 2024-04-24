package edu.sabanciuniv.it524.domain;

public class Driver {
	
	private String driverName;
	
	
	public Driver(String driverName) {
		this.driverName = driverName;
	}

	public void drive(Vehicle anyVehicle) {
		System.out.print(this.driverName + " is driving --> ");
		anyVehicle.go();
	}

}
