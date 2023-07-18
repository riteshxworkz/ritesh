package com.xworkz.inheritance;

public class Institute {
	String location;
	int strength;
	String shift;
	
	public Institute(String location, int strength, String shift) {
		this.location =location;
		this.shift=shift;
		this.strength=strength;
		System.out.println("const of Institute :");
		System.out.println(location + " " + strength + " " + shift);
	}
}
