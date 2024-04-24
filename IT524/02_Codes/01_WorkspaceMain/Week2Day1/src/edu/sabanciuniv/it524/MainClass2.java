package edu.sabanciuniv.it524;

import edu.sabanciuniv.it524.other.Lokasyon;

public class MainClass2 {

	public static void main(String[] args) {
		
		//Senaryo 1
		Lokasyon l1; //Referans Tanımlama 
		
		
		
		//Senaryo 2
		new Lokasyon(); //Obje yaratma (ama referansı (kumandası) yok)

		
		//Senaryo 3
		Lokasyon loc1 = new Lokasyon(22.02);
		
		loc1.bilgiGoster();
		
		
		loc1 = null; //Ben bu objeyi artık kullamıyorum
		
		
		
	}

}
