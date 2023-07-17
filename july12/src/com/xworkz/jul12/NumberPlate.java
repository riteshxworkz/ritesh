package com.xworkz.jul12;

public class NumberPlate {
	
	static String name;
	int number;
	
	static{
		name="KA";
	}
	
	NumberPlate(int number){
		this.number=number;
	}
	
	void display() {
		System.out.println("State : "+name);
		System.out.println("Number : "+this.number);
	
	}
}
