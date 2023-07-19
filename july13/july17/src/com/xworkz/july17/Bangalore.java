package com.xworkz.july17;

public class Bangalore extends City{
	Bangalore()
	{
		System.out.println("Invoking no-args const in banglore");
	}
	Bangalore(String cityName,int noofshops,int noOfHotels)
	{
		super(cityName,noofshops,noOfHotels);
		this.cityName=cityName;
		this.noofshops=noofshops;
		this.noOfHotels=noOfHotels;
	}

}
