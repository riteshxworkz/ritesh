class Infosys{
	String founderName = "N. R. Narayana Murthy";
	String founderWifeName = "Sudha Murthy";
	String foundedIn;
	long totalEmployees;
	
	Infosys(){
		System.out.println("Constructor1  with no arguements...");
	}
	Infosys(String founderName , String founderWifeName){
		System.out.println("Constructor2 with string,string arguements...");
		this.founderName = founderName;
		this.founderWifeName = founderWifeName;
	}
	Infosys(String founderName , String founderWifeName , String foundedIn){
		this(founderName,founderWifeName);
		System.out.println("Constructor3 with string,string,string  arguements...");
		this.foundedIn = foundedIn;
	}
	Infosys(String founderName , String founderWifeName , String foundedIn , long totalEmployees){
		this(founderName,founderWifeName,foundedIn);
		System.out.println("Constructor4 with string,string,string,long arguements...");
		this.totalEmployees = totalEmployees;
	}
	
}
	





