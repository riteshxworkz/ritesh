package Com.Xworkz.Casting;

public class NikeShoe extends Shoe {
	
	String ceo;
	String brandAmbassador;
	
	NikeShoe(String ceo,String brandAmbassador,int price,ShoeSize size,ShoeColor color)
	{
		super(price,size,color);
		System.out.println("Running String,String,int,ShoeSize,ShoeColor consts in NikeShoe....");
		this.ceo=ceo;
		this.brandAmbassador=brandAmbassador;
	}
	void printInfo()
	{
		System.out.println("Display...");
		System.out.println(this.ceo);
		System.out.println(this.brandAmbassador);
		System.out.println(this.price);
		System.out.println(this.size);
		System.out.println(this.color);
	}

}
