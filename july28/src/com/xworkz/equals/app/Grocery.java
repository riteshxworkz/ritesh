package com.xworkz.equals.app;

public class Grocery {

	String itemName;
	double price;

	public Grocery(String itemName, double price)
	{
		super();
		this.itemName = itemName;
		this.price = price;
	}

	@Override
	public String toString()
	{
		return(" ItemName : "+this.itemName+" Price : "+this.price);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj != null) {
			System.out.println("Not Null");
			
			if (obj instanceof Grocery) {
				System.out.println("Matched, continue");
				Grocery casted = (Grocery)obj;
				
				if (this.itemName.equals(casted.itemName) && this.price == casted.price) {
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


	public String getItemName()
	{
		return itemName;
	}

	public void setItemName(String itemName)
	{
		this.itemName = itemName;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

}
