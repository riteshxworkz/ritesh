package Com.Xworkz.Building;

public class Home extends Building {
	
	
	Home()
	{
		System.out.println("Running no-args const in Home...");
	}
	Home(String name,String location,int totalFloors)
	{
		super(name,location,totalFloors);
		System.out.println("Running String,String,int const in Home...");
		this.name=name;
		this.location=location;
		this.totalFloors=totalFloors;
	}

}
