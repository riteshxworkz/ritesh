package IPLTeam;

public class IPLTeamRunner {

	public static void main(String[] args) {
		
		IPLTeam iplTeam1 = new IPLTeam("Royal Challengers Bengaluru","ChinnaSwamy Ground", "Faf-Du-Plesi", "Virat Kohli");
		IPLTeam iplTeam2 = new IPLTeam("Mumbai Indians","Wankhede Ground", "Rohith Sharma", "Rohith Sharma");
		
		iplTeam1.printInfo();
		iplTeam1.franchise1.printInfo();
		
		System.out.println();
		
		iplTeam2.printInfo();
		iplTeam2.franchise2.printInfo();

	}

}
