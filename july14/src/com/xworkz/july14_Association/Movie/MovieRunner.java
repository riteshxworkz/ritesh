package Movie;

public class MovieRunner {

	public static void main(String[] args) {
		Movie movie1 = new Movie("KGF","100 Crores","Yash","Sanjay Dutt");
		Movie movie2 = new Movie("Bahubali","250 Crores","Prabhas","Rana");
		
		movie1.printInfo();
		movie1.director1.printInfo();

		System.out.println("");
		
		movie2.printInfo();
		movie1.director2.printInfo();
		

	}

}
