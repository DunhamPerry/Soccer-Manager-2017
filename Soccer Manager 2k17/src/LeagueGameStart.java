
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
				if (pointBoundary < (GenerateSchedule.team.get(i).getClubOverall() - 40)){
				GenerateSchedule.team.set(i, null).setPoints(3);
				SeasonView.standings();
				}
			}
		}
		public static void gameRunner(){
			randomTeam = (int)(Math.random()*19);
			Game.intro();
		}

	}
