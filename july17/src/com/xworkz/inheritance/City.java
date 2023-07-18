package com.xworkz.inheritance;

public class City {
	boolean isMetropolitian;
	int population;
	String education;
	
	public City(String education, boolean isMetropolitian, int population) {
		this.isMetropolitian=isMetropolitian;
		this.population=population;
		this.education=education;
		System.out.println("const of City :");
		System.out.println(isMetropolitian + " " + population + " " + education);
	}
}
