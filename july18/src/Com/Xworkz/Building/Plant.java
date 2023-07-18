package Com.Xworkz.Building;

public class Plant extends LivingThing {
	
	Plant()
	{
		System.out.println("Running no-args const in Plant..");
	}
	Plant(String name,String kingdom,int size)
	{
		super(name,kingdom,size);
		System.out.println("Running String,String,int consts in Plant...");
		this.name=name;
		this.kingdom=kingdom;
		this.size=size;
	}


}
