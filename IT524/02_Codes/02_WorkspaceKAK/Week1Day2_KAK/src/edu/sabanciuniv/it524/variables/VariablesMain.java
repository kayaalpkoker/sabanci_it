package edu.sabanciuniv.it524.variables;

import java.util.Arrays;

public class VariablesMain {

	public static void main(String[] args) {
		
		//Primitive data types
		byte a = 111;		//8 bit (1 byte)
		short b = 121;		//16 bit (2 byte)
		
		int c = 22;			//32 bit (4 byte)
		long d = 2222L;		//64 bit (8 byte)
		
		float e = 100.6f;	//32 bit (4 byte)
		double f = 123.78d;	//64 bit (8 byte)
		
		boolean g = true;	//1 bit
		char h = 'a';		//16 bit (2 byte)
		
		System.out.println(a);
		
		//Array
		int[] sayilar = new int[8]; //Kaç objesi olduğunu tanımlamalısınız
		
		sayilar[0] = 11;
		sayilar[1] = 22;
		sayilar[2] = 33;
		sayilar[3] = 44;
		sayilar[4] = 55;
		sayilar[5] = 66;
		sayilar[6] = 77;
		sayilar[7] = 88;
		// sayilar[8] = 99; // Error: ArrayIndexOutOfBoundsException
		
		int[] numbers = {1,2,3};
		
		System.out.println(numbers);
		System.out.println("Length of 'numbers' array: "  + numbers.length);
		//Bir array'i print etmeye çalıştığımda bir hash kodu veriyor
		//Bunun sebebi array'in bir obje olması, objeler doğrudan print edilemez
		
		//Yine de bastıracağım derseniz:
		System.out.println(Arrays.toString(numbers));
		
		
		//Normal for loop
		// bu aslında bir while?
		// for içindeki i'ye bir array index değeri vermek zorundayız
		// for (başlangıç değeri ; şart ; işlem)
		System.out.println("Normal for loop");
		for (int i=0 ; i<sayilar.length ; i+=1)
		{
			System.out.println(sayilar[i]);
		}

		//Enhanced for loop
		// Enhanced for "read only"dir, variable'lar ile işlem yapamazsınız
		System.out.println("Enhanced for loop");
		for (int eleman : sayilar)
		{
			System.out.println(eleman);
		}
		
		//Normal while loop
		
		
	}

}
