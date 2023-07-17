package com.xworkz.jul12;

public class Fabric {
	
	static String name;
	String type;
	
	static {
		
		name="AllenSolly";
		
	}
	
	Fabric(String type){
		this.type=type;
	}
	
	void display() {
		System.out.println("Company Name : "+name);
		System.out.println("Fabric type : "+this.type);
	}

}
