package com.xworkz.jul13;

public class Theatre {
	
	String name="Imax";
	TheatreType type;
	String movieName;
	int noOfSeats;
	
	void setType(TheatreType type) {
		this.type=type;
	}
	
	Theatre(String movieName, int noOfSeats){
		
		this.movieName=movieName;
		this.noOfSeats=noOfSeats;
		
	}
	
	void display() {
		System.out.println("Theatre Name : "+name);
		System.out.println("Theatre Type : "+this.type);
		System.out.println("Movie Name : "+this.movieName);
		System.out.println("No of Seats : "+this.noOfSeats);
	}

}
