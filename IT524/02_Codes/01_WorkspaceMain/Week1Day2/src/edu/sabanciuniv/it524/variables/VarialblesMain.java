package edu.sabanciuniv.it524.variables;

import java.util.Arrays;

public class VarialblesMain {
	public static void main(String[] args) {
		
		//Primitive types
		int a = 222; 		//32 bit (4 byte)
		long b = 222;		//64 bit (8 byte)
		
		float c = 100.6f;   //32 bit (4 byte)
		double d = 123.78d; //64 bit (8 byte)
		
		byte f = 127; 		//8 bit  (1 byte)  -128,+127 (8bit - 1 byte)  01000000            
		short e = 111; 		//16 bit (2 byte)
		
		char g = 'a';		//16 bit (2 byte)
		boolean h = true;	//1 bit
		
	   System.out.println(a);
	   
	   int[] sayilar = new int[8]; 	//{0,0,0,0,0,0,0,0}
	   sayilar[0] = 11;				//{11,0,0,0,0,0,0,0}
	   sayilar[1] = 22;				//{11,22,0,0,0,0,0,0}
	   sayilar[2] = 33;
	   sayilar[3] = 44;
	   sayilar[4] = 55;
	   sayilar[5] = 66;
	   sayilar[6] = 77;
	   sayilar[7] = 88;
	   //sayilar[8] = 99; // ArrayIndexOutOfBoundsException

	   
	   int[] numbers = {1,2,3};
	   
	   System.out.println(Arrays.toString(numbers));
	   
	   //Normal for loop
	   System.out.println("Normal for loop");
	   for (int i = 0 ;i<sayilar.length;i+=1)
		   
	   {
		   System.out.println(sayilar[i]);
	   }
	   //Enhanced (for each) for loop
	   System.out.println("Enhanced for loop");
	   for (int eleman : sayilar)
	   {
		   System.out.println(eleman);
	   }
	   
	   
	 //Normal while loop 
	   System.out.println("Normal while loop");
	   
	   int i = 0 ;
	   while (i<sayilar.length)   
	   {
		   System.out.println(sayilar[i]);
		   i+=1;
	   }
	   
	   
	   for(int x = 0;;x++) //Bunu yapmayın
	   {
//		   System.out.println("Ders bitti");
	   }
		
	}
}
