package com.xworkz.jul13;

public class ResortRunner {

	public static void main(String[] args) {
		
		Resort resort1 = new Resort("Raj",true);
		resort1.setType(ResortRoomType.PRESEDENTIAL_SUITE);
		resort1.display();
		
		Resort resort2 = new Resort("Ram", true);
		resort2.setType(ResortRoomType.EXECUTIVE_SUITE);
		resort2.display();
	}

}
