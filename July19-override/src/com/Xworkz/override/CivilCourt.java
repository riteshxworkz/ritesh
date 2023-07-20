package com.Xworkz.override;

public class CivilCourt extends HighCourt{
	void propertyCase()
	{
		System.out.println("Invoking propertyCase method in CivilCourt");
	}
	void theftCase()
	{
		System.out.println("Invoking theftcase method in CivilCourt");
	}
	@Override
	void criminalCase()
	{
		System.out.println("Invoking criminalcase method in to Civil court");
	}
	void forgeryCase()
	{
		System.out.println("Invoking forgeryCase method in to civil court");
	}
}
