package com.xworkz.jul12;

public class Robot {
	
	static String name;
	String type;
	
	static {
		
		name="Robot";
		
	}
	
	Robot(String type){
		this.type=type;
	}
	
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Robot type : "+this.type);
	}


}
