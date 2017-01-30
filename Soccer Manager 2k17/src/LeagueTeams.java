
public class LeagueTeams{

		private static String clubName;
		private int clubOverall;
		private static int points;

	public LeagueTeams(String cn, int co, int p){
		clubName = cn;
		clubOverall = co;
		points = p;
}

	public static String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public int getClubOverall() {
		return clubOverall;
	}

	public void setClubOverall(int clubOverall) {
		this.clubOverall = clubOverall;
	}
	
	public static int getPoints() {
		return points;
	}
	
	public void setPoints() {
		this.points = points;
	}

}
