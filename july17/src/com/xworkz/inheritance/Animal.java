package com.xworkz.inheritance;

public class Animal {
	String type;
	int avgLifespan;
	String food;
	
	Animal(String type, int avgLifespan, String food)
	{
		System.out.println("running String, int, String const of Animal");
		this.avgLifespan=avgLifespan;
		this.food=food;
		this.type=type;
		System.out.println(type + " " + avgLifespan + " " + food);
	}
}
