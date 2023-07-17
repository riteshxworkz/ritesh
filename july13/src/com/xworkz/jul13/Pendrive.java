package com.xworkz.jul13;

public class Pendrive {
	
	String name = "Sandisk";
	PendriveGen gen;
	int capacity;
	int noOfPendrives;
	
	void setGen(PendriveGen gen) {
		this.gen=gen;
	}
	
	Pendrive(int capacity, int noOfPendrives){
		this.capacity=capacity;
		this.noOfPendrives=noOfPendrives;
	}
	
	void display() {
		System.out.println("Name of the Company : "+name);
		System.out.println("Pendrive Generation : "+this.gen);
		System.out.println("Capacity of the Pendrive is : "+this.capacity + " GB");
		System.out.println("No of Pendrives : "+this.noOfPendrives);
	}

}
