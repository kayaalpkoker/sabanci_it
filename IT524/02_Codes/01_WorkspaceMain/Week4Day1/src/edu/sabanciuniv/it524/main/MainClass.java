package edu.sabanciuniv.it524.main;

public class MainClass {

	public static void main(String[] args) {
		
		
		IsimListesi isimler = new IsimListesi();
		isimler.isimEkle("Ahmet");
		isimler.isimEkle("Efe");
		isimler.isimEkle("Yusuf");
		isimler.isimEkle("Caner");
		
		isimler.isimEkle("aaa");
		isimler.isimEkle("bbb");
		isimler.isimEkle("ccc");
		//isimler.isimEkle("ddd");
		
		//isimler.isimEkle("eee");
		
		isimler.listeyiGoster();
		
		
		IsimListesi names= new IsimListesi();
		
		
		

	}

}
