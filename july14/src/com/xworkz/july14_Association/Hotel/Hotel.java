package Hotel;

public class Hotel {
	
	String hotelName;
	String hotelLocation;
	int workers;
	int floors;
	
	Owner owner1 = new Owner("Raj",20,5,25);
	Owner owner2 = new Owner("Ram",35,10,75);
	
	Hotel(String hotelName, String hotelLocation, int workers, int floors){
		
		this.hotelName=hotelName;
		this.hotelLocation=hotelLocation;
		this.workers=workers;
		this.floors=floors;
		
	}
	
	void printInfo() {
		
		System.out.println("Hotel Name : "+this.hotelName);
		System.out.println("Hotel Location : "+this.hotelLocation);
		System.out.println("Total Workers : "+this.workers);
		System.out.println("No of Floors : "+this.floors);
	}

}
