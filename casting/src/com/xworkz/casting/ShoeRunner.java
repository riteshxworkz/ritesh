package com.xworkz.casting;

public class ShoeRunner {

	public static void main(String[] args) {
		
   System.out.println("casting");
   PumaShoe ref3=new PumaShoe(10000,Size.MAXIMUM,Colour.BLACK,2002,"origin1");
   ref3.printinfo();
   
   
   
   
   NikeShoe ref4=new NikeShoe(20000,Size.MINIMUM,Colour.WHITE,"ceo1","mahi");
   ref4.printinfo();
	
   
   
   
	}

}
