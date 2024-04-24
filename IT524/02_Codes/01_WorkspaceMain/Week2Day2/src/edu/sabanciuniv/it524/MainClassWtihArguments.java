package edu.sabanciuniv.it524;

public class MainClassWtihArguments {

	public static void main(String[] degerler) 
	{
		
		/*
		int []  sayilar = new int[4];
		sayilar[0] = 123;
		System.out.println(sayilar);
		*/
		//degerler[0] = "Ahmet";
		degerler[1] = "Ahmet";
		for (int i = 0; i < degerler.length; i++) {
			System.out.println(degerler[i]);
		}

	}
	
	//toplama(int x, int y) method signature
	static int toplama(int x, int y)
	{
		return x + y;
	}
	
	

}
