package edu.sabanciuniv.it524.srs;

import java.util.ArrayList;

public class MainClass {

	
	public static void main(String[] args) {
		
		
		Student student1 = new Student(1, "Güney", "Kuba");
		Address address1 = new Address("Atatürk Street","34A","Albany","Australia");
		Address address2 = new Address("Bigben Street","34A","London","UK");
		student1.addAddress(address1);
		student1.addAddress(address2);
		
		
		Student student2 = new Student(2,"Ahmet","Demirelli");
		Address a1 = new Address("Abc Street", "18B", "Istanbul", "Türkiye");
		student2.addAddress(a1);
		

		
		
		
		
		GradStudent gs1 = new GradStudent(3,"Efe","Çavuşoğlu","Quantum Computing");
		gs1.addAddress(address2);
		
		student1.printInfo();
		student2.printInfo();
		gs1.printInfo();
	

	}

}
