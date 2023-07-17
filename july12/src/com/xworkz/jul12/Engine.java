package com.xworkz.jul12;

public class Engine {
	static String name;
	int engineCC;
	
	static {
		name="Revetron";
	}
	
	Engine(int engineCC){
		this.engineCC=engineCC;
	}
	
	void display() {
		System.out.println("Engine Name : "+name);
		System.out.println("Engine cc : "+ this.engineCC);
	}

}
