package edu.sabanciuniv.it524.main6.fullOrnek;

public class Kamyon extends Arac implements Kiralanabilir, Sigortalanabilir {

	@Override
	public int hareketEt(int hiz) {
		this.hareketEdiyor = true;
		return this.hiz = hiz;
	}

	@Override
	public void sigortala() {
		
	}

	@Override
	public void sigortaBitir() {
		
	}

	@Override
	public void kirala() {
		
	}

	@Override
	public void kiraBitir() {
		
	}
	
	
	
	
	
}
