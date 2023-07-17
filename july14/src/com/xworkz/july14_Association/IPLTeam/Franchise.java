package IPLTeam;

public class Franchise {
	
	String franchiseName;
	String location;
	String ownedBy;
	int netWorth;
	
	Franchise(String franchiseName, String location, String ownedBy, int netWorth){
		
		this.franchiseName=franchiseName;
		this.location=location;
		this.ownedBy=ownedBy;
		this.netWorth=netWorth;
		
	}

	void printInfo() {
		System.out.println("Franchise Name : "+this.franchiseName);
		System.out.println("Location : "+this.location);
		System.out.println("Owned By : "+this.ownedBy);
		System.out.println("Net worth : "+this.netWorth+"Crores");
	}
}
