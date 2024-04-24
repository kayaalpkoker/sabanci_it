package edu.sabanciuniv.it524.main1.polymorphism;

public class MainClass2 {

	public static void main(String[] args) {
		
		Animal lion1 = new Lion();
		
		lion1.sound(); //Aslan miyav dedi --> Eğer Lion class'ında sound() override edilmemişse
					   //superclass'ın (Cat) sound() metodu çalışır
		
		lion1.animalMethod();

		//lion1.catMethod(); cannot!
		Cat cat1 = (Cat) lion1; //Typecasting
		cat1.catMethod();
		
		//lion1.lionMethod(); cannot!
		Lion lionBir = (Lion) lion1;
		lionBir.lionMethod(); // Animal lion1 = new Lion() ile Lion metodunu çağıramıyordum!
							  // Superclass referansı ile yaratılmış subclass objesi o subclass'a özel metodları çağıramıyor!
		
		System.out.println("-----");
		
		Lion lion2 = new Lion();
		lion2.animalMethod();
		lion2.catMethod();
		lion2.lionMethod();
		
	}

}
