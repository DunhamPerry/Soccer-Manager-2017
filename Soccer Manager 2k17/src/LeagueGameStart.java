
public class LeagueGameStart
	{
		static int randomTeam;
		public static void main(String[] args)
			{
				//otherTeamPoints();
				gameRunner();
			}
		public static void otherTeamPoints(){
			for(int i = 0; i < 19; i++){
				int pointBoundary = (int)(Math.random()*100)+1;
				if (pointBoundary < (generateSchedule.Team.get(i).getClubOverall() - 40)){
				generateSchedule.Team.set(i, null).setPoints(3);
				SeasonView.leagueTable();
				}
			}
		}
		public static void gameRunner(){
			randomTeam = (int)(Math.random()*19);
			Game.intro();
		}

	}
