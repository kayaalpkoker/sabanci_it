package edu.sabancuniv.it524.fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass2 {

	public static void main(String[] args) {
		
		//FileReader harf harf okur, BufferedReader ise satır satır okuyor
		//While döngüsü içine koyuyoruz, böylelikle tüm dosyayı okutuyoruz
		//Son satırı da okuduktan sonra bir sonraki okuma "null" döndüreceğinden, if == null, break dedim
		try {
			BufferedReader bfr = new BufferedReader(new FileReader("abc.txt"));
			String allFile = "";
			while(true)
			{
				String line = bfr.readLine();
				if(line==null)
					break;
				allFile +=line + "\n";
			}
			System.out.println(allFile);
			
		} catch (FileNotFoundException e) {
			System.out.println("Dosya yok");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("Okuma izniniz yok");
			e.printStackTrace();
		}
		
		

	}

}
