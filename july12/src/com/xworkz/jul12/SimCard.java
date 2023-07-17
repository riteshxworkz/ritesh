package com.xworkz.jul12;

public class SimCard {
	
	static String name;
	String type;
	
	static {
		
		name="Jio";
		
	}
	
	SimCard(String type){
		this.type=type;
	}
	
	void display() {
		System.out.println("Name : "+name);
		System.out.println("SimCard type : "+this.type);
	}

}
