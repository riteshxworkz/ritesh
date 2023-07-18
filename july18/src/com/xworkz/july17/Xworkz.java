package com.xworkz.july17;

public class Xworkz extends Institute {
	
		Xworkz()
		{
			System.out.println("Invoking no-args const in Xworkz");
		}
		Xworkz(String instituteType,int branches,int fees)
		{
			super(instituteType,branches,fees);
			this.instituteType=instituteType;
			this.branches=branches;
			this.fees=fees;
		}
	
}
