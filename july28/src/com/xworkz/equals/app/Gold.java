package com.xworkz.equals.app;

public class Gold {

	private String goldType;
	private double weight;
	private double price;
	private double value;

	public Gold(String goldType, double weight, double price, double value)
	{
		this.goldType = goldType;
		this.weight = weight;
		this.price = price;
		this.value = value;

	}

	@Override
	public String toString()
	{
		return "GoldType: " + this.goldType + ", Weight: " + this.weight + ", Price: " + this.price+ ", Value: " + this.value;
	}

	@Override
	public boolean equals(Object obj2) {
		if (obj2 != null) {
			System.out.println("Not Null");

			if (obj2 instanceof Gold) {
				System.out.println("Matched, continue");
				Gold casted = (Gold) obj2;

				if (this.goldType.equals(casted.goldType)
						&& this.weight == casted.weight
						&& this.price == casted.price) {
					return true;
				} else {
					System.err.println("Objects are not Equal");
				}
			} else {
				System.err.println("Not Matched, Stop");
			}
		} else {
			System.err.println("Null");
		}
		return false;
	}

	public String getGoldType() {
		return goldType;
	}

	public void setGoldType(String goldType) {
		this.goldType = goldType;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
