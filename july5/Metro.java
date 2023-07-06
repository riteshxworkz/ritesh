class Metro{
	 String line = "green";
	double distance;
	String departure;
	String destination;
	long capacity = 5000l;
	
	Metro(){
		System.out.println("Constructor1  with no arguements...");
	}
	Metro(String line , double distance){
		System.out.println("Constructor2 with string,double arguements...");
		this.line = line;
		this.distance = distance;
	}
	Metro(String line , double distance , String departure){
		this(line,distance);
		System.out.println("Constructor3 with string,double,string  arguements...");
		this.departure = departure;
	}
	Metro(String line , double distance , String departure , 
	      String destination){
		this(line,distance,departure);
		System.out.println("Constructor4 with string,double,string,string arguements...");
		this.destination = destination;
	}
	Metro(String line , double distance , String departure , 
	      String destination, long capacity){
		this(line,distance,departure,destination);
        System.out.println("Constructor5 with string,double,string,string,long arguements...");
		this.capacity = capacity;
	}
}
	
	



