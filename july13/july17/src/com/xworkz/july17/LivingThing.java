package com.xworkz.july17;

public class LivingThing {

		String name;
		int noOfLivingThing;
		String type;
		LivingThing()
		{
			System.out.println("Invoking no-args cont in LivingThing");
		}
		LivingThing(String name,int noOfLivingThing,String type)
		{
			this.name=name;
			this.noOfLivingThing=noOfLivingThing;
			this.type=type;
		}
		void printInfo()
		{
			System.out.println("Name="+this.name);
			System.out.println("No of Living thing="+this.noOfLivingThing);
			System.out.println("Type="+this.type);
		}
}
