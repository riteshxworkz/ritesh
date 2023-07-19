package Com.Xworkz.Building;

public class IceCream extends Food{
	
	IceCream()
	{
		System.out.println("Running no-args const in IceCream...");
	}
	IceCream(String name,String category,int price)
	{
		super(name,category,price);
		System.out.println("Running String,String,int const in IceCream...");
		this.name=name;
		this.category=category;
		this.price=price;
		
	}

}
