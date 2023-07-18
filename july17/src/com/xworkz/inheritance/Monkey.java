package com.xworkz.inheritance;

public class Monkey extends Animal{
	boolean domestic;
	
	public Monkey(boolean domestic, String type, int avgLifespan, String food) {
		super(type,avgLifespan, food);
		this.domestic=domestic;
		System.out.println("running extended const of monkey");
		System.out.println(domestic + " " + type + " " + avgLifespan + " " + food);

	}
}
