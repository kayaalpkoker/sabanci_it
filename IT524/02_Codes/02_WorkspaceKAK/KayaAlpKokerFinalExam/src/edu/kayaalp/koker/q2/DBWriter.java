package edu.kayaalp.koker.q2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class DBWriter {

	public DBWriter() {
		super();
	}

	public void writeTextToDatabase(String fileName) {
		
		ArrayList<String[]> products = new ArrayList<>();
        
		String allText = "";//
		ArrayList <String> sList = new ArrayList<>();
		
		try (FileReader reader = new FileReader(fileName);
				BufferedReader bufferedReader = new BufferedReader(reader)) {
			
			while(true) {
				String line = bufferedReader.readLine();
				if(line==null)
					break;
				allText += String.join(" ", line.split(",")) + "\n";
				allText = allText.replace("{ name : ", "");
				allText = allText.replace("  count : ", "");
				allText = allText.replace(" }", "");
//				allText = line.split(",") + "\n";
//				sList.add(allText);

				
			}
						
        } catch (Exception e) {
            e.printStackTrace();
        }
		
		for (String line : sList) {
			System.out.println(line.toString());
		}
		
		/*
		 * 
		 * Hocam doğru şekilde parse'layamadım, bütün zamanımı da parse'a harcadım
		 * Sayenizde parse'a doğru başlayabildim ama zaman yetmedi :(
		 * Ancak mimari şu şekilde olacaktı:
		 * 1. Bir String[] arraylist'i yarat, her satır iki index'li olarak burada kalacaktı
		 * 2. DAO ile DB'ye atarken
		 * 		> if (ürün varsa update et ve count'ları topla)
		 * 		> ürün yoksa yeni yarat
		 * 
		 * 
		 * 
		 */
	
		
	}
}
	

