package Oyun.Entities;

import Oyun.Abstract.Entity;

public class Sale implements Entity {
	private int id;
	private Player player;
	private Game game;
	
	public Sale(int id, Player player, Game game) {
		super();
		this.id = id;
		this.player = player;
		this.game = game;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

}
