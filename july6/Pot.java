class Pot{
	String type = "Self Watering";
	double length;
	String color;
	String material;
	int capacity = 1;
	String purpose;
	double weight;
	double price;

	
	Pot(String type , double length , String color , String material, 
	     int capacity , String purpose , double weight , double price){
    System.out.println("Constructor with string,double,string,string,"+
	                   "int,string,double,double arguements...");
					   this.type = type;
                       this.length = length;
	                   this.color = color;
	                   this.material = material;
	                   this.capacity = capacity;
                       this.purpose = purpose;
                       this.weight = weight;
                       this.price = price;
    }

}