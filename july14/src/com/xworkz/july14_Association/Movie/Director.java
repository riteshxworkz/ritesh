package Movie;

public class Director {
	
	String directorName;
	String directorSalary;
	String location;
	int age;
	
	Director(String dirctorName, String directorSalary, String locaton, int age){
		
		this.directorName=dirctorName;
		this.directorSalary=directorSalary;
		this.location=locaton;
		this.age=age;
		
	}
	
	void printInfo(){
		
		System.out.println("Name of the Director : "+this.directorName);
		System.out.println("Salary of the director : "+this.directorSalary);
		System.out.println("Director location : "+this.location);
		System.out.println("Age of the director : "+this.age);
		
	}
	

}
