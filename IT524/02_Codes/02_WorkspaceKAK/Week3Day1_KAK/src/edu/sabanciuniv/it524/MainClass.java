package edu.sabanciuniv.it524;

import edu.sabanciuniv.it524.ex1.composition.Ev;
import edu.sabanciuniv.it524.ex1.composition.Kapi;
import edu.sabanciuniv.it524.ex1.composition.Pencere;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * Features of Object Oriented Programming Language
		 * 
		 * 1) Abstraction	(Week2Day2)
		 * 2) Encapsulation	(Week2Day2)
		 * 3) Inheritance
		 * 4) Polymorphism
		 * 
		 */
		
		/*
		 * OOP özelliklerinden olmayıp yine de sık kullanılan bir başka özellik:
		 * COMPOSITION
		 * 	>> Bir class'ın referansını başka bir class içinde tutmak
		 * 	>> Bir class, diğeri olmadan varolabiliyorsa, birbirlerinden bağımsızlarsa > AGGREGATION
		 * 	>> İkisi birbiriyle bağlı ise COMPOSITION
		*/ 
		
		Ev ev = new Ev("Yusuf"); // Bir ev objesi yarattım (Ev.class'tan constructor'ına bak*)
								 // Bu objenin sadece "Sahibi" pointer'ı bir veri tutuyor, bu veri de string
								 // Ancak bu objenin diğer pointer'ları bir veriyi göstermiyor, null'lar
		
		ev.bilgileriGoster();
		
		//Şimdi bir de kapı yaratacağım, bunu iki şekilde yapabilirim.
		//Ya yukarıda sadece sahibi olan evi yaratıp, set() metoduyla kapı ekleyeceğim
		//Ya da kapılı bir ev objesi yaratacağım
		
		
		
		//1) Her bileşeni ayrı ayrı yaratıp SET methodları ile birleştirebiliriz
		
		Kapi kapi1 = new Kapi("Kahverengi", "Çelik");
		
		ev.setKapi(kapi1);  // aşağıdaki pencere için set metod açıklamasına bak
		

		Pencere p1 = new Pencere("Pembe", true);
		Pencere p2 = new Pencere("Yeşil", false); //Penceleri yarattım (referans/pointer + obje)
		ev.setSagPencere(p1);  // ev class'ı içindeki set metodu ile, ev objesinin içindeki null olan sagPencere 
							   // referansına, p1 referansının gösterdiği objeyi göstertiyoruz 
		ev.setSolPencere(p2);
		
		System.out.println(ev.getSagPencere().getRenk());
		
		p1.setRenk("Mor");
		
		System.out.println(ev.getSagPencere().getRenk());
		
		
		ev.bilgileriGoster();
		// Eğer tek tek bileşen tanımlayıp sonra eve takmak istemiyorsam,
		// tek seferde her şeyi tamam olan ev oluşturmak istiyorsam nasıl olur?
		// Ev class'ı içinde yeni bir constructor yaratacağım (see Ev.class)
		

		//2) Tüm dıştaki objeyi yaratırken tüm iç bileşenleri de yaratacak bir constructor yazabilirz
		//Böylece 1 satırda tüm nesneler (bileşenler) yaratılır
		
		Ev ev2 = new Ev("Caner", "Mavi", "Tahta", "Kahverengi", true, "Mor", false);
			
		ev2.bilgileriGoster();
		
		
		//3) 1.senaryodaki gibi SET metodları ile birleştirmek yerine
		//Constructor ile birleştirebiliriz
		
		Kapi k2 = new Kapi("Sarı", "Plastik");
		Pencere p5 = new Pencere("Sarı", false);
		Pencere p6 = new Pencere("Sarı", false);
		
		Ev ev3 = new Ev("Ahmet",k2, p5, p6);
		
		ev3.bilgileriGoster();
		
		System.out.println(ev3);
		
		
		
	}

}
