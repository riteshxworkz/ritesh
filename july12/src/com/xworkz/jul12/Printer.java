package com.xworkz.jul12;

public class Printer {
	
	static String name;
	String type;
	
	static {
		
		name="HP";
		
	}
	
	Printer(String type){
		this.type=type;
	}
	
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Printer type : "+this.type);
	}

}
