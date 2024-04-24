package edu.sabanciuniv.it524.ex1;

public class MainClass {

	public static void main(String[] args) {
		//Features of Object Oriented Programming Languages
		/**
		 * 1)Abstraction
		 * 2)Encapsulation
		 * 3)Inheritance
		 * 4)Polymorphism
		 */
		
		//Composition
		
		
		//1) Her bileşeni ayrı ayrı yaratıp SET methodları ile birleştirebiliriz
		Ev ev = new Ev("Yusuf");
		ev.bilgileriGoster();
		
		
		Kapi kapi = new Kapi("Kahverengi", "Çelik");
		ev.setKapi(kapi);
		Pencere p1 = new Pencere("Pembe", true);
		Pencere p2 = new Pencere("Yeşil", false);
		ev.setSagPencere(p1);
		ev.setSolPencere(p2);
		
		ev.bilgileriGoster();
		
		p1.setRenk("Mor");		
		System.out.println(ev.getSolPencere().getRenk());
		
		//2) Tüm dıştaki objeyi yaratırken tüm iç bileşenleri de yaratacak bir constructor yazabilirz
		//Böylece 1 satırda tüm nesneler (bileşenler) yaratılır
		
		Ev ev2 = new Ev("Caner", "Mavi", "Tahta", 
				"Kahverengi", true, "Mor", false);
			
		ev2.bilgileriGoster();
		
		//3) 1.senaryodaki gibi SET metodları ile birleştirmek yerine
		//Constructor ile birleştirebiliriz
		
		Kapi k2 = new Kapi("Sarı", "Plastik");
		Pencere p5 = new Pencere("Sarı", false);
		Pencere p6 = new Pencere("Sarı", false);
		Ev ev3 = new Ev("Ahmet",k2, p5, p6);
		ev3.bilgileriGoster();

	}

}
