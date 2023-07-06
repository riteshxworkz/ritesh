class MetroRunner{
	public static void main(String[] args){
		
	System.out.println("Running main");
	
	Metro ref1 = new Metro();
		System.out.println("Metro Line color :" +ref1.line);
		System.out.println("Distance_in_km :" +ref1.distance);
		System.out.println("Departure place :" +ref1.departure);
		System.out.println("Destination place :" +ref1.destination);
		System.out.println("Metro Capacity :" +ref1.capacity);
		System.out.println("");

	Metro ref2 = new Metro("purple" , 2.6);
	System.out.println("Metro Line color :" +ref2.line);
		System.out.println("Distance_in_km :" +ref2.distance);
		System.out.println("Departure place :" +ref2.departure);
		System.out.println("Destination place :" +ref2.destination);
		System.out.println("Metro Capacity :" +ref2.capacity);
		System.out.println("");

	Metro ref3 = new Metro("green" , 3.5 , "National college");
	System.out.println("Metro Line color :" +ref3.line);
		System.out.println("Distance_in_km :" +ref3.distance);
		System.out.println("Departure place :" +ref3.departure);
		System.out.println("Destination place :" +ref3.destination);
		System.out.println("Metro Capacity :" +ref3.capacity);
		System.out.println("");

	Metro ref4 = new Metro("purple" , 1.4 , "Hoodi" , "KR Puram");
	System.out.println("Metro Line color :" +ref4.line);
		System.out.println("Distance_in_km :" +ref4.distance);
		System.out.println("Departure place :" +ref4.departure);
		System.out.println("Destination place :" +ref4.destination);
		System.out.println("Metro Capacity :" +ref4.capacity);
		System.out.println("");

	Metro ref5 = new Metro("green" , 1.9 , "Rajajinagar" ,"Mahalakshmi" , 4500l);
	System.out.println("Metro Line color :" +ref5.line);
		System.out.println("Distance_in_km :" +ref5.distance);
		System.out.println("Departure place :" +ref5.departure);
		System.out.println("Destination place :" +ref5.destination);
		System.out.println("Metro Capacity :" +ref5.capacity);

	
	}
}