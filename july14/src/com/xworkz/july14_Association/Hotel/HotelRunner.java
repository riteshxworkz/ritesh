package Hotel;

public class HotelRunner {

	public static void main(String[] args) {
		
		Hotel hotel1 = new Hotel("Hanumanthu","Mysore",15,2);
		Hotel hotel2 = new Hotel("Mylari","Mysore",10,2);
		
		hotel1.printInfo();
		hotel1.owner1.printInfo();
		
		System.out.println();
		
		hotel2.printInfo();
		hotel2.owner2.printInfo();

	}

}
