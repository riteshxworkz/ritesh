package com.xworkz.equals.runner;

import com.xworkz.equals.app.*;

public class MainRunner {

	public static void main(String[] args) {

		System.out.println("Running main.....\n");

		Object obj = new Grocery("Biscuit", 20);
		Grocery gr = new Grocery("Biscuit", 20);	
		boolean output = obj.equals(gr);
		System.out.println("The Objects are same : "+output);

		System.out.println("----------------------------------------------------------------------");

		Object obj1 = new Assets("Laptop", 2, 1500.0);
		Assets asset = new Assets("Laptop", 2, 1500.0);
		boolean output1 = obj1.equals(asset);
		System.out.println("The Objects are same : " + output1);

		System.out.println("----------------------------------------------------------------------");

		Object obj2 = new Gold("Necklace", 0.5, 1000.0, 50000);
		Gold gold = new Gold("Necklace", 0.5, 1000.0, 50000);
		boolean output2 = obj2.equals(gold);
		System.out.println("The Objects are same : " + output2);

		System.out.println("----------------------------------------------------------------------");

		Vehicle obj3 = new Vehicle("Toyota", "Camry", 2020, "Silver", 25.5);
		Vehicle vehicle = new Vehicle("Toyota", "Camry", 2020, "Silver", 25.5);
		boolean output3 = obj3.equals(vehicle);
		System.out.println("The Objects are same : " + output3);

		System.out.println("----------------------------------------------------------------------");

		Object obj4 = new DryFruit("Almonds", 0.5, 800.0, "India", "1", "2");
		DryFruit dryFruit = new DryFruit("Almonds", 0.5, 800.0, "India", "1", "2");
		boolean output4 = obj4.equals(dryFruit);
		System.out.println("The Objects are same : " + output4);

		System.out.println("----------------------------------------------------------------------");

		Object obj5 = new Slipper("Nike", 8, 1200.0, "Black", "Rubber", true, 10.0);
		Slipper slipper = new Slipper("Nike", 8, 1200.0, "Black", "Rubber", true, 10.0);
		boolean output5 = obj5.equals(slipper);
		System.out.println("The Objects are same : " + output5);
	}

}
