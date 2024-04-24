package edu.sabanciuniv.it524.dynamicarrayyaratma;

public class Kitap {
	
	private String ad;
	private String yazar;
	private int yil;
	
	public Kitap () {
		
	}
	
	public Kitap(String ad, String yazar, int yil) {
		this.ad = ad;
		this.yazar = yazar;
		this.yil = yil;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getYazar() {
		return yazar;
	}

	public void setYazar(String yazar) {
		this.yazar = yazar;
	}

	public int getYil() {
		return yil;
	}

	public void setYil(int yil) {
		this.yil = yil;
	}
	
	

}
