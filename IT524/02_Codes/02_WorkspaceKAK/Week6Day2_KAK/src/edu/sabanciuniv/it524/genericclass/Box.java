package edu.sabanciuniv.it524.genericclass;

public class Box<T> { //T yerine herhangi bir harf de kullanılabilirdi, ancak T best practice, T>Type
	
	private T deger; //deger referansı tüm field'larda ve metodlarda T!

	public void kutuyaEkle(T yeniDeger) {
		this.deger = yeniDeger;
	}

	public void kutudanSil() {

		this.deger = null;	
	}

	public T kutudaNevar() {
		return this.deger;
	}
	
	
}
