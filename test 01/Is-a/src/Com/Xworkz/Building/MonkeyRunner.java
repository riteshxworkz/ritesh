package Com.Xworkz.Building;

public class MonkeyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal Animal1=new Monkey("Lion",35,"Herbivore");
		Animal animal2=new Monkey();
		
		System.out.println(Animal1.name);
		System.out.println(Animal1.lifeSpan);
		System.out.println(Animal1.diet);
		
		Animal animal=new Animal("Tiger",30,"carnivore");
		
		System.out.println(animal.name);
		System.out.println(animal.lifeSpan);
		System.out.println(animal.diet);
		
		animal2.display();

	}

}
