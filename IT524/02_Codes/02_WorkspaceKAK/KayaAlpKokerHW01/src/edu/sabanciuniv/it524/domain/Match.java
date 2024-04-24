package edu.sabanciuniv.it524.domain;

public class Match {
	
	private int matchNo;
	private Team homeTeam;
	private Team awayTeam;
	private League league;
	private Stadium stadium;
	private int homeTeamScore;
	private int awayTeamScore;
	private Referee referee;
	
	
	public Match() {
		super();
	}

	public Match(int matchNo, Team homeTeam, Team awayTeam, League league, Stadium stadium, int homeTeamScore, int awayTeamScore,
			Referee referee) {
		super();
		this.matchNo = matchNo;
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
		this.league = league;
		this.stadium = stadium;
		this.homeTeamScore = homeTeamScore;
		this.awayTeamScore = awayTeamScore;
		this.referee = referee;
	}

	
	public int getMatchNo() {
		return matchNo;
	}
	
	public void setMatchNo(int matchNo) {
		this.matchNo = matchNo;
	}
	
	public Team getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(Team homeTeam) {
		this.homeTeam = homeTeam;
	}

	public Team getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(Team awayTeam) {
		this.awayTeam = awayTeam;
	}

	public League getLeague() {
		return league;
	}

	public void setLeague(League league) {
		this.league = league;
	}

	public Stadium getStadium() {
		return stadium;
	}

	public void setStadium(Stadium stadium) {
		this.stadium = stadium;
	}

	public int getHomeTeamScore() {
		return homeTeamScore;
	}

	public void setHomeTeamScore(int homeTeamScore) {
		this.homeTeamScore = homeTeamScore;
	}

	public int getAwayTeamScore() {
		return awayTeamScore;
	}

	public void setAwayTeamScore(int awayTeamScore) {
		this.awayTeamScore = awayTeamScore;
	}

	public Referee getReferee() {
		return referee;
	}

	public void setReferee(Referee referee) {
		this.referee = referee;
	}
	
	
	

}
