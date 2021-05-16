package Oyun.Entities;

import Oyun.Abstract.Entity;

public class Game implements Entity{
	private int id;
	private String GameName;
	private String description;
	private double Price;
	public Game(int id, String gameName, double price,String description) {
		super();
		this.id = id;
		GameName = gameName;
		this.Price = price;
		this.description=description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGameName() {
		return GameName;
	}
	public void setGameName(String gameName) {
		GameName = gameName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
}
