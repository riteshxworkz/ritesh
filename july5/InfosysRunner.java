class InfosysRunner{
	public static void main(String[] args){
		
	System.out.println("Running main");
	
	Infosys ref1 = new Infosys();
		System.out.println("Infosys Founder Name :" +ref1.founderName);
		System.out.println("Infosys founder's Wife Name :" +ref1.founderWifeName);
		System.out.println("Infosys founded in year  :" +ref1.foundedIn);
		System.out.println("Total Employees in Infosys :" +ref1.totalEmployees);
		System.out.println("");

	Infosys ref2 = new Infosys("Manoj" , "Manoj's ex");
	    System.out.println("Infosys Founder Name :" +ref2.founderName);
		System.out.println("Infosys founder's Wife Name :" +ref2.founderWifeName);
		System.out.println("Infosys founded in year  :" +ref2.foundedIn);
		System.out.println("Total Employees in Infosys :" +ref2.totalEmployees);
		System.out.println("");

	Infosys ref3 = new Infosys("Suraj" , "chandni", "2023");
	    System.out.println("Infosys Founder Name :" +ref3.founderName);
		System.out.println("Infosys founder's Wife Name :" +ref3.founderWifeName);
		System.out.println("Infosys founded in year  :" +ref3.foundedIn);
		System.out.println("Total Employees in Infosys :" +ref3.totalEmployees);
		System.out.println("");

	Infosys ref4 = new Infosys(null ,null , "2001" , 20000l);
	    System.out.println("Infosys Founder Name :" +ref4.founderName);
		System.out.println("Infosys founder's Wife Name :" +ref4.founderWifeName);
		System.out.println("Infosys founded in year  :" +ref4.foundedIn);
		System.out.println("Total Employees in Infosys :" +ref4.totalEmployees);
	}
}