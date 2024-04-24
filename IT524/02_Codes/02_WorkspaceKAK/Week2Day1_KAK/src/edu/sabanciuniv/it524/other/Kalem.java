package edu.sabanciuniv.it524.other;

public class Kalem {
	public String renk;
	public String madde; // Kalem için burada yarattığımız özelliklere java'cılar "field" diyor.
	// attribute, vs diyen de var

	/* Aşağıda bir metod tanımlayacağım
	 Metodlar nokta ile, ".metodİsmi" şeklinde yazılır
	 
	 
	 Metodlar ikiye ayrılıyor: 
	 1) Bir şey return eden
	 		> Metodun başına return ettiği data type'ın referansını yaz!
	 		> public String yaz() {...
	 2) Bir şey return etmeyen
	 		> Metodun başına "void" yaz
	 		> public void yaz() {...
	 
	 
	 Eğer void ile metod tanımlıyorsak metod içinde bir şey return edemezsiniz!
	*/
	
	// void'i, python'daki def gibi okuyabilirsiniz
	public void yaz() {
		System.out.println("Kalem bilgisi: " + renk + " - " + madde);
	}

}
