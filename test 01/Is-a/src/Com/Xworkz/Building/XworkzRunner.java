package Com.Xworkz.Building;

public class XworkzRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Institute institute=new Xworkz("Xworkz","Training Center","BTM");
		Institute institute2=new Xworkz();
		System.out.println(institute.name);
		System.out.println(institute.type);
		System.out.println(institute.location);
		
		Institute institute1=new Institute("Qspiders","Training Center","BTM");
		System.out.println(institute1.name);
		System.out.println(institute1.type);
		System.out.println(institute1.location);
		
		institute2.display();
		

	}

}
