package edu.sabancuniv.it524.exceptionhandling;

public class MainClass2 {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		try {
			s1.tehlikeliMethod();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
