package edu.sabanciuniv.it524.domain;

public class YariZamanliCalisan extends Calisan {
	
	private double haftalikCalismaSaati;
	

	public YariZamanliCalisan() {
		super();
	}

	public YariZamanliCalisan(String ad, String soyad, String tcKimlikNo, double haftalikCalismaSaati) {
		super(ad, soyad, tcKimlikNo);
		/* super (...) aslında şu anlama geliyor;
		 * this.setAd(ad);
		 * this.setSoyad(soyad);
		 * this.setTcKimlikNo(tcKimlikNo);
		 */
		this.haftalikCalismaSaati = haftalikCalismaSaati;
	}

	public double getHaftalikCalismaSaati() {
		return haftalikCalismaSaati;
	}

	public void setHaftalikCalismaSaati(double haftalikCalismaSaati) {
		this.haftalikCalismaSaati = haftalikCalismaSaati;
	}
	
	
	
	@Override
	public String toString() {
		return "YariZamanliCalisan "+this.genelBilgi()  
				+", haftalikCalismaSaati"+this.haftalikCalismaSaati  + "]";
	}
	
	
	@Override
	public double maasHesapla() {
		double maas = (haftalikCalismaSaati * 200);
		return maas;
	}
	
	
	// Bu ne için???
	public void abc() {
		
	}
	
}
