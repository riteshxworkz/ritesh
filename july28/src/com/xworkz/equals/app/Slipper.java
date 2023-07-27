package com.xworkz.equals.app;

public class Slipper {

	private String brand;
	private int size;
	private double price;
	private String color;
	private String material;
	private boolean inStock;
	private double discount;

	public Slipper(String brand, int size, double price, String color, String material, boolean inStock, double discount)
	{
		this.brand = brand;
		this.size = size;
		this.price = price;
		this.color = color;
		this.material = material;
		this.inStock = inStock;
		this.discount = discount;
	}

	@Override
	public String toString()
	{
		return "Brand: " + this.brand + ", Size: " + this.size + ", Price: " + this.price +
				", Color: " + this.color + ", Material: " + this.material + ", InStock: " + this.inStock +
				", Discount: " + this.discount;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Not Null");

			if (obj instanceof Slipper) {
				System.out.println("Matched, continue");
				Slipper casted = (Slipper) obj;

				if (this.brand.equals(casted.brand)
						&& this.size == casted.size
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

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public boolean isInStock() {
		return inStock;
	}

	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
}
