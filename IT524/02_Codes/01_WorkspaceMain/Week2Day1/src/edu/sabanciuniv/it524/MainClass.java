package edu.sabanciuniv.it524;

import edu.sabanciuniv.it524.other.Kalem;
import edu.sabanciuniv.it524.other.Lokasyon;

public class MainClass {

	public static void main(String[] args) {
		
		//Nesne tabanlı dünyaya 2 değişik bakış açısıyla bakabiliriz
		
		
		//1) Class -- Object (Nesne yaratma ve kullanma)
		//Tüm nesnelerin iki özelliği vardır
		//State --> Durum bilgisi  (Değişkenler de tutulur)
		//Behaviour --> yapabildikleri  (Metodlar)
		/*
		Otobus mercedes = new Otobus();
		Insan ahmet = new Insan("Ahmet Demirelli");
		ahmet.bin(mercedes);
		mercedes.git("Taksim");
		
		
		
		
		ExcelReader reader = new ExcelReader();
		ExcelObject excel =   reader.readExcel("abc.xlsx");
		excel.save("c:/abc.xlsx");*/
		
		Kalem kalem1 = new Kalem();
		kalem1.madde = "Plastik";
		kalem1.renk = "Mavi";
		kalem1.yaz();
		kalem1.madde="Metal";
		kalem1.yaz();
	
		Kalem kalem2 = new Kalem();
		kalem2.madde = "Tahta";
		kalem2.renk = "Kahverengi";
		kalem2.yaz();
		
		//2) Complex Type
		Lokasyon l1 = new Lokasyon();
		l1.bilgiGoster(); //(-1.0 , -1.0)
		
		Lokasyon l2 = new Lokasyon(22.22);
		l2.bilgiGoster(); //(22.22 , 0.0)
		
		Lokasyon l3 = new Lokasyon(22.22,111);
		l3.bilgiGoster();//(22.22 , 111.0)
		

	}
	
	
	
	

	/* Method overloading : Aynı isimde metodu farklı sayıda parametre ile tekrar yazmak
	int toplam(x,y):
		return x+y
				
	int toplam(x,y,z):
		return x+y+z
*/		
				
}
