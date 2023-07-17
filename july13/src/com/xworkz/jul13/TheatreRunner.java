package com.xworkz.jul13;

public class TheatreRunner {

	public static void main(String[] args) {
		
		Theatre screen1=new Theatre("KGF", 200);
		screen1.setType(TheatreType.TWO_D);
		screen1.display();
		
		Theatre screen2 = new Theatre("Avatar 2", 100);
		screen2.setType(TheatreType.FOUR_DX);
		screen2.display();

	}

}
