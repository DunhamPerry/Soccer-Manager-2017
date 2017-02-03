
public class Game
	{
		static String enemyTeamName = generateSchedule.Team.get(LeagueGameStart.randomTeam).getClubName();
		public static void main(String[] args){
		
		}
		public static void intro(){
			System.out.println("Hello and welcome to a match between " + GeneratePlayer.teamName + " and " + enemyTeamName + ".");
			delay();
			System.out.println("And the teams are looking to kick off");
			delay();
			for (int x = 0; x < 7; x++){
			//switch((int)(Math.random()*10)+1){
				//case 1:
					//user striker shot outside the box
					System.out.println("It looks as if " + GeneratePlayer.teamName + " are making a move to shoot!");
					delay();
					System.out.println(GeneratePlayer.rosterDisplay[3][0] + " shoots.......");
			}
			}
			//}
		
		public static void delay()
			{
	        try
					{
					Thread.sleep(500);
					} catch (InterruptedException e)
					{
					e.printStackTrace();
					}
			}

	}
