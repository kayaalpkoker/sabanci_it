package edu.sabanciuniv.it524.domain;

import java.util.ArrayList;

public class Sirket {
	
	private String sirketAd;
	private long vergiNo;
	private String sahibi;
	private ArrayList<Calisan> calisanlar = new ArrayList<>();
	
	public Sirket() {
		super();
	}
	
	public Sirket(String sirketAd, long vergiNo, String sahibi) {
		super();
		this.sirketAd = sirketAd;
		this.vergiNo = vergiNo;
		this.sahibi = sahibi;
	}
	
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

	
	//Açıklaması aşağıda
	
	@Override
	public String toString() {
		return "Sirket [sirketAd=" + sirketAd + ", vergiNo=" + vergiNo + ", sahibi=" + sahibi + "]";
	}
	
	/*
	 * toString metodu --- System.out.println(...) ilişkisi:
	 * 
	 * toString metodu Object class'ından gelir
	 * System.out.println(sirket) şeklinde main üzerinden objeyi print edersem;
	 * > yani toString metodu normal hali ile kullanınca, objenin hash metoduna girmiş representasyonunu veriyor
	 * Hash metodları, tek taraflı olan (geri döndürülemeyen) yani lineer olmayan metodlar
	 * Patates > hash'lemek > Patates püresi (patates püresi patatese geri çevrilemez)
	 * 
	 * toString metodunu override ederek farklı değerler verebilirim
	 * 
	 * Source > Generate toString
	 */
	
	
	
	
	//Şirket çalışanları işe alır
	public void normalCalisanIseAl(String ad, String soyad, String tcKimlikNo) {
		Calisan calisan = new Calisan(ad,soyad,tcKimlikNo);
		this.calisanlar.add(calisan);
	}
	
	//Yeni bir çalışan tipi geldiği için yeni bir "işe al" metodu 
	public void yariZamanliCalisanIseAl(String ad, String soyad, String tcKimlikNo, double haftalikSaat) {
		Calisan calisan = new YariZamanliCalisan(ad,soyad,tcKimlikNo,haftalikSaat);
		this.calisanlar.add(calisan);
	}
	
	//Yeni bir çalışan tipi geldiği için yeni bir "işe al" metodu 
	public void sozlesmeliCalisanIseAl(String ad, String soyad, String tcKimlikNo, int sure, double aylikUcret) {
		Calisan calisan = new SozlesmeliCalisan(ad,soyad,tcKimlikNo,sure,aylikUcret);
		this.calisanlar.add(calisan);
	}	

	//Listeyi print et
	public void calisanlarıListele() {
		for (Calisan calisan : this.calisanlar) {
			System.out.println(" ---- " + calisan);
		}
	}
	
	
	
	//Şirket çalışanları çalıştırır
	public void calisin() {
		for (Calisan calisan : this.calisanlar)
		{
			calisan.calis();
		}
	}	
	
	
			
	//Şirket çalışanlara maaş öder
	
	public void maasOde() {
		
		for(Calisan calisan : this.calisanlar) {
			
			double odenecek = calisan.maasHesapla(); //Polymorphism
			System.out.println(calisan.getAd() + " : "+ odenecek + " gönderildi");
		}
	
	}
	
	/*
	 * Polymorphism için gerekli malzemeler:
	 * 1) Inheritance (Superclass ve subclass'lar)
	 * 2) İlgili superclass metodunun subclass'ta override edilmeli
	 * 3) Superclass'a ait bir referans ile subclass'a ait bir obje yaratılmalı
	 * 		> Calisan calisan2 = new YariZamanliCalisan (...)
	 * 		> Calisan calisan3 = new SozlesmeliCalisan (...)
	 * 			> calisan2.calis --> Calisan class'ında tanımlanmış, YariZamanli class'ında 
	 * 			  override edilmiş "calis" metodu gelir (çünkü ref Calisan class'ı ve obje ise YariZamanli class'ı)
	 * 4) Objesi subclass'a ait olan superclass referansı ile override edilmiş subclass metodu çağrılmalı
	 * 
	 * 
	 * Not: Polymorphism runtime sırasında çalışır
	 * Compile sırasında burada bir polymorphism olduğunu bilmiyor
	 * 
	 * Önemli:
	 * Javac normalde kodu compile ederken override olmasa da bir metodun override edilip edilmemiş olmasına bakıyor
	 * Kodun daha hızlı çalışmasını istiyorsam metoda, modifier olarak "final" keywordu yazmalıyım
	 * Bu sayede metod için override kontrolü yapılmaz
	 */
	
	
	
	// Hocanın açıklaması:
	
	/*
	 * Polymorphism için gerekli malzemeler
	 * 1) Inheritance (extends) sub-class - super class ilişkisi olacak
	 * 2) Bir method override edilmiş olmalı
	 * 3) super class a ait bir referans yaratılmalı
	 * 4) o (super class) referansı subclass tan yaratılmış bir objeye işaret etmeli
	 * 5)  o (super class) referansı kullanılılarak override edilmiş method çağırılmalı
	 * işte o an olan olaya Polymorphism diyoruz
	 */
	
	
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
