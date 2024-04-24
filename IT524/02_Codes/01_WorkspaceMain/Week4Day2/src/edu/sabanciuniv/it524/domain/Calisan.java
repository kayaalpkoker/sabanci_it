package edu.sabanciuniv.it524.domain;

public class Calisan {
	
	private String ad;
	private String soyad;
	private String tcKimlikNo;
	
	
	
	public Calisan() {
		super();
	}
	public Calisan(String ad, String soyad, String tcKimlikNo) {
		super();
		this.ad = ad;
		this.soyad = soyad;
		this.tcKimlikNo = tcKimlikNo;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public String getTcKimlikNo() {
		return tcKimlikNo;
	}
	public void setTcKimlikNo(String tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}
	
	
	public String genelBilgi()
	{
		return "[ad=" + this.getAd() + 
				", soyad=" + this.getSoyad() + 
				", tcKimlikNo=" + this.getTcKimlikNo();
	}
	
	@Override
	public String toString() {
		return "Calisan " + this.genelBilgi();
	}
	public void calis() {
		System.out.println(this.getAd() + " çalışıyor");
		
	}
	public double maasHesapla() {
		return 30000;
	}
	
	

}
