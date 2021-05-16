package Oyun.Entities;

import Oyun.Abstract.Entity;

public class Player implements Entity {
	private int id;
	private String firstName;
	private String lastName;
	private String UserName;
	private int birthday;
	private String Tc;
	private double balance;
	
	public Player(int id, String firstName, String lastName, String userName, int birthday, String tc, double balance) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		UserName = userName;
		this.birthday = birthday;
		Tc = tc;
		this.balance=balance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		this.UserName = userName;
	}
	public int getBirthday() {
		return birthday;
	}
	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	public String getTc() {
		return Tc;
	}
	public void setTc(String tc) {
		Tc = tc;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
