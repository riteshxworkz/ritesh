package com.xworkz.july17;

public class Animal {
		String animalName;
		int age;
		String food;
		Animal()
		{
			System.out.println("Invoking no-args const in Animal");
		}
		Animal(String animalName,int age,String food)
		{
			this.animalName=animalName;
			this.age=age;
			this.food=food;
		}
		void printInfo()
		{
			System.out.println("Animal Name="+this.animalName);
			System.out.println("No of Legs ="+this.age);
			System.out.println("Which food="+this.food);
		}
	}

