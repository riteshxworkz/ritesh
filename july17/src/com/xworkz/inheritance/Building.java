package com.xworkz.inheritance;

public class Building {
	String location;
	int storey;
	String name;
	boolean onRent;
	
	public Building(String location, int storey, String name, boolean onRent) {
		this.location=location;
		this.storey=storey;
		this.name=name;
		this.onRent=onRent;
		System.out.println("running string, int, name, boolean const of building");
		System.out.println(location + " " + storey + " " + name + " " +onRent);
	}
}
