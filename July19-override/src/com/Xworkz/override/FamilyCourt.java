package com.Xworkz.override;

public class FamilyCourt extends CivilCourt{
	void divorce()
	{
		System.out.println("Invoking divorce method in FamilyCourt");
	}
	@Override
	void propertyCase()
	{
		System.out.println("Invoking propertyCase method in to FamilyCourt");
	}
	void theftCase()
	{
		System.out.println("Invoking theftcase method in to FamilyCourt");
	}
}
