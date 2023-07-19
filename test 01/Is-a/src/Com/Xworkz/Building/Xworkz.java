package Com.Xworkz.Building;

public class Xworkz extends Institute {
	
	
	Xworkz()
	{
		System.out.println("Running no-args const in Institute..");
	}
	Xworkz(String name,String type,String location)
	{
		super(name,type,location);
		System.out.println("Running String,String,String consts in Institute...");
		this.name=name;
		this.type=type;
		this.location=location;
	}

}
