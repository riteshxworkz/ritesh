class Oil{
	
	String oilType;
	int oilPrice;
	boolean purified;
	boolean available;
	String companyName;
	
	Oil(String oilType, int oilPrice, boolean purified, boolean available, String companyName){
		this.oilPrice=oilPrice;
		this.oilType=oilType;
		this.purified=purified;
		this.available=available;
		this.companyName=companyName;
	}
	void printInstanceVariable(){
		System.out.println("Oil Type : "+oilType);
		System.out.println("Oil Price : "+oilPrice);
		System.out.println("Oil is Puified : "+purified);
		System.out.println("Oil is available : "+available);
		System.out.println("Oil Company Name : "+companyName);
	}
}


class OilRunner{
	public static void main(String[] args){
		
		Oil oil1=new Oil("Petrol",100,true,true,"HP");
		oil1.printInstanceVariable();
		Oil oil2=new Oil("Diesel",90,true,true,"IP");
		oil2.printInstanceVariable();
		Oil oil3=new Oil("Kerosene",50,false,true,"Reliance");
		oil3.printInstanceVariable();
		Oil oil4=new Oil("White Petrol",500,true,true,"IP");
		oil4.printInstanceVariable();
		Oil oil5=new Oil("Turbo Petrol",120,true,true,"HP");
		oil5.printInstanceVariable();		
	}
}