package IPLTeam;

public class IPLTeam {
	
	String teamName;
	String homeGround;
	String captain;
	String famousPlayer;
	
	Franchise franchise1 = new Franchise("RCB","Bengaluru","United Spirits",700);
	Franchise franchise2 = new Franchise("MI","Mumbai","Reliance Industries",800);
	
	IPLTeam(String teamName, String homeGround, String captain, String famousPlayer){
		
		this.teamName=teamName;
		this.homeGround=homeGround;
		this.captain=captain;
		this.famousPlayer=famousPlayer;
		
	}
	
	void printInfo() {
		
		System.out.println("Team Name : "+this.teamName);
		System.out.println("Home Ground : "+this.homeGround);
		System.out.println("Cpatain : "+this.captain);
		System.out.println("Famous Player : "+this.famousPlayer);
		
	}
}
