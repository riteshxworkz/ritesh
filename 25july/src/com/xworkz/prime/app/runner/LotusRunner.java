package com.xworkz.prime.app.runner;
import com.xworkz.prime.app.Lotus;

public class LotusRunner {
	public static void main(String[]args)
	{
		System.out.println("Running main method");
		Lotus lotus=new Lotus();
		System.out.println(lotus);
		Lotus lotus2=new Lotus();
		System.out.println(lotus.toString());
	}

}
