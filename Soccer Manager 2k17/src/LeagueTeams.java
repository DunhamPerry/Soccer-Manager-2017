//a
public class LeagueTeams{

		private String clubName;
		private int clubOverall;
		private int points;
		private String clubInitials;
		private int round;
		private String group;
		private boolean player;

	public LeagueTeams(String cn, int co, int p, String ci, int r, String g, boolean pl){
		clubName = cn;
		clubOverall = co;
		points = p;
		clubInitials = ci;
		round = r;
		group = g;
		player = pl;
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

	public static LeagueTeams get(int i)
		{
			// TODO Auto-generated method stub
			return null;
		}

	public int getRound()
		{
			return round;
		}

	public void setRound(int round)
		{
			this.round = round;
		}

	public String getGroup()
		{
			return group;
		}

	public void setGroup(String group)
		{
			this.group = group;
		}

	public boolean isPlayer()
		{
			return player;
		}

	public void setPlayer(boolean player)
		{
			this.player = player;
		}

	public void setClubInitials(String clubInitials)
		{
			this.clubInitials = clubInitials;
		}

}