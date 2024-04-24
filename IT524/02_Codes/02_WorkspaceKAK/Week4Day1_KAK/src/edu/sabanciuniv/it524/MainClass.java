package edu.sabanciuniv.it524;

public class MainClass {

	public static void main(String[] args) {
		
		
		// Bu derste dynamic array yaratmaya farklı bir örnekle tekrar bakacağız
		
		
		IsimListesi names1 = new IsimListesi();
		names1.isimEkle("Ahmet");
		names1.isimEkle("Efe");
		names1.isimEkle("Yusuf");
		names1.isimEkle("Caner");

		names1.isimEkle("aaa");
		names1.isimEkle("bbb");
		names1.isimEkle("ccc");

		names1.listeyiGoster();
		
		
		IsimListesi names2 = new IsimListesi();
		
		names2.isimEkle("Johnny");
		names2.listeyiGoster();
		
	}

}

