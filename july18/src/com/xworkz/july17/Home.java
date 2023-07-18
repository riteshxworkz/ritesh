package com.xworkz.july17;

public class Home extends Building{
		Home()
		{
			super();
			System.out.println("Invoking no-args const in Home");
		}
		Home(double height,int lift,String color)
		{
			super(height,lift,color);
			this.height=height;
			this.lift=lift;
			this.color=color;
		}

	}

