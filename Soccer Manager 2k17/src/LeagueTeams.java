
	public class LeagueTeams {

		private String clubName;
		private int clubOverall;

	public LeagueTeams(String cn, int co){
		clubName = cn;
		clubOverall = co;
		

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
}
