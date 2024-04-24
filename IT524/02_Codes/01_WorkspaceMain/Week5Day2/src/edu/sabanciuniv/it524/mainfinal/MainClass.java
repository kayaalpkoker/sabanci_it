package edu.sabanciuniv.it524.mainfinal;

public class MainClass {

	public static void main(String[] args) {
		
		int r = 2;
		
		double alan = GlobalVariables.piSayisi * r *r;
		
		System.out.println(alan);
		
		
		GlobalVariables.piSayisi = 22/7;  //Değiştirmeme izin vermiyor çünkü pisayisi final değişken
	}

}
