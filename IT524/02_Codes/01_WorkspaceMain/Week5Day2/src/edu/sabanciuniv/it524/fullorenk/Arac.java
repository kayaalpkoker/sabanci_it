package edu.sabanciuniv.it524.fullorenk;

public abstract class Arac {
	
	
	private int hiz;
	
	public abstract boolean hareketEt(int hiz);
	
	
	public void hizGoster()

	{
		System.out.println("Hız : "+this.hiz);
	}
}
