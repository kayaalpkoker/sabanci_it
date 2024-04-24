package edu.sabanciuniv.it524.parsers;

import java.io.BufferedReader;
import java.io.FileReader;

public class CSVParser extends TextFileParser{

	@Override
	public String readFile(String filePath) {
		
		String allText = "";
		
		try (FileReader reader = new FileReader(filePath);
				BufferedReader bufferedReader = new BufferedReader(reader)) {
			
			while(true) {
				String line = bufferedReader.readLine();
				if(line==null)
					break;
				allText += String.join(" ", line.split(",")) + "\n";
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return allText;
	}
	
}
