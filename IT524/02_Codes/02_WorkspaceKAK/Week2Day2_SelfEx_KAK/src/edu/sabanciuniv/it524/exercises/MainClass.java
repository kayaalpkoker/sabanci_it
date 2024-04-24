package edu.sabanciuniv.it524.exercises;

import edu.sabanciuniv.it524.exercises.methods.Meal;

public class MainClass {

	public static void main(String[] args) {
		
		// METHOD 1
		
		Meal mealTest = new Meal();
//		mealTest.getInfo();
		
		// Double olan date verilerini şu şekilde nasıl formatlarım: "07:00"
		Meal meal1 = new Meal("Breakfast", 07.00, 10.00, 8.30);
//		meal1.getInfo();
		
		Meal meal2 = new Meal("Lunch", 13.00, 16.00, 13.0);
//		meal2.getInfo();
		
		String newMeal1 = "Dinner";
		Meal meal3 = new Meal(newMeal1, 18.00, 22.00, 18.0);
//		meal3.getInfo();
		
		
		
		// METHOD 2
		//How to call a method without an object?
			// 1) Diğer class içinden kullanılacak method'u static yap + 
			// 2) Kullanılacak methodun başına içinde olduğu class'ı yaz 
			// 		>> Meal.greet(time1)
		
		double time1 = 8.00;
//		Meal.greet(time1);
		
		
	}

}
