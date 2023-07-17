package com.xworkz.jul12;

public class Submarine {
	
	static String name;
	String type;
	
	static {
		
		name="Submarine";
		
	}
	
	Submarine(String type){
		this.type=type;
	}
	
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Submarine type : "+this.type);
	}

}
