package edu.sabancuniv.it524.exceptionhandling;

import javax.swing.JOptionPane;

public class MainClass3 {

	public static void main(String[] args) {
		
		
		Calculator calc = new Calculator();
		try {
			calc.bolme(123, 1);
		} catch (AhmetException e) {
			JOptionPane.showMessageDialog(null, "Ahmet Exception oluştu "+e.getMessage());
			e.printStackTrace();
		}

		
		Student s2 = new Student();
		try {
			s2.tehlike2();
		} catch (AhmetException e) {
			e.getMessage();
			e.printStackTrace();
		}
		
	
	}

}
