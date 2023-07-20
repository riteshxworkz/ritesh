package com.xworkz.july20;

public class Chicken {
int price;
String location;
Chicken(int price,String location)
{
	this.location=location;
	this.price=price;
}
void printInfo() {
	System.out.println("price of chicken:" +price);
	System.out.println("location of chicken:" +location);
}
}
