package edu.sabanciuniv.it524.domain.player;

public class Player {
	
	private String playerName;
	private int age;
	private int jerseyNo;
	private int goals;
	private int assists;
	private int strength;
	private int agility;
	private int stamina;
	private int yellowCards;
	private int redCards;
	private boolean hasBall;
	
	
	public Player() {
		super();
	}
	public Player(String playerName, int age, int jerseyNo, int goals, int assists, int strength, int agility, int stamina,
			int yellowCards, int redCards, boolean hasBall) {
		super();
		this.playerName = playerName;
		this.age = age;
		this.jerseyNo = jerseyNo;
		this.goals = goals;
		this.assists = assists;
		this.strength = strength;
		this.agility = agility;
		this.stamina = stamina;
		this.yellowCards = yellowCards;
		this.redCards = redCards;
		this.hasBall = hasBall;
	}
	
	public Player(String name, int age, int jerseyNo, int strength, int agility, int stamina) {
		super();
		this.playerName = name;
		this.age = age;
		this.jerseyNo = jerseyNo;
		this.goals = 0;
		this.assists = 0;
		this.strength = strength;
		this.agility = agility;
		this.stamina = stamina;
		this.yellowCards = 0;
		this.redCards = 0;
		this.hasBall = false;
	}
	
	public String getName() {
		return playerName;
	}
	public void setName(String name) {
		this.playerName = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getJerseyNo() {
		return jerseyNo;
	}
	public void setJerseyNo(int jerseyNo) {
		this.jerseyNo = jerseyNo;
	}
	public int getGoals() {
		return goals;
	}
	public void setGoals(int goals) {
		this.goals = goals;
	}
	public int getAssists() {
		return assists;
	}
	public void setAssists(int assists) {
		this.assists = assists;
	}
	public int getStrength() {
		return strength;
	}
	public void setStrength(int strength) {
		this.strength = strength;
	}
	public int getAgility() {
		return agility;
	}
	public void setAgility(int agility) {
		this.agility = agility;
	}
	public int getStamina() {
		return stamina;
	}
	public void setStamina(int stamina) {
		this.stamina = stamina;
	}
	public int getYellowCards() {
		return yellowCards;
	}
	public void setYellowCards(int yellowCards) {
		this.yellowCards = yellowCards;
	}
	public int getRedCards() {
		return redCards;
	}
	public void setRedCards(int redCards) {
		this.redCards = redCards;
	}
	public boolean isHasBall() {
		return hasBall;
	}
	public void setHasBall(boolean hasBall) {
		this.hasBall = hasBall;
	}
	
	

}
