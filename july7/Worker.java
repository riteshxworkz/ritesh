class Worker{
	String name;
	int noOfWorkers;
	String bunkName;
	int salary;
	String profession;
	
	Worker(String name, int noOfWorkers, String bunkName, int salary, String profession){
		this.name=name;
		this.noOfWorkers=noOfWorkers;
		this.bunkName=bunkName;
		this.salary=salary;
		this.profession=profession;
		
	}
	
	void printInstanceVariable(){
		System.out.println("Name : "+name);
		System.out.println("No of WOrkers : "+noOfWorkers);
		System.out.println("Bunk Name : "+bunkName);
		System.out.println("Salary : "+salary);
		System.out.println("Designation : "+profession);
	}
}

class WorkerRunner{
	public static void main(String[] args){
		Worker ref = new Worker("Raj",10,"Hp Bunk",15000,"Petrol boy");
		ref.printInstanceVariable();
	}
}

