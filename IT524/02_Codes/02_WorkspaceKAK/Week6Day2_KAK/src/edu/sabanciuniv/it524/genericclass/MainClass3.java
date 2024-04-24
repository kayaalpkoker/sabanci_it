package edu.sabanciuniv.it524.genericclass;

import java.util.ArrayList;

public class MainClass3 {

	public static void main(String[] args) {
		
		ArrayList isimler = new ArrayList(); //Raw type ArrayList
											 //i.e ArrayList<Object>
		isimler.add("aaa");
		isimler.add("bbb");
		isimler.add("ccc");
		isimler.add(123);
		
		Integer uc = (Integer) isimler.get(3); //Type Casting burada zorunlu
		 
		int z = 145 * uc;
		System.out.println(uc);
		
		String c = (String)isimler.get(0);
		

		
		ArrayList<String> names = new ArrayList<>(); //String ArrayList: ArrayList<String>
		names.add("zzz");
		names.add("yyy");
		//names.add(334);
		
		String abc = names.get(1); //Type Casting yapmaya gerek yok
		
		
		/*
		 * The first line of code creates an ArrayList object that can store elements of any 
		 * type (since it uses the raw type ArrayList). The second line of code creates an ArrayList object 
		 * that can only store elements of type String.

		 * Using the raw type ArrayList can lead to problems because it can cause unchecked warnings at 
		 * runtime and can result in ClassCastExceptions when attempting to retrieve elements from the 
		 * list. It is generally better to use the parameterized type (e.g. ArrayList<String>) to 
		 * avoid these issues.

		 */
		
	}

}
