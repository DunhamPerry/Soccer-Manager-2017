import java.util.ArrayList;

public class generateSchedule {
	static ArrayList<LeagueTeams> Team = new ArrayList<LeagueTeams>();
	static ArrayList<EuropaTeams> ContinentalTeam = new ArrayList<EuropaTeams>();
	
	public static void main(String[] args) {
		leagueCompetition();
		leagueCupCompetition();
		europaCupCompetition();
	}
	public static void generateTeams(){
		Team.add(new LeagueTeams("Arsenal", 85));
		Team.add(new LeagueTeams("Tottenham", 90));
		Team.add(new LeagueTeams("Manchester United", 85));
		Team.add(new LeagueTeams("Manchester City", 85));
		Team.add(new LeagueTeams("Liverpool", 80));
		Team.add(new LeagueTeams("Everton", 70));
		Team.add(new LeagueTeams("West Ham United", 70));
		Team.add(new LeagueTeams("Southampton", 65));
		Team.add(new LeagueTeams("Sunderland", 30));
		Team.add(new LeagueTeams("Swansea City", 50));
		Team.add(new LeagueTeams("Chelsea", 90));
		Team.add(new LeagueTeams("Stoke City", 50));
		Team.add(new LeagueTeams("West Bromwich Albion", 55));
		Team.add(new LeagueTeams("Burnley", 40));
		Team.add(new LeagueTeams("Bournemouth", 35));
		Team.add(new LeagueTeams("Leicester City", 60));
		Team.add(new LeagueTeams("Crystal Palace", 40));
		Team.add(new LeagueTeams("Watford", 40));
		Team.add(new LeagueTeams("Middlesbrough", 50));
		ContinentalTeam.add(new EuropaTeams("Benfica", 80));
		ContinentalTeam.add(new EuropaTeams("Dortmund", 80));
		ContinentalTeam.add(new EuropaTeams("Paris SG", 80));
		ContinentalTeam.add(new EuropaTeams("Barcelona", 95));
		ContinentalTeam.add(new EuropaTeams("Bayern Munich", 95));
		ContinentalTeam.add(new EuropaTeams("Arsenal", 85));
		ContinentalTeam.add(new EuropaTeams("Real Madrid", 95));
		ContinentalTeam.add(new EuropaTeams("Napoli", 80));
		ContinentalTeam.add(new EuropaTeams("Tottenham", 90));
		ContinentalTeam.add(new EuropaTeams("Atletico Madrid", 90));
		ContinentalTeam.add(new EuropaTeams("Manchester City", 85));
		ContinentalTeam.add(new EuropaTeams("Monaco", 80));
		ContinentalTeam.add(new EuropaTeams("Juventus", 95));
		ContinentalTeam.add(new EuropaTeams("Sevilla", 80));
		ContinentalTeam.add(new EuropaTeams("Leicester", 60));
	}
	public static void leagueCompetition(){
		
	}
	public static void leagueCupCompetition(){
		
	}
	public static void europaCupCompetition(){
		
	}

}
