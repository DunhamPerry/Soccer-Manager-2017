import java.util.ArrayList;

public class GenerateSchedule {
	static ArrayList<LeagueTeams> team = new ArrayList<LeagueTeams>();
	static ArrayList<EuropaTeams> ContinentalTeam = new ArrayList<EuropaTeams>();
	
	public static void main(String[] args) {
		generateTeams();
	}
	public static void generateTeams(){
		team.add(new LeagueTeams("Uruguay", 85, 0, "URU", 1, "A", false));
		team.add(new LeagueTeams("Russia", 90, 0,"RUS", 1, "A", false));
		team.add(new LeagueTeams("Saudia Arabia", 85, 0, "SAU", 1, "A", false));
		team.add(new LeagueTeams("Eqypt", 85, 0, "EGY", 1, "A", false));
		team.add(new LeagueTeams("Spain", 80, 0, "ESP", 1, "B", false));
		team.add(new LeagueTeams("Portugal", 70, 0, "POR", 1, "B", false));
		team.add(new LeagueTeams("Iran", 70, 0, "IRA", 1, "B", false));
		team.add(new LeagueTeams("Morocco", 65, 0, "MOR", 1, "B", false));
		team.add(new LeagueTeams("France", 30, 0, "FRA", 1, "C", false));
		team.add(new LeagueTeams("Denmark", 50, 0, "DEN", 1, "C", false));
		team.add(new LeagueTeams("Peru", 90, 0, "PER", 1, "C", false));
		team.add(new LeagueTeams("Australia", 50, 0, "AUS", 1, "C", false));
		team.add(new LeagueTeams("Croatia", 55, 0, "CRO", 1, "D", false));
		team.add(new LeagueTeams("Argentina", 40, 0, "ARG", 1, "D", false));
		team.add(new LeagueTeams("Nigeria", 35, 0, "NIG", 1, "D", false));
		team.add(new LeagueTeams("Iceland", 60, 0, "ICE", 1, "D", false));
		team.add(new LeagueTeams("Brazil", 40, 0, "BRA", 1, "E", false));
		team.add(new LeagueTeams("Switzerland", 40, 0, "SWI", 1, "E", false));
		team.add(new LeagueTeams("Serbia", 50, 0, "SRB", 1, "E", false));
		team.add(new LeagueTeams("Costa Rica", 50, 0, "CRI", 1, "E", false));
		team.add(new LeagueTeams("Sweden", 50, 0, "SWE", 1, "F", false));
		team.add(new LeagueTeams("Mexico", 50, 0, "MEX", 1, "F", false));
		team.add(new LeagueTeams("South Korea", 50, 0, "RSK", 1, "F", false));
		team.add(new LeagueTeams("Germany", 50, 0, "GER", 1, "F", false));
		team.add(new LeagueTeams("Belgium", 50, 0, "BEL", 1, "G", false));
		team.add(new LeagueTeams("England", 50, 0, "ENG", 1, "G", false));
		team.add(new LeagueTeams("Tunisia", 50, 0, "TUN", 1, "G", false));
		team.add(new LeagueTeams("Panama", 50, 0, "PAN", 1, "G", false));
		team.add(new LeagueTeams("Colombia", 50, 0, "COL", 1, "H", false));
		team.add(new LeagueTeams("Japan", 50, 0, "JAP", 1, "H", false));
		team.add(new LeagueTeams("Senegal", 50, 0, "SEN", 1, "H", false));
		team.add(new LeagueTeams("Poland", 50, 0, "POL", 1, "H", false));
		//Team.add(new LeagueTeams(GeneratePlayer.teamName, 0, 0, GeneratePlayer.teamName.substring(0,2)));
		GeneratePlayer.runner();
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
