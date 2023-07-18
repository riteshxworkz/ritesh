package Com.Xworkz.Building;

public class Food {
	
	String name;
	String category;
	int price;
	
	
	Food()
	{
		System.out.println("Running no-args const in Food...");
	}
	Food(String name,String category,int price)
	{
		System.out.println("Running String,String,int const in Food");
		this.name=name;
		this.category=category;
		this.price=price;
	}
	void display()
	{
		this.name=name;
		this.category=category;
		this.price=price;
	}

}
