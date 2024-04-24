package edu.sabanciuniv.it524.domain;

import java.util.ArrayList;

public class League {
	
	private String leagueName;
	private String leagueRegion;
	private ArrayList<Team> teams = new ArrayList<>();
	
	
	public League() {
		super();
	}
	
	public League(String name, String region, ArrayList<Team> teams) {
		super();
		this.leagueName = name;
		this.leagueRegion = region;
		this.teams = teams;
	}
	
	public String getName() {
		return leagueName;
	}
	public void setName(String name) {
		this.leagueName = name;
	}
	public String getRegion() {
		return leagueRegion;
	}
	public void setRegion(String region) {
		this.leagueRegion = region;
	}
	public ArrayList<Team> getTeams() {
		return teams;
	}
	public void setTeams(ArrayList<Team> teams) {
		this.teams = teams;
	}
	
	
	
	
	
}
