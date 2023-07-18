package com.xworkz.inheritance;

public class LivingThing {
	String category;
	boolean respirate;
	String growth;
	
	public LivingThing(String category, boolean respirate, String growth) {
		this.category=category;
		this.respirate=respirate;
		this.growth=growth;
		System.out.println("const of livingthings with three arguments");
		System.out.println(category + " " + respirate + " " + growth);
	}
}
