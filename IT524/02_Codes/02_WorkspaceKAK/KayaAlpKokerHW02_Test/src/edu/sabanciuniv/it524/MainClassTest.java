package edu.sabanciuniv.it524;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class MainClassTest {

	public static void main(String[] args) {
					
		String allText = "";
		
		try (FileReader reader = new FileReader("students.csv");
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
		
		System.out.println(allText);
		
		
		
		try (FileWriter writer = new FileWriter("output.txt")) {
			
			writer.write(allText);
			writer.flush();
			
			String saveMessage = "Your file saved as 'output.txt'!";			
			
		} catch (Exception ex) {
			ex.printStackTrace();
		
		}
		
		
		
		
		
		
		
		
	}

}
