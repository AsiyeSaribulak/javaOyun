package Oyun.Entities;

public class Campaign {
	private int id;
	private String name;
	private String coupon;
	private double discountPercent;
	private double indirimliFiyat;
	
	public Campaign(int id, String name, double discountPercent) {
		super();
		this.id = id;
		this.name = name;
		this.discountPercent = discountPercent;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}

	public String getCoupon() {
		return getName().substring(0,3).toUpperCase()+ getId();
	}

}