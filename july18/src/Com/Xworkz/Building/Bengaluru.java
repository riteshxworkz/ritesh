package Com.Xworkz.Building;

public class Bengaluru  extends City{
	
	
	Bengaluru()
	{
		System.out.println("Running no-args const in Bengaluru..");
	}
	Bengaluru(String name,String country,long population)
	{
		super(name,country,population);
		System.out.println("Running String,String,String consts in Bengaluru...");
		this.name=name;
		this.country=country;
		this.population=population;
	}

}
