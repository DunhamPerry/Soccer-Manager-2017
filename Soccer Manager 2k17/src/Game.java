
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
		for (int y = 0; y < 1; y++){
			for (int x = 0; x < (int)(Math.random()*6)+1; x++){
			longDelay();
			//switch((int)(Math.random()*5)+1){
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
						scoreboard();
					}
					else if (GeneratePlayer.Roster.get(9).getShooting() < (Math.random()*60)+40){
						System.out.println("The ball is shot right into the goalie's path");
						delay();
						System.out.println("The goalkeeper catches it and clutches it to his chest");
						delay();
						scoreboard();
					}
					else if (GeneratePlayer.Roster.get(9).getShooting() < (Math.random()*40)+60){
						System.out.println("The ball strikes the crossbar! What a close effort");
						delay();
						System.out.println(GeneratePlayer.rosterDisplay[3][0] + " with an almost incredible goal from outside the box!");
						delay();
						scoreboard();
					}
					else {
						System.out.println(GeneratePlayer.rosterDisplay[3][0] + " scores! what a goal!");
						userPoints++;
						delay();
						scoreboard();
					}
					break;
				case 2:
					//dribble to the corner and cross
					System.out.println(GeneratePlayer.rosterDisplay[2][2] + " is making a run towards the right corner");
					delay();
					System.out.println("He's taking on the defender 1 on 1");
					delay();
					if (GeneratePlayer.Roster.get(8).getDribbling() < (Math.random()*90)+10){
						System.out.println("The defender runs up and shoves " + GeneratePlayer.rosterDisplay[2][2] + " to the ground!");
						delay();
						System.out.println(GeneratePlayer.rosterDisplay[2][2] + " loses the ball and turns the ball over");
						delay();
						System.out.println(GeneratePlayer.teamName + " - " + userPoints);
						System.out.println(enemyTeamName + " - " + enemyPoints);
					}
					else if (GeneratePlayer.Roster.get(8).getDribbling() < (Math.random()*60)+40){
						System.out.println(GeneratePlayer.rosterDisplay[2][2] + " attempts to get around the defender with a step over move");
						delay();
						System.out.println("He almost got around him but the ball is taken by the defender");
						delay();
						System.out.println(GeneratePlayer.teamName + " - " + userPoints);
						System.out.println(enemyTeamName + " - " + enemyPoints);
					}
					else if (GeneratePlayer.Roster.get(8).getDribbling() < (Math.random()*40)+60){
						System.out.println(GeneratePlayer.rosterDisplay[2][2] + " attempts to get around the defender with a step over move");
						delay();
						System.out.println("What an incredible slide tackle. An amazing steal from the defender.");
						delay();
						System.out.println(GeneratePlayer.teamName + " - " + userPoints);
						System.out.println(enemyTeamName + " - " + enemyPoints);
					}
					else {
						System.out.println(GeneratePlayer.rosterDisplay[2][2] + "attempts to get around the defender with a step over move");
						delay();
						System.out.println(GeneratePlayer.rosterDisplay[2][2] + " successfully gets past the defender with that move");
						delay();
						System.out.println(GeneratePlayer.rosterDisplay[2][2] + " is looking to cross the ball into the box for a chance to score");
						
						if (GeneratePlayer.Roster.get(9).getPhysical() < (Math.random()*90)+10){
							System.out.println(GeneratePlayer.rosterDisplay[2][2] + " crosses the ball into the box");
							delay();
							System.out.println("The ball flies over the box and goes out of bounds on the other side");
							delay();
							System.out.println(GeneratePlayer.teamName + " - " + userPoints);
							System.out.println(enemyTeamName + " - " + enemyPoints);
						}
						else if (GeneratePlayer.Roster.get(9).getPhysical() < (Math.random()*60)+40){
							System.out.println(GeneratePlayer.rosterDisplay[2][2] + " crosses the ball into the box");
							delay();
							System.out.println("The ball falls into the box but nobody is there to head it");
							delay();
							System.out.println("The ball is cleared to the other side of the field");
							delay();
							System.out.println(GeneratePlayer.teamName + " - " + userPoints);
							System.out.println(enemyTeamName + " - " + enemyPoints);
						}
						else if (GeneratePlayer.Roster.get(9).getPhysical() < (Math.random()*40)+60){
							System.out.println(GeneratePlayer.rosterDisplay[2][2] + " crosses the ball into the box");
							delay();
							System.out.println("The ball finds " + GeneratePlayer.rosterDisplay[3][0] + "'s head!");
							delay();
							System.out.println("The ball is shot over the crossbar and out of play. What a goal that would have been!");
							delay();
							System.out.println(GeneratePlayer.teamName + " - " + userPoints);
							System.out.println(enemyTeamName + " - " + enemyPoints);
						}
						else {
							System.out.println(GeneratePlayer.rosterDisplay[2][2] + " crosses the ball into the box");
							delay();
							System.out.println("The ball finds " + GeneratePlayer.rosterDisplay[3][0] + "'s head!");
							delay();
							System.out.println("The ball finds the back of the net for a goal!");
							delay();
							userPoints++;
						}
						System.out.println(GeneratePlayer.teamName + " - " + userPoints);
						System.out.println(enemyTeamName + " - " + enemyPoints);
					}
					break;
				case 3:
					//free kick
					System.out.println(GeneratePlayer.rosterDisplay[2][1] + " is making a run past the defender");
					delay();
					System.out.println("OH! He is tripped up and fouled");
					delay();
					System.out.println(GeneratePlayer.rosterDisplay[2][1] + " steps up to take the shot");
					delay();
					System.out.println(GeneratePlayer.teamName + " will have a free kick on the edge of the box");
					delay();
					System.out.println(GeneratePlayer.rosterDisplay[2][1] + " shoots...");
					if (GeneratePlayer.Roster.get(7).getShooting() < (Math.random()*90)+10){
						System.out.println("The ball flies right into the player wall. No goal.");
						delay();
						System.out.println(GeneratePlayer.teamName + " - " + userPoints);
						System.out.println(enemyTeamName + " - " + enemyPoints);
					}
					else if (GeneratePlayer.Roster.get(7).getShooting() < (Math.random()*60)+40){
						System.out.println("The ball flies over the net. No goal.");
						delay();
						System.out.println(GeneratePlayer.teamName + " - " + userPoints);
						System.out.println(enemyTeamName + " - " + enemyPoints);
					}
					else if (GeneratePlayer.Roster.get(7).getShooting() < (Math.random()*40)+60){
						System.out.println("The ball flies right at the goalkeeper");
						delay();
						System.out.println("He makes the safe. No goal");
						delay();
						System.out.println(GeneratePlayer.teamName + " - " + userPoints);
						System.out.println(enemyTeamName + " - " + enemyPoints);
					}
					else if (GeneratePlayer.Roster.get(7).getShooting() < (Math.random()*40)+60){
						System.out.println("The ball flies. IT LOOKS AS IF ITS HEADED TOWARDS THE TOP CORNER!");
						delay();
						System.out.println("The ball smacks against the post. No goal");
						delay();
						System.out.println("What a goal that would have been");
						delay();
						System.out.println(GeneratePlayer.teamName + " - " + userPoints);
						System.out.println(enemyTeamName + " - " + enemyPoints);
					}
					else {
						System.out.println("The ball flies. IT LOOKS AS IF ITS HEADED TOWARDS THE TOP CORNER!");
						delay();
						System.out.println("GOOOOOAL!!!!!");
						delay();
						System.out.println("The ball creeps into the top corner and finds the back of the net.");
						delay();
						userPoints++;
						System.out.println(GeneratePlayer.teamName + " - " + userPoints);
						System.out.println(enemyTeamName + " - " + enemyPoints);
					}
					break;
				case 4:
					//penalty
					System.out.println(GeneratePlayer.rosterDisplay[3][0] + " gets the ball and makes a run into the box.");
					delay();
					System.out.println("OH! He is tripped up and fouled");
					delay();
					System.out.println("The referee whistles for a penalty");
					delay();
					System.out.println(GeneratePlayer.teamName + " will have a chance to score from the penalty area");
					delay();
					System.out.println(GeneratePlayer.rosterDisplay[3][0] + " steps up towards the ball and looks the goalie dead in the eye");
					delay();
					System.out.println("He starts his run up and shoots...");
					delay();
					if (GeneratePlayer.Roster.get(9).getShooting() < (Math.random()*90)+10){
						System.out.println("The ball flies over the net, into the stands!");
						delay();
						System.out.println("The pressure must have gotten to " + GeneratePlayer.rosterDisplay[3][0] + ". No goal");
						delay();
						System.out.println(GeneratePlayer.teamName + " - " + userPoints);
						System.out.println(enemyTeamName + " - " + enemyPoints);
					}
					else if (GeneratePlayer.Roster.get(9).getShooting() < (Math.random()*90)+10){
						System.out.println("The ball starts flying towards a corner!");
						delay();
						System.out.println("It hits the net and bounces away! No goal!");
						delay();
						System.out.println(GeneratePlayer.teamName + " - " + userPoints);
						System.out.println(enemyTeamName + " - " + enemyPoints);
					}
					else if (GeneratePlayer.Roster.get(9).getShooting() < (Math.random()*90)+10){
						System.out.println("The ball starts flying towards a corner!");
						delay();
						System.out.println("The goalie dives and makes an incredible goal to keep the ball out! What a save!");
						delay();
						System.out.println(GeneratePlayer.teamName + " - " + userPoints);
						System.out.println(enemyTeamName + " - " + enemyPoints);
					}
					else {
						System.out.println("The ball starts flying towards a corner!");
						delay();
						System.out.println("GOOOOOAL! The ball finds the back of the net to give " + GeneratePlayer.teamName + " a goal");
						delay();
						userPoints++;
						System.out.println(GeneratePlayer.teamName + " - " + userPoints);
						System.out.println(enemyTeamName + " - " + enemyPoints);
					}
					break;
				case 5:
					//pass, shoot outside box
					System.out.println(GeneratePlayer.rosterDisplay[1][0] + " dribbles the ball towards the opposition");
					delay();
					System.out.println("He picks out " + GeneratePlayer.rosterDisplay[2][0] + " and passes the ball");
					delay();
					if (GeneratePlayer.Roster.get(4).getPassing() < (Math.random()*90)+10){
						System.out.println("The ball flies over the head of " + GeneratePlayer.rosterDisplay[2][0] + " and goes out of play");
						delay();
						System.out.println(GeneratePlayer.teamName + " - " + userPoints);
						System.out.println(enemyTeamName + " - " + enemyPoints);
					}
					else if (GeneratePlayer.Roster.get(4).getPassing() < (Math.random()*60)+40){
						System.out.println("The ball flies right into the path of a " + enemyTeamName + " player's path");
						delay();
						System.out.println("The ball is turned over");
						System.out.println(GeneratePlayer.teamName + " - " + userPoints);
						System.out.println(enemyTeamName + " - " + enemyPoints);
					}
					else {
						System.out.println("The pass is completed successfully to " + GeneratePlayer.rosterDisplay[2][0]);
						delay();
						System.out.println(GeneratePlayer.rosterDisplay[2][0] + " gains possession and turns towards the goal");
						delay();
						System.out.println("He goes to shoot...");
						if (GeneratePlayer.Roster.get(6).getShooting() < (Math.random()*90)+10){
							System.out.println("The ball flies over the net and into the stands. No goal");
							delay();
							System.out.println(GeneratePlayer.teamName + " - " + userPoints);
							System.out.println(enemyTeamName + " - " + enemyPoints);
						}
						else if (GeneratePlayer.Roster.get(6).getShooting() < (Math.random()*60)+40){
							System.out.println("The goalie makes a save and brings the ball to his chest. No goal.");
							delay();
							System.out.println(GeneratePlayer.teamName + " - " + userPoints);
							System.out.println(enemyTeamName + " - " + enemyPoints);
						}
						else if (GeneratePlayer.Roster.get(6).getShooting() < (Math.random()*40)+60){
							System.out.println("The ball smacks against the post. No goal.");
							delay();
							System.out.println(GeneratePlayer.teamName + " - " + userPoints);
							System.out.println(enemyTeamName + " - " + enemyPoints);
						}
						else {
							System.out.println("GOOOOOAL!!!!!");
							delay();
							System.out.println("The ball zoomed past the keeper and finds the back of the net!");
							delay();
							userPoints++;
							System.out.println(GeneratePlayer.teamName + " - " + userPoints);
							System.out.println(enemyTeamName + " - " + enemyPoints);
						}
					}
					break;
				case 6:
					//through ball
					System.out.println(GeneratePlayer.rosterDisplay[2][1] + " has the ball at midfield");
					delay();
					System.out.println("The enemy players are closing in");
					delay();
					System.out.println(GeneratePlayer.rosterDisplay[3][0] + " is making run past the defenders");
					delay();
					System.out.println(GeneratePlayer.rosterDisplay[2][1] + " passes the ball through the defense...");
					delay();
					
					if (GeneratePlayer.Roster.get(9).getPace() < (Math.random()*50)+50){
						System.out.println(GeneratePlayer.rosterDisplay[3][0] + " is offsides, the ball is turned over");
						delay();
						System.out.println(GeneratePlayer.teamName + " - " + userPoints);
						System.out.println(enemyTeamName + " - " + enemyPoints);
					}
					else {
						System.out.println("The referree keeps his flag down. " + GeneratePlayer.rosterDisplay[3][0] + " is onsides");
						delay();
						
						if (GeneratePlayer.Roster.get(7).getPassing() < (Math.random()*90)+10){
							System.out.println("The ball is passed right into the defense. The enemy is on a fast break");
							delay();
							System.out.println(GeneratePlayer.teamName + " - " + userPoints);
							System.out.println(enemyTeamName + " - " + enemyPoints);
						}
						else if (GeneratePlayer.Roster.get(7).getPassing() < (Math.random()*60)+40){
							System.out.println("The pass is from " + GeneratePlayer.rosterDisplay[2][1] + " is too far and the goalie collects it");
							delay();
							System.out.println(GeneratePlayer.teamName + " - " + userPoints);
							System.out.println(enemyTeamName + " - " + enemyPoints);
						}
						else if (GeneratePlayer.Roster.get(7).getPassing() < (Math.random()*40)+60){
							System.out.println("The ball is just past " + GeneratePlayer.rosterDisplay[3][0] + " and goes out of play");
							delay();
							System.out.println(GeneratePlayer.teamName + " - " + userPoints);
							System.out.println(enemyTeamName + " - " + enemyPoints);
						}
						else {
							System.out.println(GeneratePlayer.rosterDisplay[2][1] + " gives a perfect pass down through the center");
							delay();
							System.out.println(GeneratePlayer.rosterDisplay[3][0] + " collects the ball and turns towards goal");
							delay();
							System.out.println(GeneratePlayer.rosterDisplay[3][0] + " shoots...");
							
							if (GeneratePlayer.Roster.get(9).getShooting() < (Math.random()*90)+10){
								System.out.println("The ball flies over the net into the stands. No goal");
								delay();
								System.out.println(GeneratePlayer.teamName + " - " + userPoints);
								System.out.println(enemyTeamName + " - " + enemyPoints);
							}
							else if (GeneratePlayer.Roster.get(9).getShooting() < (Math.random()*60)+40){
								System.out.println("The ball flies towards the net...");
								delay();
								System.out.println("The goalkeeper makes a save to keep the ball out");
								System.out.println(GeneratePlayer.teamName + " - " + userPoints);
								System.out.println(enemyTeamName + " - " + enemyPoints);
							}
							else if (GeneratePlayer.Roster.get(9).getShooting() < (Math.random()*40)+60){
								System.out.println("The ball flies towards the net...");
								delay();
								System.out.println("The ball smacks against the post. No goal");
								System.out.println(GeneratePlayer.teamName + " - " + userPoints);
								System.out.println(enemyTeamName + " - " + enemyPoints);
							}
							else {
								System.out.println("The ball flies towards the net...");
								delay();
								System.out.println("GOOOOOOOAL! " + GeneratePlayer.rosterDisplay[3][0] + " has scored a goal for " + GeneratePlayer.teamName);
								delay();
								userPoints++;
								System.out.println(GeneratePlayer.teamName + " - " + userPoints);
								System.out.println(enemyTeamName + " - " + enemyPoints);
							}
						}
					}
					break;
				case 7:
					//cross inside box
					System.out.println("Case 7");
					break;
				case 8:
					//enemy shot outside box
					System.out.println("Case 8");
					break;
				case 9:
					//enemy dribble then cross
					System.out.println("Case 9");
					break;
				case 10:
					//enemy through ball
					System.out.println("Case 10");
					break;
			}
			}
				System.out.println("The referree whistles for the end of the first half");
				delay();
				System.out.println(GeneratePlayer.teamName + " - " + userPoints);
				System.out.println(enemyTeamName + " - " + enemyPoints);
				delay();
				System.out.println("And the second half gets underway!");
				}
			}
			//}
		
		public static void scoreboard(){
			System.out.println();
			System.out.println("-----------------------------------------");
			System.out.print("|      ");
			System.out.printf("%-10s", GeneratePlayer.teamName);
			System.out.print("   |      ");
			System.out.printf("%-10s", enemyTeamName);
	        System.out.println("   |");
	        System.out.println("|         " + userPoints + "         |         " + enemyPoints + "         |");
	        System.out.println("-----------------------------------------");
	        System.out.println();
		}
		
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
