package edu.sabanciuniv.it524;

import java.util.Arrays;

public class MainClass 
{
  public static void main(String[] args) 
  {
    int x = 5;
    int y = 10;
    int a = 1, b = 2, c = 3;
    String d = "Tester", e = " Parfume";
    char f = 'm';
    
    System.out.println(2*2); 
    System.out.println("Wow");
    System.out.println(x+y);
    System.out.println(a+b+c);
    System.out.println(d+e);
    System.out.println(f);
    
    System.out.println("\n");
    
	String[] cars = {"Mercedes","BMW","Porsche"};
	System.out.println(cars);
	System.out.println(Arrays.toString(cars));
	System.out.println(cars.length);
	System.out.println(cars.getClass());
	
    System.out.println("\n");
	
	String car = "Mercedes";
	System.out.println(car.length());
	System.out.println(car.toCharArray());
	System.out.println(car.toUpperCase());
	System.out.println(car.toLowerCase());
	System.out.println(car.indexOf("rced"));
	
    System.out.println("\n");
	
	String firstName = "John";
	String lastName = "Doe";
	System.out.println(firstName+" "+lastName);
	System.out.println(firstName.concat(lastName));
	System.out.println(x+firstName);  //Returns as a string!
	
    System.out.println("\n");
	
	int randomNum = (int)(Math.random() * 101);  // 0 to 100
	System.out.println(randomNum);
	
  }
}