package edu.sabanciuniv.it524.oop;

public class MainClass1 {

	public static void main(String[] args) 
	{
		
		Araba araba1 = new Araba();
		araba1.git();
		
		
		Araba araba2 = new Araba("Ahmet","Bentley");
		araba2.git();
		
		Araba araba3 = new Araba();
		araba3.sahibi = "Mahmut";
		araba3.git();
		
		
		araba2.dur();
		araba3.dur();
		
		araba1.dur();
		
		
		String isim = "John";
		
		Araba araba4 = new Araba(isim, "TOGG");
		araba4.git();
		
	}




}
