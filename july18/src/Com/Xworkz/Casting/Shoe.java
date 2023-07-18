package Com.Xworkz.Casting;

public class Shoe {
	
	int price;
	ShoeSize size;
	ShoeColor color;
	
	
	Shoe(int price,ShoeSize size,ShoeColor color)
	{
		System.out.println("Running int,ShoeSize,ShoeColor consts in Shoe...");
		this.price=price;
		this.size=size;
		this.color=color;
	}

}
