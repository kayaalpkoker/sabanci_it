package edu.sabanciuniv.it524;

import edu.sabanciuniv.it524.domain.Sirket;
import edu.sabanciuniv.it524.domain.YariZamanliCalisan;

public class MainClass {

	public static void main(String[] args) {
		
		Sirket sirket = new Sirket("Ortogon Ltd Şti",123456789,"Ahmet Demirelli");
		
		System.out.println(sirket);
		
		sirket.normalCalisanIseAl("Ahmet Caner", "Başdoğan", "123123");
		
		//sirket.calisanlarıListele();
		
		sirket.normalCalisanIseAl("Efe", "Çavuşoğlu", "123417");
		sirket.normalCalisanIseAl("Zehra", "Durmuş", "123419");
		
		sirket.yariZamanliCalisanIseAl("Yusuf Islam", "Tuncer", "1111111",20);
		
		sirket.sozlesmeliCalisanIseAl("Aylanur", "Tulga", "2222222", 6, 20000);
		
		//sirket.calisanlariListele();
		sirket.calisin();
		
		sirket.maasOde();
		
		

		Object y = new YariZamanliCalisan();
		YariZamanliCalisan a = (YariZamanliCalisan)y; //Type Casting
		
		a.abc();		
		
	}

}
