package Com.Xworkz.Building;

public class Animal {
	
	String name;
	int lifeSpan;
	String diet;
	
	Animal()
	{
		System.out.println("Running no-args const in Animal..");
	}
	Animal(String name,int lifeSpan,String diet)
	{
		System.out.println("Running String,int,String consts in Animal...");
		this.name=name;
		this.lifeSpan=lifeSpan;
		this.diet=diet;
	}
	void display()
	{
		this.name=name;
		this.lifeSpan=lifeSpan;
		this.diet=diet;
	}


}
