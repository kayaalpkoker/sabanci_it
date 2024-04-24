package edu.sabanciuniv.it524.exercises.methods;

public class Meal {
	
	public static String name;
	public double price;
	public double beginTime;
	public double endTime;
	
	
	public Meal () {
	}
	
	public Meal (String name, double beginTime, double endTime, double price) {
		Meal.name = name;
		this.beginTime = beginTime;
		this.endTime = endTime;
		this.price = price;
	
	}
	
	
	public Meal meal2 = new Meal("Lunch", 13.00, 16.00, 13.0);
	
	
	public void getInfo() {
		System.out.println("Course: " + name + "  Time: " + beginTime + " - " + endTime + "  Price: " + price + "$");
	}

	public void greet(double time) {   // Obje(?) girmeden, sadece bir variable ile çalışan method
		if (time >= 7.00 && time < 10.00) {
			System.out.println("Good morning! Welcome to " + name);
		}
		else if (time >= 13.00 && time < 16.00) {
			System.out.println("Good afternoon! Welcome to " + name);
		}
		else if (time >= 18.00 && time < 22.00) {
			System.out.println("Guten Abend! Welcome to " + name);
		}
		else if (time >= 22.00 && time < 24.00) {
			System.out.println("You can only order from the bar");
		}
		else if (time < 07) {
			System.out.println("Restaurant is closed!");
		}
		else {
			System.out.println("Restaurant is closed. We would like to welcome you at our cafe!");
		}
	}
	
	
}


