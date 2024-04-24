package edu.sabanciuniv.it524.domain;

public class SozlesmeliCalisan extends Calisan {

	private int sozlesmeSuresi;
	private double aylikOdeme;
	

	public SozlesmeliCalisan() {
		super();
	}

	public SozlesmeliCalisan(String ad, String soyad, String tcKimlikNo, int sure, double aylikUcret) {
		super(ad, soyad, tcKimlikNo);
		/* super (...) aslında şu anlama geliyor;
		 * this.setAd(ad);
		 * this.setSoyad(soyad);
		 * this.setTcKimlikNo(tcKimlikNo);
		 */
		this.sozlesmeSuresi = sure;
		this.aylikOdeme = aylikUcret;
	}
	
	
	@Override
	public String toString() {
		return "SozlesmeliCalisan " + this.genelBilgi()
				+", sozlesmeSuresi"+this.sozlesmeSuresi  
				+", aylikOdeme"+this.aylikOdeme  
				+ "]";
	}

	
	@Override
	public double maasHesapla() {
		double maas = aylikOdeme - aylikOdeme*0.12;
		return maas;
	}

	
	
	
	
}
	
	
