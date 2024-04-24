package edu.sabanciuniv.it524.domain;

public class Stadium {
	
	private String stadName;
	private String stadLocation;
	private int stadCapacity;
	
	
	public Stadium() {
		super();
	}

	public Stadium(String stadiumName, String location, int capacity) {
		super();
		this.stadName = stadiumName;
		this.stadLocation = location;
		this.stadCapacity = capacity;
	}

	public String getStadName() {
		return stadName;
	}

	public void setStadName(String stadName) {
		this.stadName = stadName;
	}

	public String getStadLocation() {
		return stadLocation;
	}

	public void setStadLocation(String stadLocation) {
		this.stadLocation = stadLocation;
	}

	public int getStadCapacity() {
		return stadCapacity;
	}

	public void setStadCapacity(int stadCapacity) {
		this.stadCapacity = stadCapacity;
	}

	
	
}
