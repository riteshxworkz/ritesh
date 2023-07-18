package com.xworkz.july17;

public class Architect {
		String name;
		int age;
		int salary;
		Architect()
		{
			System.out.println("Invoking no-args const in Architect");
		}
		Architect(String name,int age,int salary)
		{
			this.name=name;
			this.age=age;
			this.salary=salary;
		}
		void printInfo()
		{
			System.out.println("Name of Architect="+this.name);
			System.out.println("Age of architect="+this.age);
			System.out.println("Salary os architect="+this.salary);
		}
	}

