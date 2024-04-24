package edu.sabanciuniv.it524.polymorphism;

public abstract class Calisan {
	
	private String calisanAdi;
	private String calisanSoyadi;
	private int tcKimlikNo;
	
	
	public Calisan() {
		super();
	}

	public Calisan(String calisanAdi, String calisanSoyadi, int tcKimlikNo) {
		super();
		this.calisanAdi = calisanAdi;
		this.calisanSoyadi = calisanSoyadi;
		this.tcKimlikNo = tcKimlikNo;
	}
	
	
	public String getCalisanAdi() {
		return calisanAdi;
	}

	public void setCalisanAdi(String calisanAdi) {
		this.calisanAdi = calisanAdi;
	}

	public String getCalisanSoyadi() {
		return calisanSoyadi;
	}

	public void setCalisanSoyadi(String calisanSoyadi) {
		this.calisanSoyadi = calisanSoyadi;
	}

	public int getTcKimlikNo() {
		return tcKimlikNo;
	}

	public void setTcKimlikNo(int tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}

	@Override
	public String toString() {
		return "Calisan [calisanAdi=" + calisanAdi + ", calisanSoyadi=" + calisanSoyadi + 
				", tcKimlikNo=" + tcKimlikNo + "]";
	}


	public abstract void calis();
	
	public abstract double maasHesapla();
	
	
	
	
	
	
	
}
