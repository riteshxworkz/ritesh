package com.xworkz.inheritance;

public class Xworkz extends Institute{
	String name;
	
	public Xworkz(String name, String location, int strength, String shift) {
		super(location, strength, shift);
		this.name=name;
		System.out.println("const of Institute :");
		System.out.println(name + " " + location + " " + strength + " " + shift);
	}
}
