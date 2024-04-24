package edu.sabancuniv.it524.exceptionhandling;

import java.io.FileNotFoundException;

import javax.swing.JOptionPane;

public class MainClass {

	public static void main(String[] args) {
		
		String input1 = 
				JOptionPane.showInputDialog("Lütfen birinci sayıyı giriniz : ");
		String input2 = 
				JOptionPane.showInputDialog("Lütfen ikinci sayıyı giriniz : ");
		int sayi1;
		int sayi2;
		int sonuc;
		try
		{
			sayi1 = Integer.parseInt(input1);
			sayi2 = Integer.parseInt(input2);
			
		
			sonuc = sayi1 /sayi2;
			JOptionPane.showMessageDialog(null, "Sonuç : "+sonuc);
			
		} 
		catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Olmadı  Number format");
		}
		catch (ArithmeticException e)
		{
			e.printStackTrace();
			String txt = "";
			for (StackTraceElement element : e.getStackTrace())
			{
				txt += element;
			}
			
			JOptionPane.showMessageDialog(null, "Olmadı ArithmeticException"+txt);
		}

		
		
		

	}

}
