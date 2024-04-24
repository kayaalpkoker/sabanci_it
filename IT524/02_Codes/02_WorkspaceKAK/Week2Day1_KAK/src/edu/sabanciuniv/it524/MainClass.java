package edu.sabanciuniv.it524;

import edu.sabanciuniv.it524.other.Kalem;
import edu.sabanciuniv.it524.other.Location;

public class MainClass {

	public static void main(String[] args) {

		// Önce aşağıda class kısımlarını oku!
		Kalem kalem1 = new Kalem();
		kalem1.madde = "Plastik";
		kalem1.renk = "Mavi";
		kalem1.yaz();

		// Bir objenin özelliklerini sonradan değiştirebiliriz:
		kalem1.madde = "Metal";
		kalem1.yaz();

		// 2) Complex Type
		Location l1 = new Location();

		Location l2 = new Location(22.22);

		Location l3 = new Location(22.22, 111);

	}

}

/*
 * Class aslında bir blueprint. Bu blueprint'i kullanarak sınırsız sayıda object
 * yaratıyorum. Aynı bina blueprint'i ile gerçek hayatta birçok bina inşa
 * ediyorum.
 */

/*
 * ÖNEMLİ!: Aslında class'lar farklı dosyalarda tutulmalı İlk ders için
 * MainClass dosyası içinde Kalem class'ı tutuyoruz.
 * 
 * 
 * >>> Kalem class'ını farklı bir dosyada açıyorum; önce orayı oku!
 * 
 */
