class Sofa{
	String brand = "IKEA";
	double length;
	String color;
	String material;
	int capacity = 4;
	String purpose;
	double weight;
	double price;

	
	Sofa(String brand , double length , String color , String material, 
	     int capacity , String purpose , double weight , double price){
    System.out.println("Constructor with string,double,string,string,"+
	                   "int,string,double,double arguements...");
					   this.brand = brand;
                       this.length = length;
	                   this.color = color;
	                   this.material = material;
	                   this.capacity = capacity;
                       this.purpose = purpose;
                       this.weight = weight;
                       this.price = price;
    }

}