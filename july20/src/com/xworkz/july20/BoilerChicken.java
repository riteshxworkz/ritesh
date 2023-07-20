package com.xworkz.july20;

public class BoilerChicken extends Chicken{
boolean alive;
int weight;
public BoilerChicken(int price,String location,boolean alive,int weight) {
	super (price,location);
	this.alive=alive;
	this.weight=weight;
}
@Override
void printInfo() 
{
	super.printInfo();
	System.out.println("boiler is alive : " + alive);
	System.out.println("Chicken weight is : " + weight);

}
}
