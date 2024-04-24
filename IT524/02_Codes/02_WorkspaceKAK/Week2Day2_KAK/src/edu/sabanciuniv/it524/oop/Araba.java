package edu.sabanciuniv.it524.oop;

public class Araba {
	
	public String sahibi;
	public String marka;
	
	
	//Full constructor
	public Araba(String sahibi, String marka) {
		this.sahibi = sahibi;
		this.marka = marka;
	}
	
	//Empty constructor
	public Araba() {
		this.sahibi = "Hiç kimse";
		this.marka = "bilinmeyen";
	}
	
	public void git() {
		System.out.println(this.sahibi + " nin " + this.marka + 
				" arabası gidiyor");
	}

	public void dur() {
		System.out.println(this.sahibi + " nin " + this.marka + 
				" arabası durdu");
	}
	
	
}
