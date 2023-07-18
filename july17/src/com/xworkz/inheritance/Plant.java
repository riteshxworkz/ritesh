package com.xworkz.inheritance;

public class Plant extends LivingThing{
	String name;
	
	public Plant(String name,String category, boolean respirate, String growth) {
		super(category,respirate,growth);
		this.name=name;
		System.out.println("extended class constructor");
		System.out.println(name + " " + category + " " + respirate + " " + growth);
	}
}
