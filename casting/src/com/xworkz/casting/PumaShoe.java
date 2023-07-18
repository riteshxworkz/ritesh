package com.xworkz.casting;

public class PumaShoe extends Shoe {
	
	int model;
	String origin;
	
	PumaShoe(int price,Size size,Colour colour,int model,String origin)
	{
		super (price,size,colour);
		this.price=price;
		this.size=size;
		this.colour=colour;
		this.model=model;
		this.origin=origin;
		
	}
	
	
	void printinfo()
	{
       System.out.println(this.price);
       System.out.println(this.size);
       System.out.println(this.colour);
       System.out.println(this.model);
       System.out.println(this.origin);
       
	}
}
