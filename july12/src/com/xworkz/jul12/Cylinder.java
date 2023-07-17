package com.xworkz.jul12;

public class Cylinder {
	
	static String name;
	int capacity;
	
	static{
		name="Indane";
	}
	
	Cylinder(int capacity){
		this.capacity=capacity;
	}
	
	void display() {
		System.out.println("Name of the Company : "+Cylinder.name);
		System.out.println("Cpacity of the cylinder : "+this.capacity);
	}

}