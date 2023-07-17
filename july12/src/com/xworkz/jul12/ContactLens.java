package com.xworkz.jul12;

public class ContactLens {
	static String name;
	String color;
	
	static{
		name="Aqua Lens";
	}
	
	ContactLens(String color){
		this.color=color;
	}
	
	void display() {
		System.out.println("Name of the Company : "+ContactLens.name);
		System.out.println("Lens Color : "+this.color);
	}

}
