package edu.sabanciuniv.it524.domain;

import java.util.ArrayList;

public class Sirket {
	
	private String sirketAd;
	private long vergiNo;
	private String sahibi;
	
	
	
	public Sirket() {
		super();
	}
	public Sirket(String sirketAd, long vergiNo, String sahibi) {
		super();
		this.sirketAd = sirketAd;
		this.vergiNo = vergiNo;
		this.sahibi = sahibi;
	}
	
	
	//Şirket çalışanları işe alır
	private ArrayList<Calisan> calisanlar = new ArrayList<>();
	
	//
	public void normalCalisanIseAl(String ad, String soyad, String tcKimlikNo)
	{
		Calisan calisan = new Calisan(ad,soyad,tcKimlikNo);
		this.calisanlar.add(calisan);
		
	}
	
	public void yariZamanliCalisanIseAl(String ad, String soyad, String tcKimlikNo,int haftalikSaat)
	{
		Calisan calisan = new YariZamanliCalisan(ad,soyad,tcKimlikNo,haftalikSaat);
		this.calisanlar.add(calisan);
		
	}
	
	public void sozlesCalisanIseAl(String ad, String soyad, String tcKimlikNo,int sure,double aylikUcret)
	{
		SozlesmeliCalisan calisan = 
				new SozlesmeliCalisan(ad,soyad,tcKimlikNo,sure,aylikUcret);
		this.calisanlar.add(calisan);
		
	}
	
	
	public void calisanlariListele()
	{
		for (Calisan calisan : this.calisanlar)
		{
			System.out.println( " --- " + calisan);
		}
	}
	
	//Şirket çalışanları çalıştırır
	
	public void calisin()
	{
		for (Calisan calisan : this.calisanlar)
		{
			calisan.calis();
		}
	}
	
	//Çalışanalara maaş öder
	
	
	
	
	
	
	
	
	public String getSirketAd() {
		return sirketAd;
	}
	public void setSirketAd(String sirketAd) {
		this.sirketAd = sirketAd;
	}
	public long getVergiNo() {
		return vergiNo;
	}
	public void setVergiNo(long vergiNo) {
		this.vergiNo = vergiNo;
	}
	public String getSahibi() {
		return sahibi;
	}
	public void setSahibi(String sahibi) {
		this.sahibi = sahibi;
	}
	@Override
	public String toString() {
		return "Sirket [sirketAd=" + sirketAd 
				+ ", vergiNo=" + vergiNo +
				", sahibi=" + sahibi + "]";
	}
	public void maasOde() {
		
		/*
		 * Polymorphism için gerekli malzemeler
		 * 1) Inheritance (extends) sub-class - super class ilişkisi olacak
		 * 2) Bir method override edilmiş olmalı
		 * 3) super class a ait bir referans yaratılmalı
		 * 4) o (super class) referansı subclass tan yaratılmış bir objeye işaret etmeli
		 * 5)  o (super class) referansı kullanılılarak override edilmiş method çağırılmalı
		 * işte o an olan olaya Polymorphism diyoruz
		 * 
		 * 
		 * 
		 */
		
		for(Calisan calisan : this.calisanlar)
		{
			double odenecek = calisan.maasHesapla(); //Polymorphism
			System.out.println(calisan.getAd() + " : "+ odenecek + " gönderiledi");
		}
		
		
		//Polymorphism bizi aşağıdaki gibi bir sürü instance of yazmaktan kurtardı
		/*for(Calisan calisan : this.calisanlar)
		{
			if (calisan instanceof YariZamanliCalisan)
			{
				YariZamanliCalisan abc = (YariZamanliCalisan)calisan;
				double odenecek = abc.getHaftalikCalismaSaati() * 200
				System.out.println(calisan.getAd() + "maaş gönderildi "+odenecek);
			} else if (calisan instanceof Calisan) ......
		}
		*/
		/*
		Calisan caner = this.calisanlar.get(0);
		caner.maasHesapla();
		
		Calisan efe = this.calisanlar.get(1);
		efe.maasHesapla();
		
		
		Calisan zehra = this.calisanlar.get(2);
		zehra.maasHesapla();
		
		Calisan yusuf = this.calisanlar.get(3);
		yusuf.maasHesapla();
		
		Calisan aylanur = this.calisanlar.get(4);
		aylanur.maasHesapla();
		*/
		
	}
	
	
}
