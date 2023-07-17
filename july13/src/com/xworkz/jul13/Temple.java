package com.xworkz.jul13;

public class Temple {
	
	TempleName name;
	String location;
	String priest="Poojari";
	int donation;
	
	void setName(TempleName name) {
			this.name=name;
	}
	
	Temple(String location, int donation){
		
		this.donation=donation;
		this.location=location;
		
	}
	
	void display() {
		System.out.println("Name of temple is "+this.name+" Temple");
		System.out.println("Temple Location : "+this.location);
		System.out.println("Pooja is done by "+priest);
		System.out.println("Total donation : "+this.donation);
	}

}
