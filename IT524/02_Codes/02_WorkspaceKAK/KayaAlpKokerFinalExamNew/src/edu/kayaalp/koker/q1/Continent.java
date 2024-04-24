package edu.kayaalp.koker.q1;

import java.util.ArrayList;

public class Continent {
	
	private String continentName;
	private ArrayList <Country> countries = new ArrayList<>();
	
	public Continent() {
		super();
	}
	
	public Continent(String continentName, ArrayList<Country> countries) {
		super();
		this.continentName = continentName;
		this.countries = countries;
	}
	
	public Continent(String continentName) {
		super();
		this.continentName = continentName;
	}

	public String getContinentName() {
		return continentName;
	}

	public void setContinentName(String continentName) {
		this.continentName = continentName;
	}

	public ArrayList<Country> getCountries() {
		return countries;
	}

	public void setCountries(ArrayList<Country> countries) {
		this.countries = countries;
	}

	@Override
	public String toString() {
		return continentName;
	}

	public void addCountry(Country country) {
		this.countries.add(country);
	}
	
	
	
	
}
