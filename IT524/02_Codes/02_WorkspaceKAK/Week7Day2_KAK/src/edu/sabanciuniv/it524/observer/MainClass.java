package edu.sabanciuniv.it524.observer;

public class MainClass {

	public static void main(String[] args) {
		
		//Design pattern: Observer
		
		/*
		 * Ppt: Trafik lambası ve araçlar var
		 * Araçlar lambayı takip edip, lamba değişikliklerinde farklı aksiyonlar alacak
		 * Araç = observer
		 */
		
		
		TrafikIsigi  trafikIsigi = new TrafikIsigi("kırmızı");
		
		Araba araba1 = new Araba("Ahmet");
		Araba araba2 = new Araba("Ali");
		Araba araba3 = new Araba("Veli");
		
		araba1.isigaBak(trafikIsigi);
		araba2.isigaBak(trafikIsigi);
		araba3.isigaBak(trafikIsigi);
		
		trafikIsigi.yesilOl();
		
		
		trafikIsigi.kirmiziOl();
		
		
	}

}
