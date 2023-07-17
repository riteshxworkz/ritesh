package com.xworkz.jul12;

public class Train {
	
	static String name;
	String type;
	
	static {
		
		name="Train";
		
	}
	
	Train(String type){
		this.type=type;
	}
	
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Train type : "+this.type);
	}

}
