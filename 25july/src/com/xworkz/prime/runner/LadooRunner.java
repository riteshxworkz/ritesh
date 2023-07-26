package com.xworkz.prime.runner;
import com.xworkz.prime.app.Ladoo;

public class LadooRunner {
	
	public static void main(String []args)
	{
		System.out.println("Running main");
		Ladoo ladoo1=new Ladoo();
		System.out.println("ladoo");//toString implicit
		
		Ladoo ladoo2=new Ladoo();
		System.out.println("ladoo.toString()");//toString explicit
	}

}
