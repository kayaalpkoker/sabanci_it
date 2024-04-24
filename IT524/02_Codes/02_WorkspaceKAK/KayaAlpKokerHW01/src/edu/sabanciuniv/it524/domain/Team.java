package edu.sabanciuniv.it524.domain;

import java.util.ArrayList;

import edu.sabanciuniv.it524.domain.player.Player;

public class Team {
	
	private String teamName;
	private String teamCountry;
	private Player[] players = new Player[11];
	private ArrayList<Player> substitutePlayers = new ArrayList<>();
	private int wins;
	private int losses;
	
	public Team() {
		super();
	}

	public Team(String teamName, String teamCountry, Player[] players, ArrayList<Player> substitutePlayers, int wins,
			int losses) {
		super();
		this.teamName = teamName;
		this.teamCountry = teamCountry;
		this.players = players;
		this.substitutePlayers = substitutePlayers;
		this.wins = wins;
		this.losses = losses;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamCountry() {
		return teamCountry;
	}

	public void setTeamCountry(String teamCountry) {
		this.teamCountry = teamCountry;
	}

	public Player[] getPlayers() {
		return players;
	}

	public void setPlayers(Player[] players) {
		this.players = players;
	}

	public ArrayList<Player> getSubstitutePlayers() {
		return substitutePlayers;
	}

	public void setSubstitutePlayers(ArrayList<Player> substitutePlayers) {
		this.substitutePlayers = substitutePlayers;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}
	
	
	
	
	
	
	
}
