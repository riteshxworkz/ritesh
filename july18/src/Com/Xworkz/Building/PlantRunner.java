package Com.Xworkz.Building;

public class PlantRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LivingThing livingThing=new Plant("Neam","Plantae",40);
		System.out.println(livingThing.name);
		System.out.println(livingThing.kingdom);
		System.out.println(livingThing.size);
		
		LivingThing livingThing1=new LivingThing("Oak","Plantae",50);
		System.out.println(livingThing1.name);
		System.out.println(livingThing1.kingdom);
		System.out.println(livingThing1.size);
		
		
		
		

	}

}
