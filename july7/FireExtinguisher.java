class FireExtinguisher{
	
	String companyName;
	int price;
	boolean available;
	int capacity;
	int noOfUnits;
	
	FireExtinguisher(String companyName,int price,boolean available,int capacity,int noOfUnits){
		this.companyName=companyName;
		this.price=price;
		this.available=available;
		this.capacity=capacity;
		this.noOfUnits=noOfUnits;
	}
	
	void printInstanceVariable(){
		System.out.println("Company Name : "+companyName);
		System.out.println("Price : "+price);
		System.out.println("Available : "+available);
		System.out.println("Capacity : "+capacity);
		System.out.println("No Of Units : "+noOfUnits);
	}
	
}

class FireExtinguisherRunner{
	public static void main(String[] args){
		FireExtinguisher ref = new FireExtinguisher("Fire Extinguisher",500,true,1000,45);
		ref.printInstanceVariable();
	}
}