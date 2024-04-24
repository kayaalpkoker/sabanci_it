package edu.sabanciuniv.it524.domain.player;

public class Midfielder extends Player {
	
	private int passes;

	public Midfielder() {
		super();
	}

	public Midfielder(String playerName, int age, int jerseyNo, int goals, int assists, int strength, int agility,
			int stamina, int yellowCards, int redCards, boolean hasBall, int passes) {
		super(playerName, age, jerseyNo, goals, assists, strength, agility, stamina, yellowCards, redCards, hasBall);
		this.passes = passes;
	}

	public int getPasses() {
		return passes;
	}

	public void setPasses(int passes) {
		this.passes = passes;
	}
	
	
	
}
