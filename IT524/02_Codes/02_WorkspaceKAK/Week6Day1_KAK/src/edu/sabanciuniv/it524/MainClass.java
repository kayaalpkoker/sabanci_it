package edu.sabanciuniv.it524;

import edu.sabanciuniv.it524.domain.Car;
import edu.sabanciuniv.it524.domain.Driver;
import edu.sabanciuniv.it524.domain.House;
import edu.sabanciuniv.it524.domain.Insurer;
import edu.sabanciuniv.it524.domain.Truck;

public class MainClass {
	
	/*
	 * Neden MainClass ile başlıyorum? (Diğer class'ları yaratmak yerine*)
	 * Burada yazmaya başladığınızda uygulamanın neye benzeyeceği daha belli oluyor
	 * Kafanızda daha rahat kurabiliyorsunuz!
	 */
	
	
	public static void main(String[] args) {
		
		Car kitt = new Car("Ahmet");
		Truck truck1 = new Truck("Mercedes");
		
		
		Driver driver = new Driver("Betül");
		
		driver.drive(kitt);
		driver.drive(truck1);
		
		//driver.drive(house1); //Bunu yapamamalı!
		
		
		
		
		House house1 = new House("Ahmet");
		
		/*
		 * Burada insurable bir grup öngörüyoruz
		 * Insurable interface'ine bu grupta yer alan class'ları? parametre olarak eklemeliyiz
		 */
		
		Insurer sigortaci = new Insurer("Ataberk");
		sigortaci.insure(kitt);
		sigortaci.insure(house1);
		sigortaci.insure(truck1);
		
		
	}
	
	

	
	
}
