package com.xworkz.jul13;

public class TempleRunner {

	public static void main(String[] args) {
		Temple temple1 = new Temple("Mysore", 700000);
		temple1.setName(TempleName.LAKSHMI);
		temple1.display();
		
		Temple temple2 = new Temple("Thirumala", 80000000);
		temple2.setName(TempleName.VENKATESHWARA);
		temple2.display();

	}

}
