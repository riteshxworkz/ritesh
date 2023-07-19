package com.xworkz.july17;

public class Strength {
	String color;
	int count;
	String currencyName;
	Strength()
	{
		System.out.println("Invoking no-args const in Strength");
	}
	Strength(String color,int count,String currencyName)
	{

		this.color=color;
		this.count=count;
		this.currencyName=currencyName;
	}
	void printInfo()
	{
		System.out.println("Type of money="+this.color);
		System.out.println("Money count ="+this.count);
		System.out.println("curency name ="+this.currencyName);
	}

}

