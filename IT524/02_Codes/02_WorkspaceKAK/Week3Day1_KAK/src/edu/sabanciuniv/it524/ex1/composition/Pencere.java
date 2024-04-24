package edu.sabanciuniv.it524.ex1.composition;

public class Pencere {
	
	private String renk;
	private boolean pvc;
	
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

	@Override
	public String toString() {
		return "Pencere [renk=" + renk + ", pvc=" + pvc + "]";
	}
	
	

}
