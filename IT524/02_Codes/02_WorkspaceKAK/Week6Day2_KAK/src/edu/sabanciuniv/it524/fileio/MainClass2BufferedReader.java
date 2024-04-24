package edu.sabanciuniv.it524.fileio;

import java.io.BufferedReader;
import java.io.FileReader;

public class MainClass2BufferedReader {
	
	public static void main(String[] args) {
		
		// 2) BufferedReader
		/* 		BufferedReader'ı yaratmak da bir design pattern > Decorator
		
		 * 		read() değil readLine() kullanıyoruz
		 * 		readLine() çalışma mantığı: \n görünce duruyor
		 * 		BufferedReader'ın tek sıkıntısı: \n okumaz. Dolayısıyla allText += line değil, allText += line + \n
		 */ 	
		 
		
		try {
			
			FileReader reader = new FileReader("syllabus.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			
			String allText = "";
			
			while(true) {
				String line = bufferedReader.readLine();
				if(line==null)
					break;
				allText += line + "\n";
			}
			
			System.out.println(allText);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}
