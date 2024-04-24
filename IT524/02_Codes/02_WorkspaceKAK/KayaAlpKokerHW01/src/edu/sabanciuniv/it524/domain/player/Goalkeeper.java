package edu.sabanciuniv.it524.domain.player;

public class Goalkeeper extends Player {
	
	private int saves;

	public Goalkeeper() {
		super();
	}

	public Goalkeeper(String playerName, int age, int jerseyNo, int goals, int assists, int strength, int agility,
			int stamina, int yellowCards, int redCards, boolean hasBall, int saves) {
		super(playerName, age, jerseyNo, goals, assists, strength, agility, stamina, yellowCards, redCards, hasBall);
		this.saves = saves;
	}

	public int getSaves() {
		return saves;
	}

	public void setSaves(int saves) {
		this.saves = saves;
	}

	
	
	
	
	
	
}
