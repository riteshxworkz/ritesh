class MoneyRunner{
	public static void main(String[] args){
		
	System.out.println("Running main");
	
	Money ref1 = new Money();
		System.out.println("Country Name :" +ref1.country);
		System.out.println("Money Type :" +ref1.type);
		System.out.println("Currency name :" +ref1.currency);
		System.out.println("Denomination Of Money :" +ref1.denomination);
		System.out.println("");

	Money ref2 = new Money("Koria" , "coin");
	System.out.println("Country Name :" +ref2.country);
		System.out.println("Money Type :" +ref2.type);
		System.out.println("Currency name :" +ref2.currency);
		System.out.println("Denomination Of Money :" +ref2.denomination);
		System.out.println("");

	Money ref3 = new Money("Japan" , "paper", "YEN");
	System.out.println("Country Name :" +ref3.country);
		System.out.println("Money Type :" +ref3.type);
		System.out.println("Currency name :" +ref3.currency);
		System.out.println("Denomination Of Money :" +ref3.denomination);
		System.out.println("");

	Money ref4 = new Money("England" , "coin" , "pound" , 20);
	System.out.println("Country Name :" +ref4.country);
		System.out.println("Money Type :" +ref4.type);
		System.out.println("Currency name :" +ref4.currency);
		System.out.println("Denomination Of Money :" +ref4.denomination);

	}
}