package com.xworkz.inheritance;

public class Home extends Building{
	int area;
	
	public Home(int area, String location, int storey, String name, boolean onRent) {
		super(location,storey,name,onRent);
		this.area=area;
		System.out.println("running arg const of Home");
		System.out.println(area + " " + location + " " + storey + " " + name + " " +onRent);
	}
}
