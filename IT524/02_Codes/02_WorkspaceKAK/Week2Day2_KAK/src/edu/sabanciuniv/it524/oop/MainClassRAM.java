package edu.sabanciuniv.it524.oop;

public class MainClassRAM {

	public static void main(String[] args) {
		
		//JAVA SERTİFİKASYON SORUSU
		
		Araba a1 = new Araba("Caner", "Anadol");
		Araba a2 = new Araba("Onur", "Şahin");
		
		a1 = a2;
		
		a1.git();
		
		a2.git();
		
		
		/*
		 1) Eğer GC (Garbage collector) çalışırsa RAM de kaç obje kalır?
		
		 a1 = a2 dediğimizde referansları/pointer'ları eşitlemiş oluyoruz.
		 RAM'de stack'teki, pointer'lar var olmaya devam ediyor, ancak a1 pointer değeri (objesi)
		 değişmiş oluyor, ve bu sebeple a1 pointer'ının HEAP'te gösterdiği obje (Caner) değişmiş oluyor (> Onur) 
		 
		 Artık a1 (pointer'ının) başta gösterdiği objeyi refere/point eden
		 pointer kalmadı, dolayısıyla a1'in objesi (Caner) HEAP'te silinebilir hale geldi.
		 
		 Yani cevap: RAM'de 1 obje kalır
		*/
		
		
		
		a2 = null;
		
		/*
		2) a1 = a2 dedikten sonra, a2 = null denirse ve GC çalışırsa RAM'de kaç obje kalır?
		
		Şu aşamada Onur objesine işaret eden iki pointer var; a1 ve a2
		
		a2 = null dendiğinde a2 artık bir objeyi göstermiyor, a2 ile Onur objesi arasındaki bağ kesiliyor,
		a1 veya a1 ile a1 objesi arasındaki ilişkide bir değişiklik olmuyor.
		
		(a1'in etkilenebilmesi için a2 = null'dan sonra tekrar "a1 = a2" veya "a1 = null" demek gerekirdi)
		
		Bu sebeple a2 = null sonrası a1 ile Onur arası bir bağ kalmış oluyor.
		RAM'deki obje sayısı GC çalıştıktan sonra yine 1 olarak kalır.
		
		
		*/
		
	}

}
