package edu.sabanciuniv.it524.observer;

public class Araba extends TrafikIsigiBekleyicisi{
	
	private String sahibi;

	public Araba(String sahibi) {
		super();
		this.sahibi = sahibi;
	}

	@Override
	public void git()
	{
		System.out.println(this.sahibi + "nin Arabası gidiyor");
	}
	
	@Override
	public void dur()
	{
		System.out.println(this.sahibi + "nin Arabası durdu");
	}

}
