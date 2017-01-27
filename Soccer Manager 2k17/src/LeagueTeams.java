
public class LeagueTeams{

		private String clubName;
		private int clubOverall;
		private int points;

	public LeagueTeams(String cn, int co, int p){
		clubName = cn;
		clubOverall = co;
		points = p;
}

	public String getClubName() {
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
	
	public int getPoints() {
		return points;
	}
	
	public void setPoints() {
		this.points = points;
	}

}
