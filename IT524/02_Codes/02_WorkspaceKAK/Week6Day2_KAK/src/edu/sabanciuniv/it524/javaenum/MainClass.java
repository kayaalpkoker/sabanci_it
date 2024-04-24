package edu.sabanciuniv.it524.javaenum;

public class MainClass {

	public static void main(String[] args) {
		
		/* Enum
		 * 
		 * An enum is a special type of class that represents a fixed set of values. 
		 * Enums are often used to define a set of constants, such as the days of the week or 
		 * the suits in a deck of cards.
		 * 
		 * Enum içine yazdığımız şeyler = değişken değerleri
		 * Enum'ın kullanılma sebebi değişkenlerin alabileceği değerleri sınırlamak
		 * 		> Haftada 7 gün var, günleri bir Enum içine tek tek gireceğim, daha basit bir syntax var
		 * 
		 * 
		 * Enum'ın içindekiler bir bakıma static final değişken gibi kullanılıyor
		 * Enum kullanabileceğim bir senaryoda static bir class yapıp, içine static final değişkenler
		 * tanımlayarak da yapabilirdim,
		 * ancak Enum yolu daha kısa
		 */
		
		
		Gun gun = Gun.SALI;
		
		if (gun == gun.SALI) {
			System.out.println("Bugün salı");
		}
		
		for (Gun a : Gun.values())
		{
			System.out.println(a);
		}
		
		
		int bugun = 8;//Days.CARSAMBA;
		
		
	}

}
