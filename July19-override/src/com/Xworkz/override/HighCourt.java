package com.Xworkz.override;

public class HighCourt extends SupremeCourt{
	void criminalCase()
	{
		System.out.println("Invoking criminalcase method in high court");
	}
	void forgeryCase()
	{
		System.out.println("Invoking forgeryCase method in high court");
	}
	@Override
	void importantCase()
	{
		System.out.println("Invoking importantCase method in to Highcourt");
	}
}
