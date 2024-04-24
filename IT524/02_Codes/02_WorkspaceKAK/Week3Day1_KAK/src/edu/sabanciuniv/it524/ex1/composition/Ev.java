package edu.sabanciuniv.it524.ex1.composition;

public class Ev {
	
	/* Daha önce yarattığımız class'lar içindeki fieldları hep primitive data 
	 * tipleri ve String olarak tutmuştuk.
	 * Şimdi ise bu field'ları birer obje tipinde tutacağız.
	 * 		>> Unutma: Field'lar birer referans/pointer, "field'ların karşısına obje gelecek" diyoruz aslında
	 * Field'ların karşısına obje gelecek diyorsam, bu field'lar için ayrı class'larım olmalı
	 */
	
	private String sahibi;			// Bir class'ın field'ları aslında pointer/referans
	private Kapi kapi;				// Karşısına obje gelecek (primitive data type gelmeyecek) field
	private Pencere sagPencere;		// Karşısına obje gelecek (primitive data type gelmeyecek) field
	private Pencere solPencere;		// Karşısına obje gelecek (primitive data type gelmeyecek) field
	
	
	public Ev(String sahibi) {
		this.sahibi = sahibi;
	}
	
	
	public Ev(String sahibi, Kapi kapi, Pencere sagPencere, Pencere solPencere) {
		super();
		this.sahibi = sahibi;
		this.kapi = kapi;
		this.sagPencere = sagPencere;
		this.solPencere = solPencere;
	}


	// "Eğer tek tek bileşen tanımlayıp sonra eve takmak istemiyorsam,
	// tek seferde her şeyi tamam olan ev oluşturmak istiyorsam nasıl olur?"
	
	// Tek seferde tüm bileşenleri yaratan constructor:
	// Bunu manuel olarak yaratmam gerekiyor, source ile yukarıdakini çıkarabiliyorum sadece

	public Ev(String sahibi, String kapiRenk, String kapiMadde, 
			String sagPencereRenk, boolean sagPencerePvc,
			String solPencereRenk, boolean solPencerePvc) {
		this.sahibi = sahibi;
		this.kapi = new Kapi(kapiRenk, kapiMadde);
		this.solPencere = new Pencere(sagPencereRenk, sagPencerePvc);
		this.sagPencere = new Pencere(solPencereRenk, solPencerePvc);
		
	}
	
	
	
	
	public void bilgileriGoster() {
		System.out.println("-----------------");
		System.out.println("Sahibi: " + sahibi);
		System.out.println("Kapı: " + kapi);
		System.out.println("Sağ pencere: " + sagPencere);
		System.out.println("Sol pencere: " + solPencere);
		System.out.println("-----------------");	
		
	}

	public String getSahibi() {
		return sahibi;
	}

	public void setSahibi(String sahibi) {
		this.sahibi = sahibi;
	}

	public Kapi getKapi() {
		return kapi;
	}

	public void setKapi(Kapi kapi) {
		this.kapi = kapi;
	}

	public Pencere getSagPencere() {
		return sagPencere;
	}

	public void setSagPencere(Pencere sagPencere) {
		this.sagPencere = sagPencere;
	}

	public Pencere getSolPencere() {
		return solPencere;
	}

	public void setSolPencere(Pencere solPencere) {
		this.solPencere = solPencere;
	}


	@Override
	public String toString() {
		return "Ev [sahibi=" + sahibi + ", kapi=" + kapi + ", sagPencere=" + sagPencere + ", solPencere=" + solPencere
				+ "]";
	}
	
	
	

}
