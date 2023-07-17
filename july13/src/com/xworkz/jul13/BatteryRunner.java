package com.xworkz.jul13;

public class BatteryRunner {

	public static void main(String[] args) {
		Battery battery1 = new Battery(100, 20);
		battery1.setBatteryType(BatteryType.ALKALINE);
		battery1.display();
		
		Battery battery2 = new Battery(20, 50);
		battery2.setBatteryType(BatteryType.LI_ION);
		battery2.display();

	}

}
