package edu.sabanciuniv.it524.exceptionhandling;

import javax.swing.JOptionPane;

public class MainClass {

	public static void main(String[] args) {
		
		//Kullanıcıdan input alacağım
		//showInputDialog bir static metod, çünkü Class adıyla çağrılıyor ;)
		String input = JOptionPane.showInputDialog("Lütfen bir sayı giriniz");
		
		int sayi;
		
		try {
			sayi = Integer.parseInt(input); //Bir String'i int'e parseInt ile çeviririz
			JOptionPane.showMessageDialog(null, "Girdiğiniz sayı: " +sayi);

		}
		//Exception, tüm exception'ların superclass'ı
		//Spesifik exception da girilebilir
		catch (Exception e) {
			e.printStackTrace(); //Eğer exception'ın ne olacağını bilmiyorsanız bunu kullanabilirsiniz
			JOptionPane.showMessageDialog(null, "Olmadı cnm");
		}
		
		
		
		
		
		
	}

}
