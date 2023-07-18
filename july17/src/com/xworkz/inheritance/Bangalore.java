package com.xworkz.inheritance;

public class Bangalore extends City{
	String state;
	
	public Bangalore(String state, String education, boolean isMetropolitian, int population) {
		super(education, isMetropolitian, population);
		this.state=state;
		System.out.println("const of Bangalaore : ");
		System.out.println(state + " " + isMetropolitian + " " + population + " " + education);
	}
}
