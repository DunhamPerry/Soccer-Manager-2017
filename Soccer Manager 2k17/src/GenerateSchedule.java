import java.util.ArrayList;

public class GenerateSchedule {
	static ArrayList<LeagueTeams> team = new ArrayList<LeagueTeams>();
	static ArrayList<EuropaTeams> ContinentalTeam = new ArrayList<EuropaTeams>();
	
	public static void main(String[] args) {
		generateTeams();
	}
	public static void generateTeams(){
		team.add(new LeagueTeams("Uruguay", 80, 0, "URU", 1, "A", false));
		team.add(new LeagueTeams("Russia", 79, 0,"RUS", 1, "A", false));
		team.add(new LeagueTeams("Saudia Arabia", 72, 0, "SAU", 1, "A", false));
		team.add(new LeagueTeams("Eqypt", 76, 0, "EGY", 1, "A", false));
		team.add(new LeagueTeams("Spain", 86, 0, "ESP", 1, "B", false));
		team.add(new LeagueTeams("Portugal", 84, 0, "POR", 1, "B", false));
		team.add(new LeagueTeams("Iran", 74, 0, "IRA", 1, "B", false));
		team.add(new LeagueTeams("Morocco", 76, 0, "MOR", 1, "B", false));
		team.add(new LeagueTeams("France", 85, 0, "FRA", 1, "C", false));
		team.add(new LeagueTeams("Denmark", 78, 0, "DEN", 1, "C", false));
		team.add(new LeagueTeams("Peru", 76, 0, "PER", 1, "C", false));
		team.add(new LeagueTeams("Australia", 71, 0, "AUS", 1, "C", false));
		team.add(new LeagueTeams("Croatia", 84, 0, "CRO", 1, "D", false));
		team.add(new LeagueTeams("Argentina", 84, 0, "ARG", 1, "D", false));
		team.add(new LeagueTeams("Nigeria", 74, 0, "NIG", 1, "D", false));
		team.add(new LeagueTeams("Iceland", 76, 0, "ICE", 1, "D", false));
		team.add(new LeagueTeams("Brazil", 86, 0, "BRA", 1, "E", false));
		team.add(new LeagueTeams("Switzerland", 78, 0, "SWI", 1, "E", false));
		team.add(new LeagueTeams("Serbia", 77, 0, "SRB", 1, "E", false));
		team.add(new LeagueTeams("Costa Rica", 73, 0, "CRI", 1, "E", false));
		team.add(new LeagueTeams("Sweden", 80, 0, "SWE", 1, "F", false));
		team.add(new LeagueTeams("Mexico", 79, 0, "MEX", 1, "F", false));
		team.add(new LeagueTeams("South Korea", 73, 0, "RSK", 1, "F", false));
		team.add(new LeagueTeams("Germany", 80, 0, "GER", 1, "F", false));
		team.add(new LeagueTeams("Belgium", 83, 0, "BEL", 1, "G", false));
		team.add(new LeagueTeams("England", 81, 0, "ENG", 1, "G", false));
		team.add(new LeagueTeams("Tunisia", 73, 0, "TUN", 1, "G", false));
		team.add(new LeagueTeams("Panama", 69, 0, "PAN", 1, "G", false));
		team.add(new LeagueTeams("Colombia", 79, 0, "COL", 1, "H", false));
		team.add(new LeagueTeams("Japan", 75, 0, "JAP", 1, "H", false));
		team.add(new LeagueTeams("Senegal", 76, 0, "SEN", 1, "H", false));
		team.add(new LeagueTeams("Poland", 80, 0, "POL", 1, "H", false));
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
