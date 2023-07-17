package com.xworkz.jul12;

public class IndicatorRunner {

	public static void main(String[] args) {
		Indicator indicator1 = new Indicator("LED");
		Indicator indicator2 = new Indicator("Halogen");
		
		indicator1.display();
		indicator2.display();

	}

}
