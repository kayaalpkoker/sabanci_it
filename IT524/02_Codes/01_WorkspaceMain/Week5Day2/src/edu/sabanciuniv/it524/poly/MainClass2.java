package edu.sabanciuniv.it524.poly;

public class MainClass2 {

	public static void main(String[] args) {
		
		Animal a1 = new Lion();
		
		a1.sound(); //Eğer lion sınıfında sound metodu override edilmemişse bir üst sınıf olan Cat.sound çalışır
		
		
		Animal animal = new Lion();
		animal.animalMethod();
	
		Cat c = (Cat)animal; //Type casting
		c.catMethod();
		
		Lion l  = (Lion)animal; //Type casting
		l.lionMethod();
		
		//Why ???
		Lion animal2 = new Lion();
		animal2.animalMethod();
		
		animal2.catMethod();
		
		animal2.lionMethod();

	}

}
