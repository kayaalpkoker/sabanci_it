package edu.sabanciuniv.it524.domain.player;

public class Forward extends Player {
	
	private int shots;
	private int shotsOnGoal;
	
	
	public Forward() {
		super();
	}

	public Forward(String playerName, int age, int jerseyNo, int goals, int assists, int strength, int agility, int stamina,
			int yellowCards, int redCards, boolean hasBall, int shots, int shotsOnGoal) {
		super(playerName, age, jerseyNo, goals, assists, strength, agility, stamina, yellowCards, redCards, hasBall);
		this.shots = shots;
		this.shotsOnGoal = shotsOnGoal;
	}

	public int getShots() {
		return shots;
	}

	public void setShots(int shots) {
		this.shots = shots;
	}

	public int getShotsOnGoal() {
		return shotsOnGoal;
	}

	public void setShotsOnGoal(int shotsOnGoal) {
		this.shotsOnGoal = shotsOnGoal;
	}
	
	
	
	
}
