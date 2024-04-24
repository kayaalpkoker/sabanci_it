package edu.sabanciuniv.it524.domain;

public class House implements Insurable{
	
	//Şu anki haliyle bu class kötü dizayn
	private String owner;

	public House(String name) {
		//Bunu daha önce başka bir class ta yapmıştık
		//Bu yüzden tüm owner bilgisi olan class ları
		//Asset adlı bir class tan türetebiliriz
		//Yani Vehicle ve Insurable extends Asset olsa iyi olur
		this.owner = name;	
	}

	@Override
	public void getInsured() {
		System.out.println(this.owner + " ` House is insured by ???");
	}
	
	
}
