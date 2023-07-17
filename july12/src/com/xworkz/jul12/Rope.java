package com.xworkz.jul12;

public class Rope {
	
	static String name;
	int length;
	
	static{
		name="Rope";
	}
	
	Rope(int length){
		this.length=length;
	}
	
	void display() {
		System.out.println("Name  : "+name);
		System.out.println("Length : "+this.length);
	}


}
