package com.xworkz.jul12;

public class MotherBoard {
	static String name;
	String type;
	
	static {
		
		name="Asus";
		
	}
	
	MotherBoard(String type){
		this.type=type;
	}
	
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Mother Board type : "+this.type);
	}

}
