package com.xworkz.equals.app;

public class Assets {

	private String assetName;
	private int quantity;
	private double value;

	public Assets(String assetName, int quantity, double value)
	{
		this.assetName = assetName;
		this.quantity = quantity;
		this.value = value;
	}

	@Override
	public String toString()
	{
		return "AssetName: " + this.assetName + ", Quantity: " + this.quantity + ", Value: " + this.value;
	}

	@Override
	public boolean equals(Object obj1) {
		if (obj1 != null) {
			System.out.println("Not Null");

			if (obj1 instanceof Assets) {
				System.out.println("Matched, continue");
				Assets casted = (Assets) obj1;

				if (this.assetName.equals(casted.assetName)
						&& this.quantity == casted.quantity
						&& this.value == casted.value) {
					return true;
				}
				else {
					System.err.println("Objects are not Equal");
				}
			}	
			else {
				System.err.println("Not Matched, Stop");
			}
		}
		else {
			System.err.println("Null");
		}
		return false;
	}


	public String getAssetName() {
		return assetName;
	}

	public void setAssetName(String assetName) {
		this.assetName = assetName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
}
