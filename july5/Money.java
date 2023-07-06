class Money{
	String country = "INDIA";
	String type;
	String currency;
	long denomination = 500;
	
	Money(){
		System.out.println("Constructor1  with no arguements...");
	}
	Money(String country , String type){
		System.out.println("Constructor2 with string,string arguements...");
		this.country = country;
		this.type = type;
	}
	Money(String country , String type , String currency){
		this(country,type);
		System.out.println("Constructor3 with string,string,string  arguements...");
		this.currency = currency;
	}
	Money(String country , String type , String currency , long denomination){
		this(country,type,currency);
		System.out.println("Constructor4 with string,string,string,long arguements...");
		this.denomination = denomination;
	}
	
}
	





