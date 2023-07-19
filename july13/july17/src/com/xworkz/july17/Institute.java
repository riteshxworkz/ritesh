package com.xworkz.july17;

public class Institute {
		int branches;
		String instituteType;
		int fees;
		Institute()
		{
			System.out.println("Invoking no-args const in Institute");
		}
		Institute(String instituteType,int branches,int fees)
		{
			this.instituteType=instituteType;
			this.branches=branches;
			this.fees=fees;
		}
		void printInfo()
		{
			System.out.println("Institute type="+this.instituteType);
			System.out.println("Branches ="+this.branches);
			System.out.println("Fees "+this.fees);
		}

}
