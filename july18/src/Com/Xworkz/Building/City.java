package Com.Xworkz.Building;

public class City {
	
	String name;
	String country;
	long population;
	
	City()
	{
		System.out.println("Running no-args const in City..");
	}
	
	City(String name,String country,long population)
	{
		System.out.println("Running String,String,String consts in City...");
		this.name=name;
		this.country=country;
		this.population=population;
	}
	void display()
	{
		this.name=name;
		this.country=country;
		this.population=population;
	}

}
