package Com.Xworkz.Building;

public class Institute {
	
	String name;
	String type;
	String location;
	
	Institute()
	{
		System.out.println("Running no-args const in Institute..");
	}
	Institute(String name,String type,String location)
	{
		System.out.println("Running String,String,String consts in Institute...");
		this.name=name;
		this.type=type;
		this.location=location;
	}
	void display()
	{
		this.name=name;
		this.type=type;
		this.location=location;
	}

}
