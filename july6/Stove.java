class Stove{
	String brand ;
	String size;
	String type ;
	String material = "metal";
	int burners ;
	String purpose = "Cooking";
	double weight;
	double price;

	
	Stove(String brand , String size , String type , String material, 
	     int burners , String purpose , double weight , double price){
    System.out.println("Constructor with string,string,string,string,"+
	                   "int,string,double,double arguements...");
					   this.brand = brand;
                       this.size = size;
	                   this.type = type;
	                   this.material = material;
	                   this.burners = burners;
                       this.purpose = purpose;
                       this.weight = weight;
                       this.price = price;
    }

}