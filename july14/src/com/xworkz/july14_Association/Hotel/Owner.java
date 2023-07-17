package Hotel;

public class Owner {
	
	String ownerName;
	int profit;
	int noOfHotels;
	int ownerNetWorth;
	
	Owner(String ownerName, int profit, int noOfHotels, int ownerNetWorth){
		
		this.ownerName=ownerName;
		this.profit=profit;
		this.noOfHotels=noOfHotels;
		this.ownerNetWorth=ownerNetWorth;
		
	}
	
	void printInfo() {
		
		System.out.println("Owner Name : "+this.ownerName);
		System.out.println("Profit : "+this.profit+"%");
		System.out.println("No of Hotels : "+this.noOfHotels);
		System.out.println("Owner Net Worth : "+this.ownerNetWorth+"Crores");
	}

}
