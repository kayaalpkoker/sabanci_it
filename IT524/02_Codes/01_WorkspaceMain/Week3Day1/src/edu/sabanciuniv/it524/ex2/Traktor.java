package edu.sabanciuniv.it524.ex2;

public class Traktor {
	
	private boolean calisiyor;
	private String marka ;
	private int hiz;
	private Romorkor romorkor;
	
	public Traktor(String marka)
	{
		this.marka = marka;
		this.calisiyor = false;
		this.hiz = 0;
	}

	public void gazaBas() {
		
		if( this.calisiyor == true)
		{
			if (this.romorkor == null)
			{
				this.hiz +=10 ;	
			}
			else
			{
				this.hiz += (10/this.romorkor.getAgirlik())*2;
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
