package com.Xworkz.override;

public class CourtRunner {

	public static void main(String[] args) {
		
		Court ref=new Court();
		ref.justice();
		
		
		System.out.println(" ");
		SupremeCourt ref1=new SupremeCourt();
		ref1.importantCase();
		ref1.justice();
		
		
		System.out.println(" ");
		HighCourt ref3=new HighCourt();
		ref3.criminalCase();
		ref3.forgeryCase();
		ref3.importantCase();
		
		
		System.out.println(" ");
		CivilCourt ref6=new CivilCourt();
		ref6.propertyCase();
		ref6.theftCase();
		ref6.criminalCase();
		ref6.forgeryCase();
	
		
		
		System.out.println(" ");
		FamilyCourt ref10=new FamilyCourt();
		ref10.divorce();
		ref10.propertyCase();
		ref10.theftCase();
	}

}
