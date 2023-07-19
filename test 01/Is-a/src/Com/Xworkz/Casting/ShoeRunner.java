package Com.Xworkz.Casting;

public class ShoeRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PumaShoe pumaShoe=new PumaShoe("Jack Black","Germany",1000,ShoeSize.EIGHT,ShoeColor.WHITE);
		
		pumaShoe.printInfo();
		
		NikeShoe nickShoe=new NikeShoe("Mark","Kunal Rajput",1500,ShoeSize.SEVEN,ShoeColor.BLACK);
		
		nickShoe.printInfo();

	}

}
