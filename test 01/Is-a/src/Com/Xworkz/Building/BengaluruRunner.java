package Com.Xworkz.Building;

public class BengaluruRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		City city=new Bengaluru("Bengaluru","India",9328718694L);
		Bengaluru bengaluru=new Bengaluru();
		
		System.out.println(city.name);
		System.out.println(city.country);
		System.out.println(city.population);
		
		City city1=new City("Chennai","India",8628718694L);
		System.out.println(city.name);
		System.out.println(city.country);
		System.out.println(city.population);
		bengaluru.display();
		

	}

}
