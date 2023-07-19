package Com.Xworkz.Building;

public class Omkar extends Architect {
	
	Omkar()
	{
		System.out.println("Running no-args const in Omkar..");
	}
	Omkar(String name,String qualifications,long contactNo)
	{
		super(name,qualifications,contactNo);
		System.out.println("Running String,String,String consts in Omkar...");
		this.name=name;
		this.qualifications=qualifications;
		this.contactNo=contactNo;
	}

}
