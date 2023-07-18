package com.xworkz.casting;

public class ShoeUtil {
	static void buy(Shoe shoe)
	{
		if(shoe != null)
		{
			System.out.println(shoe.price);
			System.out.println(shoe.size);
			System.out.println(shoe.colour);
		}
		if(shoe instanceof PumaShoe) 
		{
			System.out.println("crating casting for  puma shoe");
	         PumaShoe pumashoe=	(PumaShoe)shoe;   
		}
		
		if(shoe instanceof NikeShoe)
		{
			System.out.println("creating instance for nike shoe");
			NikeShoe nikeshoe=(NikeShoe)shoe;
		}
		
		
	
	}
		
	
	
	
	

	
}

