package com.xworkz.equals.app;

public class DryFruit {

	private String name;
	private double weight;
	private double pricePerKg;
	private String origin;
	private String packingDate;
	private String expiryDate;

	public DryFruit(String name, double weight, double pricePerKg, String origin, String packingDate, String expiryDate)
	{
		this.name = name;
		this.weight = weight;
		this.pricePerKg = pricePerKg;
		this.origin = origin;
		this.packingDate = packingDate;
		this.expiryDate = expiryDate;
	}

	@Override
	public String toString()
	{
		return "Name: " + this.name + ", Weight: " + this.weight + " kg, PricePerKg: " + this.pricePerKg +
				", Origin: " + this.origin + ", PackingDate: " + this.packingDate + ", ExpiryDate: " + this.expiryDate;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Not Null");

			if (obj instanceof DryFruit) {
				System.out.println("Matched, continue");
				DryFruit casted = (DryFruit) obj;

				if (this.name.equals(casted.name)
						&& this.weight == casted.weight
						&& this.pricePerKg == casted.pricePerKg) {
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPricePerKg() {
		return pricePerKg;
	}

	public void setPricePerKg(double pricePerKg) {
		this.pricePerKg = pricePerKg;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getPackingDate() {
		return packingDate;
	}

	public void setPackingDate(String packingDate) {
		this.packingDate = packingDate;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
}
