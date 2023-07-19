package Com.Xworkz.Building;

public class Building {
	
		String name;
		String location;
		int totalFloors;
		
		
		Building()
		{
			System.out.println("Running no-args const in Building...");
		}
		Building(String name,String location,int totalFloors)
		{
			System.out.println("Running String,String,int const in Building...");
			this.name=name;
			this.location=location;
			this.totalFloors=totalFloors;
		}
		void display()
		{
			this.name=name;
			this.location=location;
			this.totalFloors=totalFloors;
		}
		
}


