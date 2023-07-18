package Com.Xworkz.Building;

public class OmkarRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Architect architect=new Omkar("Omkar","Bachelor Degree",9837460386L);
		Architect architect2=new Omkar();
		System.out.println(architect.name);
		System.out.println(architect.qualifications);
		System.out.println(architect.contactNo);
		
		Architect architect1=new Architect("Akhara","Bachelor Degree",9837973386L);
		System.out.println(architect1.name);
		System.out.println(architect1.qualifications);
		System.out.println(architect1.contactNo);
		
		architect2.display();
		

	}

}
