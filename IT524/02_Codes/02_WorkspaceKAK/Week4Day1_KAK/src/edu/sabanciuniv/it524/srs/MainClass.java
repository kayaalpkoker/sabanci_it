package edu.sabanciuniv.it524.srs;

public class MainClass {

	public static void main(String[] args) {
		
		Student student1 = new Student(1, "Güney","Kuba");
		Address address1 = new Address("Atatürk Street","34A","Albany","Australia");
		Address address2 = new Address("Bigben Street","34B","London","UK");
		
		Student student2 = new Student(2, "Ahmet","Demirelli");
		Address a1 = new Address("Abc Street", "18B", "Istanbul", "Türkiye");
		student2.addAddress(a1);
		

		
		
		
		
		GradStudent gs1 = new GradStudent(3,"Efe","Çavuşoğlu","Quantum Computing");
		gs1.addAddress(address2);
		
		student1.printInfo();
		student2.printInfo();
		gs1.printInfo();	

		
		
	}

}
