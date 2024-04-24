package edu.sabanciuniv.it524.kutuphane;

public class MainClass {

	public static void main(String[] args) {
		
		Kutuphane kutuphane = new Kutuphane("Altunizade Halk Kütüphanesi");
		kutuphane.hangiKitaplarVar();
		for(int x=0;x<28;x++)
		{
					
			Kitap kitap1 = new Kitap("Lord of the Rings : Fellowship of the Ring"+x,"J.R.R. Tolkien",1954);
			kutuphane.kitapEkle(kitap1);
		
		}

		kutuphane.kacKitapVar();
		
		kutuphane.hangiKitaplarVar();
		

	}

}
