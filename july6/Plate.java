class Plate{
	String brand ;
	double size;
	String type ;
	String material = "Ceramic";
	double width ;
	String purpose;
	double weight;
	double price;

	
	Plate(String brand , double size , String type , String material, 
	     double width , String purpose , double weight , double price){
    System.out.println("Constructor with string,double,string,string,"+
	                   "double,string,double,double arguements...");
					   this.brand = brand;
                       this.size = size;
	                   this.type = type;
	                   this.material = material;
	                   this.width = width;
                       this.purpose = purpose;
                       this.weight = weight;
                       this.price = price;
    }

}