package com.xworkz.july17;

public class Building {
	int lift;
	String color;
	double height;
	Building()
	{
		System.out.println("Invoking no-args const in Building");
	}
	Building(double height,int lift,String color)
	{
		this.height=height;
		this.lift=lift;
		this.color=color;
	}
	void printInfo()
	{
		System.out.println("height of building="+this.height);
		System.out.println("type of building="+this.lift);
		System.out.println("Color of building="+this.color);
	}

}

