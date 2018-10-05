import java.util.ArrayList;

public class GenerateSchedule {
	static ArrayList<LeagueTeams> team = new ArrayList<LeagueTeams>();
	
	public static void main(String[] args) {
		generateTeams();
	}
	public static void generateTeams(){
		team.add(new LeagueTeams("Uruguay", 8, 0, "URU", 1, "A", false));
		team.add(new LeagueTeams("Russia", 5, 0,"RUS", 1, "A", false));
		team.add(new LeagueTeams("Saudia Arabia", 2, 0, "SAU", 1, "A", false));
		team.add(new LeagueTeams("Eqypt", 4, 0, "EGY", 1, "A", false));
		team.add(new LeagueTeams("Spain", 8, 0, "ESP", 1, "B", false));
		team.add(new LeagueTeams("Portugal", 7, 0, "POR", 1, "B", false));
		team.add(new LeagueTeams("Iran", 5, 0, "IRA", 1, "B", false));
		team.add(new LeagueTeams("Morocco", 4, 0, "MOR", 1, "B", false));
		team.add(new LeagueTeams("France", 9, 0, "FRA", 1, "C", false));
		team.add(new LeagueTeams("Denmark", 6, 0, "DEN", 1, "C", false));
		team.add(new LeagueTeams("Peru", 6, 0, "PER", 1, "C", false));
		team.add(new LeagueTeams("Australia", 4, 0, "AUS", 1, "C", false));
		team.add(new LeagueTeams("Croatia", 8, 0, "CRO", 1, "D", false));
		team.add(new LeagueTeams("Argentina", 9, 0, "ARG", 1, "D", false));
		team.add(new LeagueTeams("Nigeria", 6, 0, "NGA", 1, "D", false));
		team.add(new LeagueTeams("Iceland", 6, 0, "ICE", 1, "D", false));
		team.add(new LeagueTeams("Brazil", 9, 0, "BRA", 1, "E", false));
		team.add(new LeagueTeams("Switzerland", 6, 0, "SWI", 1, "E", false));
		team.add(new LeagueTeams("Serbia", 6, 0, "SRB", 1, "E", false));
		team.add(new LeagueTeams("Costa Rica", 5, 0, "CRI", 1, "E", false));
		team.add(new LeagueTeams("Sweden", 7, 0, "SWE", 1, "F", false));
		team.add(new LeagueTeams("Mexico", 7, 0, "MEX", 1, "F", false));
		team.add(new LeagueTeams("South Korea", 5, 0, "RSK", 1, "F", false));
		team.add(new LeagueTeams("Germany", 8, 0, "GER", 1, "F", false));
		team.add(new LeagueTeams("Belgium", 9, 0, "BEL", 1, "G", false));
		team.add(new LeagueTeams("England", 8, 0, "ENG", 1, "G", false));
		team.add(new LeagueTeams("Tunisia", 2, 0, "TUN", 1, "G", false));
		team.add(new LeagueTeams("Panama", 2, 0, "PAN", 1, "G", false));
		team.add(new LeagueTeams("Colombia", 8, 0, "COL", 1, "H", false));
		team.add(new LeagueTeams("Japan", 6, 0, "JAP", 1, "H", false));
		team.add(new LeagueTeams("Senegal", 7, 0, "SEN", 1, "H", false));
		team.add(new LeagueTeams("Poland", 7, 0, "POL", 1, "H", false));
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
	public static ArrayList<Player> get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
