package edu.sabanciuniv.it524.fileio;

import java.io.BufferedReader;
import java.io.FileReader;

public class MainClass1FileReader {

	public static void main(String[] args) {
		
		/*
		 * FileIO classlar'ındaki tüm metodlarda (dosya okuma-yazma operasyonları) throw exception vardır
		 * Bu class'ları yazanlar ilgili dosyanın olmaması, yetki eksikliği, vb sebepler yüzünden koymuş
		 * Her metodda try-catch kullanmak zorundayım
		 */
		
		/*
		 * Dosyayı okumanın -read()- birden fazla yolu var:
		 * 
		 * 1) FileReader (en yavaş okuma şekli)
		 * 2) BufferedReader (biraz daha hızlı)
		 * 3) Dosya boyutu ile FileReader (en hızlısı)
		 */ 			
		
		
		// 1) FileReader ile normal okuma

		/* FileReader nasıl çalışıyor?
		 * Tek bir read() metodu harf harf okuyor
		 * integer olarak okuma yapıyor (harfin ASCII kodunu veriyor)
		 */		
		
		 
		try {
			
			FileReader reader = new FileReader("syllabus.txt");
			String allText = "";
			
			while(true) {	// while(true) = Sonsuza kadar dön -- Alternatif: while(line != null)
				int harf = reader.read();
				if(harf == -1)	// -1 dememizin sebebi: Dosya bittikten sonra read() yapılınca by default -1 okunuyor
					break;
				allText += (char)harf;	//int olarak okuma yaptığı için allText string'ine eklerken char'a cast ediyorum
			}
			
			System.out.println(allText);
			reader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}

}
