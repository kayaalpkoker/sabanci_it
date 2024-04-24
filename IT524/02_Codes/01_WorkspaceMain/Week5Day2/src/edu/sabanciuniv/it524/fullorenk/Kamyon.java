package edu.sabanciuniv.it524.fullorenk;

public class Kamyon extends Arac implements Sigortalanabilir,Kiralanabilir{

	@Override
	public boolean hareketEt(int hiz) {
		System.out.println("Kamyon "+hiz+ " hzla gidiyor");
		return true;
	}

	@Override
	public void sigortala() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sigortaBitir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kirala() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void kiraBitir() {
		// TODO Auto-generated method stub
		
	}

}
