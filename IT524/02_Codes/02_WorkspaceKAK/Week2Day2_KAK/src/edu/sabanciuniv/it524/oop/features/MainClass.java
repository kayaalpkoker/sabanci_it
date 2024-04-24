package edu.sabanciuniv.it524.oop.features;

import edu.sabanciuniv.it524.oop.features.encapsulation.Instructor;
import edu.sabanciuniv.it524.oop.features.encapsulation.Student;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * Object Oriented Programming Language Features
		 * 
		 * 1) Abstraction
		 * 2) Encapsulation
		 * 3) Inheritance
		 * 4) Polymorphism
		 * 
		 */
		
		
		/* 
		 * 1) Abstraction
		 * Gerçek hayattan bir nesneyi program içinde oluşturmak
		 * Bir nesneyi programa çekerken ihtiyacım olmayan bazı özelliklerini eklemiyorum
		 * 
		 * Hemen hemen tüm programlama dilleri (low level diller hariç) bu konsepti gerçekleştirebiliyor
		 */
		
		
		
		/* 
		 * 2) Encapsulation
		 * Bir sistem yazıyorsunuz, sadece sizin istediğiniz kısımları accessible (son cümleye bak!) kılıyorsunuz
		 * 
		 * Örnek: Araba
		 * Araba kullanıcısı olarak direksiyon, vites, pedal kullanmayı bilmek benim için yeterli. 
		 * Kaputun altındaki şeyleri bilmiyorum, bilmeye ihtiyacım da yok ve bilmek istemiyorum.
		 * Arabanın aslında çalışması için gerekli birçok mekanizma kaput altına encapsule edilmiş.
		 * 
		 * Encapsulation class seviyesinde başlar (class en küçük program birimidir - maddedeki atom gibi)
		 * 
		 * Encapsulation nasıl yaparım?
		 * Class'ın field'larını public yerine private yapıyorum 
		 * *(class'ın kendisini veya methodları private yapmıyorum)
		 * Private yapmak ilgili değerin doğrudan erişilememesi (println) ve değer verilememesi demek oluyor
		 * Ancak böyle bir durumda da erişimi > get() ve değer vermeyi de set() methodlarıyla gerçekleştiriyorum
		 * 
		 * Class'ı encapsule etmek  = field'ları private'layıp her şeye get() ve set() methodlarıyla ulaşmak
		 * 
		 * Encapsulation  = field'lara private dedik, ancak amaç bunları değiştirilemez kılmak değil,
		 * set metodlarıyla istediğim parametrelerde değiştirilebilir kılmak
		 * 
		 */
		
		Student student1 = new Student(1, "Ahmet","Demirelli",100,100);
		
		System.out.println(student1.getId());
		
		System.out.println(student1);
		
		Instructor i2 = new Instructor("Ahmet", "Demirelli", true, "Sabanci University", "Istanbul");
		
		System.out.println(i2.toString());
		i2.setName("Dersimiz");
		i2.setLastName("Bitti");
		
		System.out.println(i2.toString());

	}

}
