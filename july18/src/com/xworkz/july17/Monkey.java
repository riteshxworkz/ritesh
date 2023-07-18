package com.xworkz.july17;

public class Monkey extends Animal{
		Monkey()
		{
			System.out.println("Invoking no-args const in Monkey");
		}
		Monkey(String animalName,int age,String food)
		{
			super(animalName,age,food);
			this.animalName=animalName;
			this.age=age;
			this.food=food;
		}
	
}
