package edu.sabanciuniv.it524.ex2.aggregation;

public class Traktor {
	
	private boolean calisiyor = false;
	private String marka;
	private int hiz;
	private Romorkor romorkor;		//has-a relationship > aggregation > traktor varolmak için romorkore 
									//gerek yok, birbirlerinden bağımsız varolabilirler
	
	public Traktor(String marka) {   // Constructor yaratırken tüm parametreleri eklemeye gerek yok
									 // Software design kararına göre istediğiniz gibi oluşturabilirsiniz
		this.calisiyor = false;
		this.marka = marka;
	}
	
	
	public void gazaBas() {
		if (this.calisiyor == true) {     // Eğer bir class'ın içinde o class'ın field'larıyla
			if (this.romorkor == null) {  // metod yazıyorsanız bu field'ları "this." ile kullanın! 
				this.hiz += 10;	// Aksi takdirde metod parametreleri ile class field'ları ile karışabilir!
			}
			else {
				this.hiz += (10/this.romorkor.getAgirlik());
				
			}
			System.out.println("Traktor saatte "+hiz +"km hızla gidiyor");
		}
		else
		{
			System.out.println("Önce traktörü çalıştırınız");
		}							
	}
	
	public void calistir() {
		 this.calisiyor = true;	
	}

	public void freneBas() {
		System.out.println("Frene basıldı ve durdu");
		this.hiz = 0;		
	}

	public void romorkorTak(Romorkor romorkor) {
		this.romorkor = romorkor;		
	}
	
	
	
	
	
}
