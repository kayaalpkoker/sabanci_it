package edu.sabanciuniv.it524.polymorphism;

import java.util.ArrayList;

public class Sirket {
	
	private String sirketAdi;
	private ArrayList<Calisan> calisanlar = new ArrayList<>();
	
	public Sirket() {
		super();
	}
	
	public Sirket(String sirketAdi, ArrayList<Calisan> calisanlar) {
		super();
		this.sirketAdi = sirketAdi;
		this.calisanlar = calisanlar;
	}
	
	public String getSirketAdi() {
		return sirketAdi;
	}
	public void setSirketAdi(String sirketAdi) {
		this.sirketAdi = sirketAdi;
	}
	public ArrayList<Calisan> getCalisanlar() {
		return calisanlar;
	}
	public void setCalisanlar(ArrayList<Calisan> calisanlar) {
		this.calisanlar = calisanlar;
	}
	
	
	public void calisanlariSay() {
		for (Calisan calisan : calisanlar) {
			System.out.println(calisan);
		}
	}
	
	public void sozlesmeliCalisanIseAl (String calisanAdi, String calisanSoyadi, int tcKimlikNo, 
			double sozlesmeSuresiAy, double aylikUcret) {
		Calisan calisan = new SozlesmeliCalisan(calisanAdi, calisanSoyadi, tcKimlikNo, 
				sozlesmeSuresiAy, aylikUcret);
		
	}
	
	
	
}
