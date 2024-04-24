package edu.sabanciuniv.it524.main3.fKeyword;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * "final" keyword etkisi:
		 * 
		 * 	> class extend edilemiyor
		 * 			> see Game & GameSub class
		 * 
		 * 	> metod override edilemiyor
		 * 			> see Animal & Cat class
		 * 
		 * 	> değişken değeri değiştirilemiyor
		 * 			> see GlobalVariables & Main class
		 */
		
		// Final class'lar instantiate edilebilir
		Game game1 = new Game();
		
		Animal animal1 = new Animal();
		animal1.animalMethod();
		
		
		//GlobalVariables örneği
		
		int r = 2;
		double alan = GlobalVariables.piSayisi * r;
		System.out.println(alan);
		
		//piSayisi final olduğu için değerini değiştiremiyorum
		//GlobalVariables.piSayisi = 3.15;
		
		
		
	}

}
