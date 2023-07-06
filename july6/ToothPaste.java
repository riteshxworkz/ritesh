class ToothPaste{
	String brand ;
	double length;
	String color;
	String material;
	int capacity ;
	String purpose = "Brushing Teeth";
	double weight;
	double price;

	
	ToothPaste(String brand , double length , String color , String material, 
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