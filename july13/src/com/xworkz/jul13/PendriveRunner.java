package com.xworkz.jul13;

public class PendriveRunner {

	public static void main(String[] args) {
		Pendrive pendrive1 = new Pendrive(64, 10);
		pendrive1.setGen(PendriveGen.USB_THREE);
		pendrive1.display();
		
		Pendrive pendrive2 = new Pendrive(128, 15);
		pendrive2.setGen(PendriveGen.USB_THREE_POINT_TWO);
		pendrive2.display();

	}

}
