package edu.sabanciuniv.it524.oop;

public class MainClassRAM {

	public static void main(String[] args) {
		
		Araba a1 = new Araba("Caner", "Anadol");
		
		Araba a2 = new Araba("Onur","Şahin");
		
		a1 = a2;
		
		a1.git();
		
		a2.git();
		
		a2 = null;

		//eger GC (Garbage collector çalışırsa ) RAM de kaç obje kalır
		
		//System.out.println(a1.sahibi);
		//System.out.println(a2.sahibi);
		
		//if (a2 != null)
		//{
			a2.git();
	//	}
		
		
		
			
			
			
			Araba abc = new Araba("Jane","Ferrari");
			
			abc.sahibi = "Veli";
			
			

	}

}
