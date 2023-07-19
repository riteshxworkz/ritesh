package Com.Xworkz.Building;

public class Monkey extends Animal{
	
	Monkey()
	{
		System.out.println("Running no-args const in Monkey..");
	}
	Monkey(String name,int lifeSpan,String diet)
	{
		super(name,lifeSpan,diet);
		System.out.println("Running String,int,String consts in Monkey...");
		this.name=name;
		this.lifeSpan=lifeSpan;
		this.diet=diet;
	}
}
