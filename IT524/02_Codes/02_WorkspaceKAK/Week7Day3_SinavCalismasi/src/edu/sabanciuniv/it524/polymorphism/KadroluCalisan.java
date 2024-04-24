package edu.sabanciuniv.it524.polymorphism;

public class KadroluCalisan extends Calisan {
	
	private double maas;
	
	
	public KadroluCalisan() {
		super();
	}
	
	// Bu superclass+subclass field'lı constructor'u source'tan generate et
	public KadroluCalisan(String calisanAdi, String calisanSoyadi, int tcKimlikNo, double maas) {
		super(calisanAdi, calisanSoyadi, tcKimlikNo);
		this.maas = maas;
	}


	@Override
	public void calis() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double maasHesapla() {
		// TODO Auto-generated method stub
		return 0;
	}

}
