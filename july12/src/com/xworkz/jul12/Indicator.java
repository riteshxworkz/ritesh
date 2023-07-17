package com.xworkz.jul12;

public class Indicator {
	
	static String name;
	String type;
	
	static {
		
		name="Indicator";
		
	}
	
	Indicator(String type){
		this.type=type;
	}
	
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Indicator type : "+this.type);
	}

}
