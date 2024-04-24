package edu.kayaalp.koker.q1;

import java.util.ArrayList;

public class World {
	
	private ArrayList<Continent> continents = new ArrayList<>();

	public World() {
		super();
	}

	public World(ArrayList<Continent> continents) {
		super();
		this.continents = continents;
	}

	public ArrayList<Continent> getContinents() {
		return continents;
	}

	public void setContinents(ArrayList<Continent> continents) {
		this.continents = continents;
	}

	@Override
	public String toString() {
		return "World [continents=" + continents + "]";
	}

	public void addContinent(Continent continent) {
		this.continents.add(continent);
	}

	public void printInfo() {
		System.out.println("There are " + continents.size() + " continents in the world: " + this.continents);
		
		for (Continent continent : continents) {
			if (continent.getCountries().size() > 0) {
				System.out.println("There are " + continent.getCountries().size() + " countries in " + continent);
				for (Country country : continent.getCountries()) {
					System.out.println("\t" + country);
				}
			}
			else {
				System.out.println("There are no countries in " + continent);
			}
		}
	}
	
	
	
	
	
	
	
}
