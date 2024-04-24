package edu.sabanciuniv.it524.main6.fullOrnek;

import java.util.ArrayList;

public class MainClass {

	public static void main(String[] args) {
		
		Kamyon k = new Kamyon();
	
		
		ArrayList<Arac>  araclar = new ArrayList<>();
		
		ArrayList<Kiralanabilir>  kiralanabilirNesneler = new ArrayList<>();
		
		ArrayList<Sigortalanabilir>  sigortalanabilirNesneler = new ArrayList<>();
		
		
		kiralanabilirNesneler.add(k);
		
		sigortalanabilirNesneler.add(k);
		
		araclar.add(k);
		
		k.hareketEt(5);
		k.hizGoster();
		
		
	}

}
