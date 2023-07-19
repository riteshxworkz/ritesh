package com.xworkz.july17;

public class City {
		String cityName;
		int noofshops;
		int noOfHotels;
		City()
		{
			System.out.println("Invoking no-args const in city");
		}
		City(String cityName,int noofshops,int noOfHotels)
		{
			this.cityName=cityName;
			this.noofshops=noofshops;
			this.noOfHotels=noOfHotels;
		}
		void printInfo()
		{
			System.out.println("City name="+this.cityName);
			System.out.println("No of places="+this.noofshops);
			System.out.println("Famous for="+this.noOfHotels);

	}
	}

