package edu.sabanciuniv.it524.domain.infrastructure;

public class Field {
	
	private double width;
	private double height;
	private double goalAreawidth;
	private double goalArealength;
	
	public Field() {
		super();
	}

	public Field(double width, double height, double goalAreawidth, double goalArealength) {
		super();
		this.width = width;
		this.height = height;
		this.goalAreawidth = goalAreawidth;
		this.goalArealength = goalArealength;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getGoalAreawidth() {
		return goalAreawidth;
	}

	public void setGoalAreawidth(double goalAreawidth) {
		this.goalAreawidth = goalAreawidth;
	}

	public double getGoalArealength() {
		return goalArealength;
	}

	public void setGoalArealength(double goalArealength) {
		this.goalArealength = goalArealength;
	}
	
	
	
	
}