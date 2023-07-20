package com.Xworkz.override;

public class SupremeCourt extends Court{
	void importantCase()
	{
		System.out.println("Invoking method in Supremecourt");
	}
	@Override
	void justice()
	{
		System.out.println("Invoking justice method in to Supreme Court");
	}
}
