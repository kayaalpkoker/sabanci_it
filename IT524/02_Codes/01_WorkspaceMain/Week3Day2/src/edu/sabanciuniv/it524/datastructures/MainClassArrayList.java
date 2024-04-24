package edu.sabanciuniv.it524.datastructures;

import java.util.ArrayList;

import edu.sabanciuniv.it524.kutuphane.Kitap;

public class MainClassArrayList {

	public static void main(String[] args) {
		
		ArrayList<Kitap> kitaplar = new ArrayList<>();
		
		Kitap k1 = new Kitap("Kitap Ad","Yazar 323",2022);
		Kitap k2 = new Kitap("Kitap Ad 323","Yazar 1",2011);
		Kitap k3 = new Kitap("Kitap Ad 23 ","Yazar 1",2002);
		Kitap k4 = new Kitap("Kitap Ad 23","Yazar 434",1999);
		
		kitaplar.add(k1);
		kitaplar.add(k2);
		kitaplar.add(k3);
		kitaplar.add(k4);
		
		for (int i = 0;i<10000000;i++)
		{
			Kitap kitap1 = new Kitap("Lord of the Rings : Fellowship of the Ring"+i
					,"J.R.R. Tolkien",1954);
			kitaplar.add(kitap1);

		}
		
		
		kitaplar.clear();
		
		
		
		ArrayList<Integer> sayilar = new ArrayList<Integer>();
		
		int x = 100;
		Integer y = 100;
		

		

	}

}
