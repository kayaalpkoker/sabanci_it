package edu.sabanciuniv.it524.domain.infrastructure;

import edu.sabanciuniv.it524.domain.player.Player;

public class Ball {
	
	private Player player; //Player who was the ball at the time
	private int speed;

	public Ball() {
		super();
	}

	public Ball(Player player, int speed) {
		super();
		this.player = player;
		this.speed = speed;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	
	
	
}
