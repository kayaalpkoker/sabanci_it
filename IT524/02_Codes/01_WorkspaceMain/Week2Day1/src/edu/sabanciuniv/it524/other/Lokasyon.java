package edu.sabanciuniv.it524.other;

public class Lokasyon {
	public double enlem;
	public double boylam;
	
	//Empty veya Default Constructor
	public Lokasyon()
	{
		enlem = -1;
		boylam = -1;
	}
	
	public Lokasyon(double d1)
	{
		enlem = d1;
		boylam = 0;
	}
	
	//Full veya Copy Constructor
	public Lokasyon(double d1,double d2)
	{
		enlem = d1;
		boylam = d2;
	}
	
	public void bilgiGoster()
	{
		System.out.println("("+enlem + " , " + boylam + ")");
	}
	
	


}
