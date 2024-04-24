package edu.sabanciuniv.it524.domain;

public class Referee {
	
	private String refereeName;
	private int calledYellowCards;
	private int calledRedCards;
	private int calledFouls;
	private int calledOffsides;
	private int calledThrowIns;
	private int calledKicks;
	
	
	public Referee() {
		super();
	}

	public Referee(String name, int calledYellowCards, int calledRedCards, int calledFouls, int calledOffsides,
			int calledThrowIns, int calledKicks) {
		super();
		this.refereeName = name;
		this.calledYellowCards = calledYellowCards;
		this.calledRedCards = calledRedCards;
		this.calledFouls = calledFouls;
		this.calledOffsides = calledOffsides;
		this.calledThrowIns = calledThrowIns;
		this.calledKicks = calledKicks;
	}

	public String getName() {
		return refereeName;
	}

	public void setName(String name) {
		this.refereeName = name;
	}

	public int getCalledYellowCards() {
		return calledYellowCards;
	}

	public void setCalledYellowCards(int calledYellowCards) {
		this.calledYellowCards = calledYellowCards;
	}

	public int getCalledRedCards() {
		return calledRedCards;
	}

	public void setCalledRedCards(int calledRedCards) {
		this.calledRedCards = calledRedCards;
	}

	public int getCalledFouls() {
		return calledFouls;
	}

	public void setCalledFouls(int calledFouls) {
		this.calledFouls = calledFouls;
	}

	public int getCalledOffsides() {
		return calledOffsides;
	}

	public void setCalledOffsides(int calledOffsides) {
		this.calledOffsides = calledOffsides;
	}

	public int getCalledThrowIns() {
		return calledThrowIns;
	}

	public void setCalledThrowIns(int calledThrowIns) {
		this.calledThrowIns = calledThrowIns;
	}

	public int getCalledKicks() {
		return calledKicks;
	}

	public void setCalledKicks(int calledKicks) {
		this.calledKicks = calledKicks;
	}
	
}
