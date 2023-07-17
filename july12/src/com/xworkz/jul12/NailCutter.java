package com.xworkz.jul12;

public class NailCutter {
	static String name;
	String type;
	
	static {
		
		name="Nail Cutter";
		
	}
	
	NailCutter(String type){
		this.type=type;
	}
	
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Nail Cutter type : "+this.type);
	}

}
