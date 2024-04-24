package edu.sabanciuniv.it524.genericclass;

public class Kutu {
	
	private Object deger; //deger referansı Object, tüm class'ların superclass ı olduğu 
						  //için her data tipini ekleyebilirim
	
	public void kutuyaEkle(Object yeniDeger) {
		this.deger = yeniDeger;
	}
	
	public void kutudanSil() {
		
		this.deger = null;	
	}
	
	public Object kutudaNevar() {
		return this.deger;
	}
	
}
