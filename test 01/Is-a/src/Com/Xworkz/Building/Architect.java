package Com.Xworkz.Building;

public class Architect {
	
	String name;
	String qualifications;
	long contactNo;
	
	
	Architect()
	{
		System.out.println("Running no-args const in Architect..");
	}
	Architect(String name,String qualifications,long contactNo)
	{
	System.out.println("Running String,String,String consts in Architect...");
	this.name=name;
	this.qualifications=qualifications;
	this.contactNo=contactNo;
	}
	void display()
	{
		this.name=name;
		this.qualifications=qualifications;
		this.contactNo=contactNo;
	}

}
