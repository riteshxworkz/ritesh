package com.xworkz.jul12;

public class PrinterRunner {

	public static void main(String[] args) {
		Printer printer1 = new Printer("Color");
		Printer printer2 = new Printer("Black and White");
		
		printer1.display();
		printer2.display();

	}

}
