package Com.Xworkz.Casting;

public class PumaShoe extends Shoe{
	
	String model;
	String origin;
	
	PumaShoe(String model,String origin,int price,ShoeSize size,ShoeColor color)
	{
		super(price,size,color);
		System.out.println("Running String,String consts in PumaShoe....");
		this.model=model;
		this.origin=origin;
	}
	void printInfo()
	{
		System.out.println("Display...");
		System.out.println(this.model);
		System.out.println(this.origin);
		System.out.println(this.price);
		System.out.println(this.size);
		System.out.println(this.color);
		
	}
	

}
