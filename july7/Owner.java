class Owner{
	String name;
	String bunkName;
	int totalBunks;
	boolean profit;
	int averageAmount;
	
	Owner(String name, String bunkName, int totalBunks, boolean profit, int averageAmount){
		this.name=name;
		this.bunkName=bunkName;
		this.totalBunks=totalBunks;
		this.profit=profit;
		this.averageAmount=averageAmount;
	}
	
	void printInstanceVariable(){
		System.out.println("Name : "+name);
		System.out.println("Bunk Name : "+bunkName);
		System.out.println("Total Bunks : "+totalBunks);
		System.out.println("Profit : "+profit);
		System.out.println("Average Collection : "+averageAmount);
		
	}
	
}

class OwnerRunner{
	public static void main(String[] args){
		Owner ref = new Owner("Raj","Hp Petrol Bunk",5,true,50000);
		ref.printInstanceVariable();
	}
}