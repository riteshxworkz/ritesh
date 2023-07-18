package com.xworkz.casting;

public class NikeShoe extends Shoe {
	
	String ceo;
	String brandAmbasidor;
	
	
	NikeShoe(int price,Size size,Colour colour,String ceo,String brandAmbasidor)
	{
		super(price,size,colour);
		this.ceo=ceo;
		this.brandAmbasidor=brandAmbasidor;
		
	}
	
	
	void printinfo()
	{
		System.out.println(this.price);
		System.out.println(this.size);
		System.out.println(this.colour);
		System.out.println(this.ceo);
		System.out.println(this.brandAmbasidor);
	}
	

}
