package edu.sabanciuniv.it524.ex1;

public class Kapi {
	
	private String renk;
	private String madde;

	public Kapi() {
		this.madde = "madde yok";
		this.renk = "renksiz";
	}
	
	public Kapi(String renk, String madde) {
		this.renk = renk;
		this.madde = madde;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public String getMadde() {
		return madde;
	}
	public void setMadde(String madde) {
		this.madde = madde;
	}
}
