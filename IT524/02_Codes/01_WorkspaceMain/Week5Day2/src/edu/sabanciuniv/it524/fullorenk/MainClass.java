package edu.sabanciuniv.it524.fullorenk;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		
		Kamyon k = new Kamyon();
		
		
		ArrayList<Kiralanabilir>  kiralanabilirNesneler = new ArrayList<>();
	
		ArrayList<Arac>  araclar = new ArrayList<>();
		
		ArrayList<Sigortalanabilir>  sigortalanabilirNesneler = new ArrayList<>();
		
		
		kiralanabilirNesneler.add(k);
		
		sigortalanabilirNesneler.add(k);
		
		araclar.add(k);
		

	}

}
