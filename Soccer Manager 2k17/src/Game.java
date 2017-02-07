
public class Game
	{
		static int userPoints = 0;
		static int enemyPoints = 0;
		static String enemyTeamName = generateSchedule.Team.get(LeagueGameStart.randomTeam).getClubName();
		public static void main(String[] args){
		
		}
		public static void intro(){
			System.out.println("Hello and welcome to a match between " + GeneratePlayer.teamName + " and " + enemyTeamName + ".");
			delay();
			System.out.println("And the teams are looking to kick off");
			delay();
			longDelay();
			for (int x = 0; x < (int)(Math.random()*4)+1; x++){
			//switch((int)(Math.random()*10)+1){
				switch(1){
				case 1:
					//user striker shot outside the box
					System.out.println(GeneratePlayer.rosterDisplay[3][0] + " is dribbling outside the box");
					delay();
					System.out.println("It looks as if he is making a move to shoot!");
					delay();
					System.out.println(GeneratePlayer.rosterDisplay[3][0] + " shoots.......");
					delay();
					if (GeneratePlayer.Roster.get(9).getShooting() < (Math.random()*90)+10){
						System.out.println("Oh deary me! The ball flies over the net and into the stands!");
						delay();
						System.out.println(GeneratePlayer.rosterDisplay[3][0] + " will have to do much better than that if he wants to score!");
						delay();
						System.out.println(GeneratePlayer.teamName + " - " + userPoints);
						System.out.println(enemyTeamName + " - " + enemyPoints);
					}
					else if (GeneratePlayer.Roster.get(9).getShooting() < (Math.random()*60)+40){
						System.out.println("The ball is shot right into the goalie's path");
						delay();
						System.out.println("The goalkeeper catches it and clutches it to his chest");
						delay();
						System.out.println(GeneratePlayer.teamName + " - " + userPoints);
						System.out.println(enemyTeamName + " - " + enemyPoints);
					}
					else if (GeneratePlayer.Roster.get(9).getShooting() < (Math.random()*40)+60){
						System.out.println("The ball strikes the crossbar! What a close effort");
						delay();
						System.out.println(GeneratePlayer.rosterDisplay[3][0] + " with an almost incredible goal from outside the box!");
						delay();
						System.out.println(GeneratePlayer.teamName + " - " + userPoints);
						System.out.println(enemyTeamName + " - " + enemyPoints);
					}
					else {
						System.out.println(GeneratePlayer.rosterDisplay[3][0] + " scores! what a goal!");
						userPoints++;
						delay();
						System.out.println(GeneratePlayer.teamName + " - " + userPoints);
						System.out.println(enemyTeamName + " - " + enemyPoints);
					}
					break;
				case 2:
					System.out.println("Case 2");
					break;
				case 3:
					System.out.println("Case 3");
					break;
				case 4:
					System.out.println("Case 4");
					break;
				case 5:
					System.out.println("Case 5");
					break;
				case 6:
					System.out.println("Case 6");
					break;
				case 7:
					System.out.println("Case 7");
					break;
				case 8:
					System.out.println("Case 8");
					break;
				case 9:
					System.out.println("Case 9");
					break;
				case 10:
					System.out.println("Case 10");
					break;
			}
			}
			//second half
			for (int x = 0; x < (int)(Math.random()*4)+1; x++){
				switch((int)(Math.random()*10)+1){
					case 1:
						//user striker shot outside the box
						System.out.println("It looks as if " + GeneratePlayer.teamName + " are making a move to shoot!");
						delay();
						System.out.println(GeneratePlayer.rosterDisplay[3][0] + " shoots.......");
						break;
					case 2:
						System.out.println("Case 2");
						break;
					case 3:
						System.out.println("Case 3");
						break;
					case 4:
						System.out.println("Case 4");
						break;
					case 5:
						System.out.println("Case 5");
						break;
					case 6:
						System.out.println("Case 6");
						break;
					case 7:
						System.out.println("Case 7");
						break;
					case 8:
						System.out.println("Case 8");
						break;
					case 9:
						System.out.println("Case 9");
						break;
					case 10:
						System.out.println("Case 10");
						break;
				}
				}
			}
			//}
		
		public static void delay()
			{
	        try
					{
					Thread.sleep(1500);
					} catch (InterruptedException e)
					{
					e.printStackTrace();
					}
			}
		public static void longDelay()
		{
        try
				{
				Thread.sleep(6000);
				} catch (InterruptedException e)
				{
				e.printStackTrace();
				}
		}

	}
