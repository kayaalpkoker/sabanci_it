package edu.kayaalp.koker.q1;

public class Country {
	
	private String countryName;
	private String countryCapital;
	private long countryPopulation;
	
	public Country() {
		super();
	}
	
	public Country(String countryName, String countryCapital, long countryPopulation) {
		super();
		this.countryName = countryName;
		this.countryCapital = countryCapital;
		this.countryPopulation = countryPopulation;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryCapital() {
		return countryCapital;
	}

	public void setCountryCapital(String countryCapital) {
		this.countryCapital = countryCapital;
	}

	public long getCountryPopulation() {
		return countryPopulation;
	}

	public void setCountryPopulation(long countryPopulation) {
		this.countryPopulation = countryPopulation;
	}

	@Override
	public String toString() {
		return countryName + " (Capital: " + countryCapital + ", Population: "
				+ countryPopulation + ")";
	}
	
	
	
	
}
