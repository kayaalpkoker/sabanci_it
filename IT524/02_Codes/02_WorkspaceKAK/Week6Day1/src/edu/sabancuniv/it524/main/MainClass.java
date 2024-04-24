package edu.sabancuniv.it524.main;

import edu.sabancuniv.it524.domain.Car;
import edu.sabancuniv.it524.domain.Driver;
import edu.sabancuniv.it524.domain.House;
import edu.sabancuniv.it524.domain.Insurer;
import edu.sabancuniv.it524.domain.Truck;

public class MainClass {

	public static void main(String[] args) {
		
		
		Car kitt = new Car("Ahmet");
		Truck truck1 = new Truck("Caner");
		House house1 = new House("Ahmet");

		Driver driver = new Driver("Ali");
		driver.drive(kitt);
		driver.drive(truck1);
		
		
		
		Insurer sigortaci = new Insurer("Ataberk");
		sigortaci.insure(kitt);
		sigortaci.insure(truck1);
		sigortaci.insure(house1);
			
		//driver.drive(house);//Bunun yapamamalıyız
		
		
		
		
		
		
		
		
		
		
		

	}

}
