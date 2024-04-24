package edu.sabanciuniv.it524.domain.player;

public class Defender extends Player {
	
	private int tackles;
	private int blocks;
	
	
	public Defender() {
		super();
	}

	public Defender(String playerName, int age, int jerseyNo, int goals, int assists, int strength, int agility, int stamina,
			int yellowCards, int redCards, boolean hasBall, int tackles, int blocks) {
		super(playerName, age, jerseyNo, goals, assists, strength, agility, stamina, yellowCards, redCards, hasBall);
		this.tackles = tackles;
		this.blocks = blocks;
	}

	public int getTackles() {
		return tackles;
	}

	public void setTackles(int tackles) {
		this.tackles = tackles;
	}

	public int getBlocks() {
		return blocks;
	}

	public void setBlocks(int blocks) {
		this.blocks = blocks;
	}
	
	
	
	
	
}
