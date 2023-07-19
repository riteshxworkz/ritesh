package Com.Xworkz.Building;

public class IceCreamRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food food1=new IceCream("Apple","Fruit",200);
		Food food2=new IceCream();
		System.out.println(food1.name);
		System.out.println(food1.category);
		System.out.println(food1.price);
		
		Food food=new Food("Carrot","Vegetable ",50);
		
		System.out.println(food.name);
		System.out.println(food.category);
		System.out.println(food.price);
		
		food2.display();
	}

}
