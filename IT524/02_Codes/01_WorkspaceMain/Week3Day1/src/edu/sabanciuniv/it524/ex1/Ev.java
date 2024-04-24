package edu.sabanciuniv.it524.ex1;

public class Ev {
	
	private String sahibi;
	private Kapi kapi;
	private Pencere sagPencere;
	private Pencere solPencere;
	public Ev(String sahibi, Kapi kapi, Pencere sagPencere, Pencere solPencere) {
		super();
		this.sahibi = sahibi;
		this.kapi = kapi;
		this.sagPencere = sagPencere;
		this.solPencere = solPencere;
	}

	public Ev(String sahibi)
	{
		this.sahibi = sahibi;
	}
	
	public Ev(String sahibi,String kapiRenk,String kapiMadde,
			String sagPencereRenk,boolean sagPencerePvc,
			String solPencereRenk,boolean solPencerePvc)
	{
		this.sahibi = sahibi;
		this.kapi = new Kapi(kapiRenk, kapiMadde);
		this.solPencere = new Pencere(solPencereRenk, solPencerePvc);
		this.sagPencere = new Pencere(sagPencereRenk, sagPencerePvc);
		
	}
	
	
	public void bilgileriGoster()
	{
		System.out.println("-----------------");
		System.out.println("Sahibi : "+sahibi);
		System.out.println("Kapı : "+kapi);
		System.out.println("Sag Pencere : "+sagPencere);
		System.out.println("Sol Pencere : "+solPencere);
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

	
	
}
