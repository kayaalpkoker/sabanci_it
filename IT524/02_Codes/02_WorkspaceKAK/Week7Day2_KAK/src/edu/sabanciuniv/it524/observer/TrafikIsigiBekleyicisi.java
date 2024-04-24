package edu.sabanciuniv.it524.observer;

public abstract class TrafikIsigiBekleyicisi {
	
	public abstract void git();
	public abstract void dur();
	
	public void isigaBak(TrafikIsigi trafikIsigi) {
		//"Objenin kendisini" isiga bakanlara ekleyeceğim için "this" diyorum
		trafikIsigi.isigaBakanlaraEkle(this);
			
	}

}
