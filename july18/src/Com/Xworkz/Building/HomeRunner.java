package Com.Xworkz.Building;

public class HomeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Building building1=new Home("John","BTM",5);
		Building building2=new Home();
		System.out.println(building1.name);
		System.out.println(building1.location);
		System.out.println(building1.totalFloors);
		
		Building Building=new Building("James","Electronic city",6);
		
		System.out.println(Building.name);
		System.out.println(Building.location);
		System.out.println(Building.totalFloors);
		
		
		building2.display();
		
		

	}

}
