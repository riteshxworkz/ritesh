package com.xworkz.equals.app;

public class Vehicle {

	private String make;
	private String model;
	private int year;
	private String color;
	private double mileage;

	public Vehicle(String make, String model, int year, String color, double mileage)
	{
		this.make = make;
		this.model = model;
		this.year = year;
		this.color = color;
		this.mileage = mileage;
	}

	@Override
	public String toString()
	{
		return "Make: " + this.make + ", Model: " + this.model + ", Year: " + this.year
				+ ", Color: " + this.color + ", Mileage: " + this.mileage;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Not Null");

			if (obj instanceof Vehicle) {
				System.out.println("Matched, continue");
				Vehicle casted = (Vehicle) obj;

				if (this.make.equals(casted.make)
						&& this.model.equals(casted.model)) {
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

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
}
