package edu.sabanciuniv.it524.ex1.composition;

public class Kapi {
	
	private String renk;
	private String madde;
	
	public Kapi(String renk, String madde) {
//		super();
		this.renk = renk;
		this.madde = madde;
	}
	
	public Kapi() {
		this.renk = "renksiz";
		this.madde = "madde yok";
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

	@Override
	public String toString() {
		return "Kapi [renk=" + renk + ", madde=" + madde + "]";
	}
	
	
	
	
	
}
