package Movie;

public class Movie {
	
	String name;
	String budget;
	String heroName;
	String villainName;
	
	Director director1 = new Director("Prashanth Neel","25 Crores","Karnataka",35);
	Director director2 = new Director("S S Rajamouli","45 Crores","Karnataka",45);
	
	public Movie(String name, String budget, String heroName, String villainName ) {
		
		this.name=name;
		this.budget=budget;
		this.heroName=heroName;
		this.villainName=villainName;
		
	}
	
	void printInfo() {
		
		System.out.println("Movie Name : "+this.name);
		System.out.println("Movie Budget : "+this.budget);
		System.out.println("Movie Hero : "+this.heroName);
		System.out.println("Movie Villain : "+this.villainName);
		
	}
}
