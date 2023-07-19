package Com.Xworkz.Casting;

public class ShoeUtil {
	
	ShoeUtil(Shoe shoe)
	{
		System.out.println("Running ShoeUtil...");
		if(shoe !=null)
		{
			System.out.println("Price  :"+shoe.price);
			System.out.println("Size  :"+shoe.size);
			System.out.println("Color  :"+shoe.color);
			if(shoe instanceof PumaShoe)
			{
				PumaShoe pumaShoe=(PumaShoe)shoe;
				pumaShoe.printInfo();
				
			}
			if(shoe instanceof NikeShoe)
			{
				NikeShoe nikeShoe=(NikeShoe)shoe;
				nikeShoe.printInfo();
			}
		}
		
	}

}
