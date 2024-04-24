package edu.sabanciuniv.it524.ex1;

public class Pencere {
	private String renk;
	private boolean pvc;
	
	public Pencere()
	{
		this.renk="renk yok";
		this.pvc = false;
	}
	
	
	public Pencere(String renk, boolean pvc) {
		this.renk = renk;
		this.pvc = pvc;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public boolean isPvc() {
		return pvc;
	}
	public void setPvc(boolean pvc) {
		this.pvc = pvc;
	}
	
	

}
