package com.xworkz.july17;

public class Money extends Strength{
		Money()
		{
			System.out.println("Invoking no-args const in Money");
		}
		Money(String color,int count,String currencyName)
		{
			super(color,count,currencyName);
			this.color=color;
			this.count=count;
			this.currencyName=currencyName;
		}

	}

