package edu.sabanciuniv.it524.ex3.domain;

public class Harddisk {
	
	private int hdKapasite;
	private String hdMarka;

	public Harddisk () {
	}
	
	public Harddisk(int hKapasite, String hMarka) {
		this.hdKapasite = hKapasite;
		this.hdMarka = hMarka;
	}

	public int getHdKapasite() {
		return hdKapasite;
	}

	public void setHdKapasite(int hdKapasite) {
		this.hdKapasite = hdKapasite;
	}

	public String getHdMarka() {
		return hdMarka;
	}

	public void setHdMarka(String hdMarka) {
		this.hdMarka = hdMarka;
	}
	
	
	
	

}
