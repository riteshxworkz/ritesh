package com.xworkz.july20;

public class ChickenRunner {

	public static void main(String[] args) {
		Chicken ref1 = new Chicken(50,"BTM");
		ref1.printInfo();
		System.out.println("running main in chicken");

		Chicken ref2 = new FarmChicken(15,"jpnagar",22,"Humans");
		ref2.printInfo();
		System.out.println("running main in farmChicken");
		
		Chicken ref3 = new BoilerChicken(20,"farm",false,2);
		ref3.printInfo();
		System.out.println("running main in boilerChicken");
	}

}
