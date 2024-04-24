package edu.sabanciuniv.it524.main6.fullOrnek;

public abstract class Arac {
	
	protected boolean hareketEdiyor;
	protected int hiz;
	

	public abstract int hareketEt(int hiz);
	
	
	public void hizGoster() {
		System.out.println("Araç hızı : " + this.hiz);
	}
	
	
	
	
	
	
	
	
	
}
