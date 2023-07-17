package com.xworkz.jul12;

public class Wire {
	
	static String name;
	int length;
	
	static{
		name="Wire";
	}
	
	Wire(int length){
		this.length=length;
	}
	
	void display() {
		System.out.println("Name  : "+name);
		System.out.println("Length : "+this.length);
	}

}
