package Com.Xworkz.Building;

public class LivingThing {
	
	String name;
	String kingdom;
	int size;
	
	
	LivingThing()
	{
		System.out.println("Running no-args const in LivingThing..");
	}
	LivingThing(String name,String kingdom,int size)
	{
		System.out.println("Running String,String,int consts in LivingThing...");
		this.name=name;
		this.kingdom=kingdom;
		this.size=size;
	}

}
