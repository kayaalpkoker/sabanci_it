package edu.sabanciuniv.it524.main1.polymorphism;

public class MainClass {

	public static void main(String[] args) {
		
		Animal animal1 = new Animal();
		animal1.sound();
		
		
		Cat cat1 = new Cat(); 
		cat1.catMethod();
		cat1.sound();	//Polymoprhism yok! Çünkü obje referansı obje class'ı ile aynı
		

		Animal cat2 = new Cat();
		cat2.animalMethod();
		cat2.sound();	//Polymorhism var! Çünkü referans Animal, obje ise Cat
		
		
		//cat2.catMethod(); //Ulaşamayız --> Çünkü referans Animal, obje ise Cat
		
		/*
		 * When you create an object of type Animal and assign it to a reference of type Animal, 
		 * the reference can only access methods that are defined in the Animal class or overridden 
		 * in the Cat class. In other words, the reference is only aware of the methods that are defined 
		 * in the type it's declared as.
		 */
		
		/*
		 * In order to access the catMethod method, you have to cast the reference to the 
		 * appropriate type, in this case, Cat.
		 */
		
		Cat newRef = ((Cat)cat2); //Type casting (downcast)
		newRef.catMethod(); 	  //Type casting yaparken cat2'nin Cat objesi olduğuna EMİN OLMALIYIM
		
		/*
		 * This is called a downcast, and it's important to note that this will cause a runtime exception 
		 * if the object referenced by cat2 is not actually a Cat object.
		 * 
		 * To prevent this, you can use the instanceof operator to check if the object is of 
		 * the correct type before casting it.
		 */
		
		if (cat2 instanceof Cat) {
		    ((Cat) cat2).catMethod();
		}
		
		
		
		
		//Typecasting ile polymorphism aşağıda karışmış, genel bir oku, düzelt
		
		
		/* Typecasting
		 * Typecasting sadece, eğer superclass referansı ile bir subclass objesi yaratılmış ise,
		 * yeni bir subclass referansı yaratıp, bu referansı ilk yaratılmış objeye eşitlenmesiyle yapılabilir.
		 * 
		 * Typecasting daha alt subclass'lara veya superclass'ın altındaki başka 1. alt kat subclass'lara yapılamaz
		 */
		
		
		// Typecasting'de obje değiştirilmiyor, yeni bir (subclass) referans yaratılıp, objeye göstertiliyor
		
		
		/*
		 * Neden typecasting? (polymorphism'in bir özelliği olarak)
		 * 		Neden superclass referansıyla bir subclass objesi yaratıyoruz?
		 * 		Neden doğrudan subclass referansıyla subclass objesi yaratmıyoruz?
		 * 
		 * Yaptığımız Animal superclass örneğinde belli olmuyor, ancak pratikte tüm objeleri bir listede
		 * toplamamız gerekebilir ve çoğu zaman gerekiyor.
		 * Bu durumda objeleri bir ana grupta toplamak mantıklı ve doğru olacaktır
		 * Yani ArrayList<Animal> listesine objeler eklenmelidir.
		 * Eğer subclass referansıyla obje yaratsaydık, yani ArrayList<Lion> olsaydı, cat-dog-vs diğer
		 * objeleri bu Lion arraylist'ine eklemeyezdik, çünkü bu bir Lion arraylist'i.
		 * 
		 * Polymorphism/typecasting ile şunu yapabiliyorum:
		 * 
		 * for (Animal animal : animals) {
		 * 		animal.sound()
		 * }
		 * 
		 */
	}

}
