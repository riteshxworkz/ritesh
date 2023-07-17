package com.xworkz.jul12;

public class TV {
	
	static String name;
	String type;
	
	static {
		
		name="Samsung";
		
	}
	
	TV(String type){
		this.type=type;
	}
	
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Display type : "+this.type);
	}

}
