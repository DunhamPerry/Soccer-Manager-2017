
public class LeagueTeams{

		private String clubName;
		private int clubOverall;
		private int points;
		private String clubInitials;

	public LeagueTeams(String cn, int co, int p, String ci){
		clubName = cn;
		clubOverall = co;
		points = p;
		clubInitials = ci;
}

	public String getClubName()
		{
			return clubName;
		}

	public void setClubName(String clubName)
		{
			this.clubName = clubName;
		}

	public int getClubOverall()
		{
			return clubOverall;
		}

	public void setClubOverall(int clubOverall)
		{
			this.clubOverall = clubOverall;
		}

	public int getPoints()
		{
			return points;
		}

	public void setPoints(int points)
		{
			this.points = points;
		}
	
	public String getClubInitials()
		{
			return clubInitials;
		}

	public void setBlubInitials(String clubInitials)
		{
			this.clubInitials = clubInitials;
		}

}