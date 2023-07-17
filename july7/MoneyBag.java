class MoneyBag{
	String color;
	int totalCompartments;
	String currencyType;
	int totalAmount;
	String handler;
	
	MoneyBag(String color,int totalCompartments,String currencyType, int totalAmount,String handler){
		this.color=color;
		this.totalAmount=totalAmount;
		this.currencyType=currencyType;
		this.totalCompartments=totalCompartments;
		this.handler=handler;
	}
	
	void printInstanceVariable(){
		System.out.println("Bag Color : "+color);
		System.out.println("Total Amount : "+totalAmount);
		System.out.println("Currency Type : "+currencyType);
		System.out.println("Total Compartments : "+totalCompartments);
		System.out.println("Bag Holder Name : "+handler);
	}
}

class MoneyBagRunner{
	public static void main(String[] args){
		MoneyBag ref = new MoneyBag("Black",5,"Rupee",10000,"Ram");
		ref.printInstanceVariable();
	}
}