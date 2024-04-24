package edu.sabanciuniv.it524;

import edu.sabanciuniv.it524.other.Location;

public class MainClass2 {

	public static void main(String[] args) {

		// New demeden aşağıdaki şekilde yazsaydım ne olurdu, obje yaratılır mıydı?

		// *Not: Diğer Main class'ının main metodunda l1 yaratmıştık
		// Ancak burası yeni bir main metodu olduğu için aynı anda run edilmiyorlar / Tek bir main() çalışır!

		
		// Senaryo 1 -- Sadece referans (pointer) tanımlama 
		Location l1;
		// Objesiz referans yaratma sıkıntısı:
		/*
		 * f you use the code Location l1;, it will declare a reference variable of type Location called l1, 
		 * but it will not create a new object. This means that the l1 variable will not reference any 
		 * object, and attempting to use the l1 variable to access or manipulate an object will result 
		 * in a runtime error.
		 */
		
		
		// Senaryo 2 -- Sadece obje yaratma (ama referansı -kumandası- yok)
		new Location(); 
		/* 	Referanssız obje yaratmanın sıkıntısı:
		 * You can use the code new Location() without creating a reference variable (also known as a pointer) 
		 * for the object. This will create a new object of the Location class, but you will not have a way 
		 * to access it or manipulate it later on in your code because you do not have a reference to 
		 * the object.
		 * 
		 * For example, the following code will create a new Location object, but the object will be 
		 * immediately eligible for garbage collection because there are no references to it.
		 */

		
		
		// Senaryo 3 -- OLMASI GEREKEN
		Location loc1 = new Location(22.02);

		
		
		
		// DEVAM ETMEDEN AŞAĞIYI OKU

		loc1.bilgiGoster();

		loc1 = null; // Ben bu objeyi artık kullanmıyorsam null'larım

		/*
		 * Senaryo 1 kodunu yazıp, objesini yaratmandan o referansı manipule etmeye çalışınca error alacaksınız:
		 *  Error: NullPointerException
		 */


		/*
		 * Pointer nedir? Programlar RAM'de çalışıyor RAM iki parça:
		 * 1) Static Memory (Stack) 
		 * 2) Dynamic Memory (HEAP)
		 * 
		 * Static = Bir yer ayırırsınız ve o yer öyle kalır, silinmez, program bitene kadar orası yer kaplar
		 * Dynamic = Arada temizlenen bir yer; bu yüzden objeler burada yaratılır
		 * 
		 * C'de, dynamic memory üzerinde obje için yer yaratırsınız, programda kullanırsınız, programı
		 * kapatırken bu yeri kapatırsınız --> Bu yeri silmek C++'da yazılımcının görevidir!
		 * 
		 * Objeler, silinebilmeleri için dynamic memory'de yaratılır
		 * Ancak java'da bu alan silme işini java yapıyor (garbage collector), yazılımcı değil.
		 * 
		 * Bütün programlar JVM üzerinde çalışıyor ya, JVM içinde "garbage collector" diye bir component
		 * var.
		 * Bu component belirli aralıklarla ilgili obje kullanılıyor mu diye sorar,
		 * ve kullanılmıyorsa onu siler.
		 * Garbage collector'ın ne zaman çalışacağını siz belirleyemiyorsunuz, kendi kendine çalışıyor
		 * 
		 * 
		 * 
		 * Biz bu objeleri nasıl yarattık? new keyword'u ile...
		 * Objeler HEAP'te yaratılır
		 * 
		 * 
		 * Eğer yukarıdaki gibi "Location l1;" derseniz (new keywordu yok) uzaktan
		 * kumanda yaratıyorsunuz, ancak kumandayı nereye tutacağınız yok/belli değil
		 * 
		 * TV (yani objesi) yok bu yüzden NullPointerException error'u alıyorsunuz bu
		 * kumandalara "reference" diyoruz, C++'taki adı ise pointer
		 * 
		 */

	}

}
