package edu.sabanciuniv.it524.dynamicarrayyaratma;

public class MainClass {

	public static void main(String[] args) {
		
		Kutuphane kutuphane1 = new Kutuphane("Altunizade Halk Kütüphanesi");
		
		kutuphane1.hangiKitaplarVar();
		
		
		for (int x=0; x<28; x++) {
	
			Kitap kitap1 = new Kitap("Lord of the Rings : Fellowship of the Ring" + x, "J.R.R. Tolkien", 1954);
			kutuphane1.kitapEkle(kitap1);
		}
		
		
		kutuphane1.kacKitapVar();
		
		kutuphane1.hangiKitaplarVar();

		
	}

}
