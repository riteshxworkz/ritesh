package com.xworkz.july20;

public class FarmChicken extends Chicken {
int noOfDays;
String careTaker;
public FarmChicken(int price,String location,int noOfDays,String caretaker) {
	super(price,location);
	this.noOfDays=noOfDays;
	this.careTaker=caretaker;
}
@Override
void printInfo() {
	super.printInfo(); 
		System.out.println("number of days : " + noOfDays);
		System.out.println("caretaker is : " + careTaker);

}
}
