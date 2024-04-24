package edu.sabanciuniv.it524.polymorphism;

public class SozlesmeliCalisan extends Calisan {
	
	private double sozlesmeSuresiAy;
	private double aylikUcret;

	public SozlesmeliCalisan(String calisanAdi, String calisanSoyadi, int tcKimlikNo, 
			double sozlesmeSuresiAy, double aylikUcret) {
		super(calisanAdi, calisanSoyadi, tcKimlikNo);
		this.sozlesmeSuresiAy = sozlesmeSuresiAy;
		this.aylikUcret = aylikUcret;
	}

	@Override
	public void calis() {
		System.out.println("Sözleşmeli çalışan " + this.getCalisanAdi() + " çalışıyor." );

	}

	@Override
	public double maasHesapla() {
		return (this.sozlesmeSuresiAy * this.aylikUcret); 
		
	}

}
