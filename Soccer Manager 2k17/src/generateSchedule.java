import java.util.ArrayList;

public class generateSchedule {
	static ArrayList<LeagueTeams> Team = new ArrayList<LeagueTeams>();
	static ArrayList<EuropaTeams> ContinentalTeam = new ArrayList<EuropaTeams>();
	
	public static void main(String[] args) {
		generateTeams();
	}
	public static void generateTeams(){
		Team.add(new LeagueTeams("Arsenal", 85, 0, "ARS"));
		Team.add(new LeagueTeams("Tottenham", 90, 0,"TOT"));
		Team.add(new LeagueTeams("Manchester United", 85, 0, "MUN"));
		Team.add(new LeagueTeams("Manchester City", 85, 0, "MCI"));
		Team.add(new LeagueTeams("Liverpool", 80, 0, "LIV"));
		Team.add(new LeagueTeams("Everton", 70, 0, "EVE"));
		Team.add(new LeagueTeams("West Ham United", 70, 0, "WHU"));
		Team.add(new LeagueTeams("Southampton", 65, 0, "SOU"));
		Team.add(new LeagueTeams("Sunderland", 30, 0, "SUN"));
		Team.add(new LeagueTeams("Swansea City", 50, 0, "SWA"));
		Team.add(new LeagueTeams("Chelsea", 90, 0, "CHE"));
		Team.add(new LeagueTeams("Stoke City", 50, 0, "STO"));
		Team.add(new LeagueTeams("West Bromwich Albion", 55, 0, "WBA"));
		Team.add(new LeagueTeams("Burnley", 40, 0, "BUR"));
		Team.add(new LeagueTeams("Bournemouth", 35, 0, "BOU"));
		Team.add(new LeagueTeams("Leicester City", 60, 0, "LEI"));
		Team.add(new LeagueTeams("Crystal Palace", 40, 0, "CRY"));
		Team.add(new LeagueTeams("Watford", 40, 0, "WAT"));
		Team.add(new LeagueTeams("Middlesbrough", 50, 0, "MID"));
		Team.add(new LeagueTeams(GeneratePlayer.teamName, 0, 0, GeneratePlayer.teamName.substring(0,2)));
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
		leagueCompetition();
	}
	public static void leagueCompetition(){
		leagueCupCompetition();
	}
	public static void leagueCupCompetition(){
		europaCupCompetition();
	}
	public static void europaCupCompetition(){
		SeasonView.runner();
	}

}
