package edu.sabanciuniv.it524.srs;

import java.util.ArrayList;

public class GradStudent extends Student {
	

	private String thesisTopic;

	public GradStudent() {
		super();
	}

	public GradStudent(int id, String name, String lastname,String thesisTopic) {
		super(id, name, lastname);
		this.thesisTopic = thesisTopic;
	}

	

	//Overriding
	@Override
	public void printInfo() {
		System.out.println("-----------------------------------------");
		System.out.println("Grad Student id : "+this.getId());
		System.out.println("Grad Student name : "+this.getName());
		System.out.println("Grad Student lastname : "+this.getLastname());
		System.out.println("Grad Student Thesis : "+this.getThesisTopic());
		System.out.println("-----------------------------------------");
		System.out.println("											");

	}

	public String getThesisTopic() {
		return thesisTopic;
	}

	public void setThesisTopic(String thesisTopic) {
		this.thesisTopic = thesisTopic;
	}
	

}
