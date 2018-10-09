
public class Game
	{
		static int userPoints = 0;
		static int enemyPoints = 0;
		static String enemyTeamName;
		static String enemyTeamNameFull;
		public static void main(String[] args){
		
		}
		public static void intro(){
			enemyTeamName = GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getClubInitials();
			enemyTeamNameFull = GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getClubName();
			System.out.println("Hello and welcome to a match between " + GeneratePlayer.userTeamName + " and " + enemyTeamNameFull + ".");
			delay();
			System.out.println("And the teams are looking to kick off");
			delay();
			int counter = 1;
		for (int y = 0; y < 2; y++){
			for (int x = 0; x < (int)(Math.random()*6)+1; x++){
			//for (int x = 0; x < (int)(Math.random()*0)+0; x++){
				int randomNumber = (int)(Math.random()*10)+1;
				int split = 0;
				switch(GenerateSchedule.team.get(GeneratePlayer.teamNumber-1).getClubOverall() - GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getClubOverall()) {
				case -3:
					split = 8;
					break;
				case -2:
					split = 7;
					break;
				case -1:
					split = 6;
					break;
				case 0:
					split = 5;
					break;
				case 1:
					split = 4;
					break;
				case 2:
					split = 4;
					break;
				case 3:
					split = 3;
					break;
				case 4:
					split = 3;
					break;
				case 5:
					split = 2;
					break;
				case 6: 
					split = 2;
					break;
				case 7: 
					split = 1;
					break;
				}
			longDelay();
		if (randomNumber > split){
		//good team Chance
			System.out.println("A chance for " + GenerateSchedule.team.get(GeneratePlayer.teamNumber-1).getClubName());
			switch((int)(Math.random()*7)+1){
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
						scoreboard();
					}
					else if (GeneratePlayer.Roster.get(8).getDribbling() < (Math.random()*60)+40){
						System.out.println(GeneratePlayer.rosterDisplay[2][2] + " attempts to get around the defender with a step over move");
						delay();
						System.out.println("He almost got around him but the ball is taken by the defender");
						delay();
						scoreboard();
					}
					else if (GeneratePlayer.Roster.get(8).getDribbling() < (Math.random()*40)+60){
						System.out.println(GeneratePlayer.rosterDisplay[2][2] + " attempts to get around the defender with a step over move");
						delay();
						System.out.println("What an incredible slide tackle. An amazing steal from the defender.");
						delay();
						scoreboard();
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
							scoreboard();
						}
						else if (GeneratePlayer.Roster.get(9).getPhysical() < (Math.random()*60)+40){
							System.out.println(GeneratePlayer.rosterDisplay[2][2] + " crosses the ball into the box");
							delay();
							System.out.println("The ball falls into the box but nobody is there to head it");
							delay();
							System.out.println("The ball is cleared to the other side of the field");
							delay();
							scoreboard();
						}
						else if (GeneratePlayer.Roster.get(9).getPhysical() < (Math.random()*40)+60){
							System.out.println(GeneratePlayer.rosterDisplay[2][2] + " crosses the ball into the box");
							delay();
							System.out.println("The ball finds " + GeneratePlayer.rosterDisplay[3][0] + "'s head!");
							delay();
							System.out.println("The ball is shot over the crossbar and out of play. What a goal that would have been!");
							delay();
							scoreboard();
						}
						else {
							System.out.println(GeneratePlayer.rosterDisplay[2][2] + " crosses the ball into the box");
							delay();
							System.out.println("The ball finds " + GeneratePlayer.rosterDisplay[3][0] + "'s head!");
							delay();
							System.out.println("The ball finds the back of the net for a goal!");
							delay();
							userPoints++;
							scoreboard();
						}
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
					System.out.println(GenerateSchedule.team.get(GeneratePlayer.teamNumber-1).getClubInitials() + " will have a free kick on the edge of the box");
					delay();
					System.out.println(GeneratePlayer.rosterDisplay[2][1] + " shoots...");
					if (GeneratePlayer.Roster.get(7).getShooting() < (Math.random()*90)+10){
						System.out.println("The ball flies right into the player wall. No goal.");
						delay();
						scoreboard();
					}
					else if (GeneratePlayer.Roster.get(7).getShooting() < (Math.random()*60)+40){
						System.out.println("The ball flies over the net. No goal.");
						delay();
						scoreboard();
					}
					else if (GeneratePlayer.Roster.get(7).getShooting() < (Math.random()*40)+60){
						System.out.println("The ball flies right at the goalkeeper");
						delay();
						System.out.println("He makes the safe. No goal");
						delay();
						scoreboard();
					}
					else if (GeneratePlayer.Roster.get(7).getShooting() < (Math.random()*40)+60){
						System.out.println("The ball flies. IT LOOKS AS IF ITS HEADED TOWARDS THE TOP CORNER!");
						delay();
						System.out.println("The ball smacks against the post. No goal");
						delay();
						System.out.println("What a goal that would have been");
						delay();
						scoreboard();
					}
					else {
						System.out.println("The ball flies. IT LOOKS AS IF ITS HEADED TOWARDS THE TOP CORNER!");
						delay();
						System.out.println("GOOOOOAL!!!!!");
						delay();
						System.out.println("The ball creeps into the top corner and finds the back of the net.");
						delay();
						userPoints++;
						scoreboard();
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
					System.out.println(GenerateSchedule.team.get(GeneratePlayer.teamNumber-1).getClubInitials() + " will have a chance to score from the penalty area");
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
						scoreboard();
					}
					else if (GeneratePlayer.Roster.get(9).getShooting() < (Math.random()*90)+10){
						System.out.println("The ball starts flying towards a corner!");
						delay();
						System.out.println("It hits the post and bounces away! No goal!");
						delay();
						scoreboard();
					}
					else if (GeneratePlayer.Roster.get(9).getShooting() < (Math.random()*90)+10){
						System.out.println("The ball starts flying towards a corner!");
						delay();
						System.out.println("The goalie dives and makes an incredible goal to keep the ball out! What a save!");
						delay();
						scoreboard();
					}
					else {
						System.out.println("The ball starts flying towards a corner!");
						delay();
						System.out.println("GOOOOOAL! The ball finds the back of the net to give " + GenerateSchedule.team.get(GeneratePlayer.teamNumber-1).getClubInitials() + " a goal");
						delay();
						userPoints++;
						scoreboard();
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
						scoreboard();
					}
					else if (GeneratePlayer.Roster.get(4).getPassing() < (Math.random()*60)+40){
						System.out.println("The ball flies right into the path of a " + enemyTeamName + " player's path");
						delay();
						System.out.println("The ball is turned over");
						scoreboard();
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
							scoreboard();
						}
						else if (GeneratePlayer.Roster.get(6).getShooting() < (Math.random()*60)+40){
							System.out.println("The goalie makes a save and brings the ball to his chest. No goal.");
							delay();
							scoreboard();
						}
						else if (GeneratePlayer.Roster.get(6).getShooting() < (Math.random()*40)+60){
							System.out.println("The ball smacks against the post. No goal.");
							delay();
							scoreboard();
						}
						else {
							System.out.println("GOOOOOAL!!!!!");
							delay();
							System.out.println("The ball zoomed past the keeper and finds the back of the net!");
							delay();
							userPoints++;
							scoreboard();
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
						scoreboard();
					}
					else {
						System.out.println("The referree keeps his flag down. " + GeneratePlayer.rosterDisplay[3][0] + " is onsides");
						delay();
						
						if (GeneratePlayer.Roster.get(7).getPassing() < (Math.random()*90)+10){
							System.out.println("The ball is passed right into the defense. The enemy is on a fast break");
							delay();
							scoreboard();
						}
						else if (GeneratePlayer.Roster.get(7).getPassing() < (Math.random()*60)+40){
							System.out.println("The pass is from " + GeneratePlayer.rosterDisplay[2][1] + " is too far and the goalie collects it");
							delay();
							scoreboard();
						}
						else if (GeneratePlayer.Roster.get(7).getPassing() < (Math.random()*40)+60){
							System.out.println("The ball is just past " + GeneratePlayer.rosterDisplay[3][0] + " and goes out of play");
							delay();
							scoreboard();
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
								scoreboard();
							}
							else if (GeneratePlayer.Roster.get(9).getShooting() < (Math.random()*60)+40){
								System.out.println("The ball flies towards the net...");
								delay();
								System.out.println("The goalkeeper makes a save to keep the ball out");
								scoreboard();
							}
							else if (GeneratePlayer.Roster.get(9).getShooting() < (Math.random()*40)+60){
								System.out.println("The ball flies towards the net...");
								delay();
								System.out.println("The ball smacks against the post. No goal");
								scoreboard();
							}
							else {
								System.out.println("The ball flies towards the net...");
								delay();
								System.out.println("GOOOOOOOAL! " + GeneratePlayer.rosterDisplay[3][0] + " has scored a goal for " + GenerateSchedule.team.get(GeneratePlayer.teamNumber-1).getClubInitials());
								delay();
								userPoints++;
								scoreboard();
							}
						}
					}
					break;
				case 7:
					//corner
					System.out.println(GenerateSchedule.team.get(GeneratePlayer.teamNumber-1).getClubInitials() + " has been awarded a corner kick");
					delay();
					System.out.println(GeneratePlayer.rosterDisplay[1][1] + " steps up to take it");
					delay();
					System.out.println("He whips it into the box hopping to find someone in the box");
					delay();
					if (GeneratePlayer.Roster.get(5).getPassing() < (Math.random()*90)+10){
						System.out.println("The ball flies over the box and out the other end. Turnover.");
						delay();
						scoreboard();
					}
					else if (GeneratePlayer.Roster.get(5).getPassing() < (Math.random()*60)+40){
						System.out.println("The kick is straight to the goalkeeper");
						delay();
						System.out.println("He plucks the ball out of the air to keep the ball out");
						scoreboard();
					}
					else if (GeneratePlayer.Roster.get(5).getPassing() < (Math.random()*20)+80){
						System.out.println("The ball flies towards an empty space in the box");
						delay();
						
						if (GeneratePlayer.Roster.get(9).getPhysical() < (Math.random()*40)+60){
							System.out.println("The ball goes over the head of " + GeneratePlayer.rosterDisplay[3][0]);
							delay();
							System.out.println("The ball falls to a defenders feet who clears it");
							scoreboard();
						}
						else if (GeneratePlayer.Roster.get(9).getPhysical() < (Math.random()*60)+40){
							System.out.println(GeneratePlayer.rosterDisplay[3][0] + " attempts to get on to the end of it");
							delay();
							System.out.println("He successfully gets a head on it...");
							delay();
							System.out.println("But the ball flies over the net");
							delay();
							scoreboard();
						}
						else if (GeneratePlayer.Roster.get(9).getPhysical() < (Math.random()*80)+20){
							System.out.println(GeneratePlayer.rosterDisplay[3][0] + " attempts to get on to the end of it");
							delay();
							System.out.println("He successfully gets a head on it...");
							delay();
							System.out.println("The ball smacks against the post and is cleared by the defense");
							delay();
							scoreboard();
						}
						else {
							System.out.println(GeneratePlayer.rosterDisplay[3][0] + " attempts to get on to the end of it");
							delay();
							System.out.println("He successfully gets a head on it...");
							delay();
							System.out.println("GOOOOOOOAL! The ball gets past the keeper for a goal");
							delay();
							userPoints++;
							scoreboard();
						}
					}
					else {
						System.out.println("The ball is flying right towards " + GeneratePlayer.rosterDisplay[3][0]);
						delay();
						if (GeneratePlayer.Roster.get(9).getPhysical() < (Math.random()*90)+10){
							System.out.println(GeneratePlayer.rosterDisplay[3][0] + " gets a head on it!");
							delay();
							System.out.println("The ball flies over the post and out for a turnover");
							scoreboard();
						}
						else if (GeneratePlayer.Roster.get(9).getPhysical() < (Math.random()*40)+60){
							System.out.println(GeneratePlayer.rosterDisplay[3][0] + " gets a head on it!");
							delay();
							System.out.println("He sends it towards goal...");
							delay();
							System.out.println("The keeper makes a spectacular safe to keep the ball out of the net! No goal!");
							delay();
							scoreboard();
						}
						else if (GeneratePlayer.Roster.get(9).getPhysical() < (Math.random()*60)+40){
							System.out.println(GeneratePlayer.rosterDisplay[3][0] + " gets a head on it!");
							delay();
							System.out.println("He sends it towards goal...");
							delay();
							System.out.println("The ball smacks against the post and is cleared by the defense");
							delay();
							scoreboard();
						}
						else {
							System.out.println(GeneratePlayer.rosterDisplay[3][0] + " gets a head on it!");
							delay();
							System.out.println("He sends it towards goal...");
							delay();
							System.out.println("GOOOOOOOAL! The ball gets past the keeper for a goal");
							delay();
							userPoints++;
							scoreboard();
						}
					}
					break;
			}
			}
		else {
			//enemy chance
			System.out.println("A chance for " + enemyTeamNameFull);
			switch((int)(Math.random()*7)+1){
			//for (int x = 0; x < (int)(Math.random()*0)+0; x++){
				case 1:
					//user striker shot outside the box
					System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerOne() + " is dribbling outside the box");
					delay();
					System.out.println("It looks as if he is making a move to shoot!");
					delay();
					System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerOne() + " shoots.......");
					delay();
					if (GeneratePlayer.Roster.get(9).getShooting() < (Math.random()*90)+10){
						System.out.println("Oh deary me! The ball flies over the net and into the stands!");
						delay();
						System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerOne() + " will have to do much better than that if he wants to score!");
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
						System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerOne() + " with an almost incredible goal from outside the box!");
						delay();
						scoreboard();
					}
					else {
						System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerOne() + " scores! what a goal!");
						enemyPoints++;
						delay();
						scoreboard();
					}
					break;
				case 2:
					//dribble to the corner and cross
					System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerOne() + " is making a run towards the right corner");
					delay();
					System.out.println("He's taking on the defender 1 on 1");
					delay();
					if (GeneratePlayer.Roster.get(8).getDribbling() < (Math.random()*90)+10){
						System.out.println("The defender runs up and shoves " + GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerOne() + " to the ground!");
						delay();
						System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerOne() + " loses the ball and turns the ball over");
						delay();
						scoreboard();
					}
					else if (GeneratePlayer.Roster.get(8).getDribbling() < (Math.random()*60)+40){
						System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerOne() + " attempts to get around the defender with a step over move");
						delay();
						System.out.println("He almost got around him but the ball is taken by the defender");
						delay();
						scoreboard();
					}
					else if (GeneratePlayer.Roster.get(8).getDribbling() < (Math.random()*40)+60){
						System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerOne() + " attempts to get around the defender with a step over move");
						delay();
						System.out.println("What an incredible slide tackle. An amazing steal from the defender.");
						delay();
						scoreboard();
					}
					else {
						System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerOne() + "attempts to get around the defender with a step over move");
						delay();
						System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerOne() + " successfully gets past the defender with that move");
						delay();
						System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerOne() + " is looking to cross the ball into the box for a chance to score");
						
						if (GeneratePlayer.Roster.get(9).getPhysical() < (Math.random()*90)+10){
							System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerOne() + " crosses the ball into the box");
							delay();
							System.out.println("The ball flies over the box and goes out of bounds on the other side");
							delay();
							scoreboard();
						}
						else if (GeneratePlayer.Roster.get(9).getPhysical() < (Math.random()*60)+40){
							System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerOne() + " crosses the ball into the box");
							delay();
							System.out.println("The ball falls into the box but nobody is there to head it");
							delay();
							System.out.println("The ball is cleared to the other side of the field");
							delay();
							scoreboard();
						}
						else if (GeneratePlayer.Roster.get(9).getPhysical() < (Math.random()*40)+60){
							System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerOne() + " crosses the ball into the box");
							delay();
							System.out.println("The ball finds " + GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerTwo() + "'s head!");
							delay();
							System.out.println("The ball is shot over the crossbar and out of play. What a goal that would have been!");
							delay();
							scoreboard();
						}
						else {
							System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerOne() + " crosses the ball into the box");
							delay();
							System.out.println("The ball finds " + GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerTwo() + "'s head!");
							delay();
							System.out.println("The ball finds the back of the net for a goal!");
							delay();
							enemyPoints++;
							scoreboard();
						}
					}
					break;
				case 3:
					//free kick
					System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerOne() + " is making a run past the defender");
					delay();
					System.out.println("OH! He is tripped up and fouled");
					delay();
					System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerOne() + " steps up to take the shot");
					delay();
					System.out.println(enemyTeamName + " will have a free kick on the edge of the box");
					delay();
					System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerOne() + " shoots...");
					if (GeneratePlayer.Roster.get(7).getShooting() < (Math.random()*90)+10){
						System.out.println("The ball flies right into the player wall. No goal.");
						delay();
						scoreboard();
					}
					else if (GeneratePlayer.Roster.get(7).getShooting() < (Math.random()*60)+40){
						System.out.println("The ball flies over the net. No goal.");
						delay();
						scoreboard();
					}
					else if (GeneratePlayer.Roster.get(7).getShooting() < (Math.random()*40)+60){
						System.out.println("The ball flies right at the goalkeeper");
						delay();
						System.out.println("He makes the safe. No goal");
						delay();
						scoreboard();
					}
					else if (GeneratePlayer.Roster.get(7).getShooting() < (Math.random()*40)+60){
						System.out.println("The ball flies. IT LOOKS AS IF ITS HEADED TOWARDS THE TOP CORNER!");
						delay();
						System.out.println("The ball smacks against the post. No goal");
						delay();
						System.out.println("What a goal that would have been");
						delay();
						scoreboard();
					}
					else {
						System.out.println("The ball flies. IT LOOKS AS IF ITS HEADED TOWARDS THE TOP CORNER!");
						delay();
						System.out.println("GOOOOOAL!!!!!");
						delay();
						System.out.println("The ball creeps into the top corner and finds the back of the net.");
						delay();
						enemyPoints++;
						scoreboard();
					}
					break;
				case 4:
					//penalty
					System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerOne() + " gets the ball and makes a run into the box.");
					delay();
					System.out.println("OH! He is tripped up and fouled");
					delay();
					System.out.println("The referee whistles for a penalty");
					delay();
					System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getClubInitials() + " will have a chance to score from the penalty area");
					delay();
					System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerOne() + " steps up towards the ball and looks the goalie dead in the eye");
					delay();
					System.out.println("He starts his run up and shoots...");
					delay();
					if (GeneratePlayer.Roster.get(9).getShooting() < (Math.random()*90)+10){
						System.out.println("The ball flies over the net, into the stands!");
						delay();
						System.out.println("The pressure must have gotten to " + GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerOne() + ". No goal");
						delay();
						scoreboard();
					}
					else if (GeneratePlayer.Roster.get(9).getShooting() < (Math.random()*90)+10){
						System.out.println("The ball starts flying towards a corner!");
						delay();
						System.out.println("It hits the post and bounces away! No goal!");
						delay();
						scoreboard();
					}
					else if (GeneratePlayer.Roster.get(9).getShooting() < (Math.random()*90)+10){
						System.out.println("The ball starts flying towards a corner!");
						delay();
						System.out.println("The goalie dives and makes an incredible goal to keep the ball out! What a save!");
						delay();
						scoreboard();
					}
					else {
						System.out.println("The ball starts flying towards a corner!");
						delay();
						System.out.println("GOOOOOAL! The ball finds the back of the net to give " + enemyTeamName + " a goal");
						delay();
						enemyPoints++;
						scoreboard();
					}
					break;
				case 5:
					//pass, shoot outside box
					System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerOne() + " dribbles the ball towards the opposition");
					delay();
					System.out.println("He picks out " + GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerTwo() + " and passes the ball");
					delay();
					if (GeneratePlayer.Roster.get(4).getPassing() < (Math.random()*90)+10){
						System.out.println("The ball flies over the head of " + GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerTwo() + " and goes out of play");
						delay();
						scoreboard();
					}
					else if (GeneratePlayer.Roster.get(4).getPassing() < (Math.random()*60)+40){
						System.out.println("The ball flies right into the path of a " + enemyTeamName + " player's path");
						delay();
						System.out.println("The ball is turned over");
						scoreboard();
					}
					else {
						System.out.println("The pass is completed successfully to " + GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerTwo());
						delay();
						System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerTwo() + " gains possession and turns towards the goal");
						delay();
						System.out.println("He goes to shoot...");
						if (GeneratePlayer.Roster.get(6).getShooting() < (Math.random()*90)+10){
							System.out.println("The ball flies over the net and into the stands. No goal");
							delay();
							scoreboard();
						}
						else if (GeneratePlayer.Roster.get(6).getShooting() < (Math.random()*60)+40){
							System.out.println("The goalie makes a save and brings the ball to his chest. No goal.");
							delay();
							scoreboard();
						}
						else if (GeneratePlayer.Roster.get(6).getShooting() < (Math.random()*40)+60){
							System.out.println("The ball smacks against the post. No goal.");
							delay();
							scoreboard();
						}
						else {
							System.out.println("GOOOOOAL!!!!!");
							delay();
							System.out.println("The ball zoomed past the keeper and finds the back of the net!");
							delay();
							enemyPoints++;
							scoreboard();
						}
					}
					break;
				case 6:
					//through ball
					System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerOne() + " has the ball at midfield");
					delay();
					System.out.println("The enemy players are closing in");
					delay();
					System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerTwo() + " is making run past the defenders");
					delay();
					System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerOne() + " passes the ball through the defense...");
					delay();
					if (GeneratePlayer.Roster.get(9).getPace() < (Math.random()*50)+50){
						System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerTwo() + " is offsides, the ball is turned over");
						delay();
						scoreboard();
					}
					else {
						System.out.println("The referree keeps his flag down. " + GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerTwo() + " is onsides");
						delay();
						
						if (GeneratePlayer.Roster.get(7).getPassing() < (Math.random()*90)+10){
							System.out.println("The ball is passed right into the defense. The enemy is on a fast break");
							delay();
							scoreboard();
						}
						else if (GeneratePlayer.Roster.get(7).getPassing() < (Math.random()*60)+40){
							System.out.println("The pass is from " + GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerOne() + " is too far and the goalie collects it");
							delay();
							scoreboard();
						}
						else if (GeneratePlayer.Roster.get(7).getPassing() < (Math.random()*40)+60){
							System.out.println("The ball is just past " + GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerTwo() + " and goes out of play");
							delay();
							scoreboard();
						}
						else {
							System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerOne() + " gives a perfect pass down through the center");
							delay();
							System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerTwo() + " collects the ball and turns towards goal");
							delay();
							System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerTwo() + " shoots...");
							
							if (GeneratePlayer.Roster.get(9).getShooting() < (Math.random()*90)+10){
								System.out.println("The ball flies over the net into the stands. No goal");
								delay();
								scoreboard();
							}
							else if (GeneratePlayer.Roster.get(9).getShooting() < (Math.random()*60)+40){
								System.out.println("The ball flies towards the net...");
								delay();
								System.out.println("The goalkeeper makes a save to keep the ball out");
								scoreboard();
							}
							else if (GeneratePlayer.Roster.get(9).getShooting() < (Math.random()*40)+60){
								System.out.println("The ball flies towards the net...");
								delay();
								System.out.println("The ball smacks against the post. No goal");
								scoreboard();
							}
							else {
								System.out.println("The ball flies towards the net...");
								delay();
								System.out.println("GOOOOOOOAL! " + GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerTwo() + " has scored a goal for " + enemyTeamName);
								delay();
								enemyPoints++;
								scoreboard();
							}
						}
					}
					break;
				case 7:
					//corner
					System.out.println(enemyTeamName + " has been awarded a corner kick");
					delay();
					System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerOne() + " steps up to take it");
					delay();
					System.out.println("He whips it into the box hopping to find someone in the box");
					delay();
					if (GeneratePlayer.Roster.get(5).getPassing() < (Math.random()*90)+10){
						System.out.println("The ball flies over the box and out the other end. Turnover.");
						delay();
						scoreboard();
					}
					else if (GeneratePlayer.Roster.get(5).getPassing() < (Math.random()*60)+40){
						System.out.println("The kick is straight to the goalkeeper");
						delay();
						System.out.println("He plucks the ball out of the air to keep the ball out");
						scoreboard();
					}
					else if (GeneratePlayer.Roster.get(5).getPassing() < (Math.random()*20)+80){
						System.out.println("The ball flies towards an empty space in the box");
						delay();
						
						if (GeneratePlayer.Roster.get(9).getPhysical() < (Math.random()*40)+60){
							System.out.println("The ball goes over the head of " + GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerTwo());
							delay();
							System.out.println("The ball falls to a defenders feet who clears it");
							scoreboard();
						}
						else if (GeneratePlayer.Roster.get(9).getPhysical() < (Math.random()*60)+40){
							System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerTwo() + " attempts to get on to the end of it");
							delay();
							System.out.println("He successfully gets a head on it...");
							delay();
							System.out.println("But the ball flies over the net");
							delay();
							scoreboard();
						}
						else if (GeneratePlayer.Roster.get(9).getPhysical() < (Math.random()*80)+20){
							System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerTwo() + " attempts to get on to the end of it");
							delay();
							System.out.println("He successfully gets a head on it...");
							delay();
							System.out.println("The ball smacks against the post and is cleared by the defense");
							delay();
							scoreboard();
						}
						else {
							System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerTwo() + " attempts to get on to the end of it");
							delay();
							System.out.println("He successfully gets a head on it...");
							delay();
							System.out.println("GOOOOOOOAL! The ball gets past the keeper for a goal");
							delay();
							enemyPoints++;
							scoreboard();
						}
					}
					else {
						System.out.println("The ball is flying right towards " + GenerateSchedule.team.get(GeneratePlayer.teamNumber-1).getStarPlayerTwo());
						delay();
						if (GeneratePlayer.Roster.get(9).getPhysical() < (Math.random()*90)+10){
							System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerTwo() + " gets a head on it!");
							delay();
							System.out.println("The ball flies over the post and out for a turnover");
							scoreboard();
						}
						else if (GeneratePlayer.Roster.get(9).getPhysical() < (Math.random()*40)+60){
							System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerTwo() + " gets a head on it!");
							delay();
							System.out.println("He sends it towards goal...");
							delay();
							System.out.println("The keeper makes a spectacular safe to keep the ball out of the net! No goal!");
							delay();
							scoreboard();
						}
						else if (GeneratePlayer.Roster.get(9).getPhysical() < (Math.random()*60)+40){
							System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerTwo() + " gets a head on it!");
							delay();
							System.out.println("He sends it towards goal...");
							delay();
							System.out.println("The ball smacks against the post and is cleared by the defense");
							delay();
							scoreboard();
						}
						else {
							System.out.println(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getStarPlayerTwo() + " gets a head on it!");
							delay();
							System.out.println("He sends it towards goal...");
							delay();
							System.out.println("GOOOOOOOAL! The ball gets past the keeper for a goal");
							delay();
							enemyPoints++;
							scoreboard();
						}
					}
					break;
			}
			}
				}
			if (counter == 1){
				System.out.println("The referree whistles for the end of the first half");
				delay();
				scoreboard();
				delay();
				System.out.println("And the second half gets underway!");
				counter++;
				}
				else {
					System.out.println("The referree whistles for the end of the game");
					delay();
					System.out.println("The game ends as follows:");
					scoreboard();
					if(userPoints > enemyPoints){
						System.out.println(GeneratePlayer.userTeamName + " is victorious today taking down " + enemyTeamNameFull);
						GenerateSchedule.team.get(GeneratePlayer.teamNumber-1).setPoints(GenerateSchedule.team.get(GeneratePlayer.teamNumber-1).getPoints()+3);
					}
					else if (userPoints == enemyPoints){
						System.out.println("The game ended in a draw between " + GeneratePlayer.userTeamName + " and " + enemyTeamNameFull);
						GenerateSchedule.team.get(GeneratePlayer.teamNumber-1).setPoints(GenerateSchedule.team.get(GeneratePlayer.teamNumber-1).getPoints()+1);
						GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).setPoints(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getPoints()+1);
					}
					else {
						System.out.println(enemyTeamNameFull + " ended up victorious taking down " + GeneratePlayer.userTeamName);
						GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).setPoints(GenerateSchedule.team.get(LeagueGameStart.opponentNumberCounter).getPoints()+3);
					}
					userPoints = 0;
			        enemyPoints = 0;
					OtherGameSimultor.runner();
					}
		}
		}
			
			//}
		
		public static void scoreboard(){
			System.out.println();
			System.out.println("-----------------------------------------");
			System.out.print("|        ");
			System.out.printf("%-11s", GenerateSchedule.team.get(GeneratePlayer.teamNumber-1).getClubInitials());
			System.out.print("|        ");
			System.out.printf("%-11s", enemyTeamName);
	        System.out.println("|");
	        System.out.println("|         " + userPoints + "         |         " + enemyPoints + "         |");
	        System.out.println("-----------------------------------------");
	        System.out.println();
		}
		
		public static void delay()
			{
					try {
						Thread.sleep(1500);
					} catch (InterruptedException e) {
					}
			}
		public static void longDelay()
		{
        try
				{
				Thread.sleep(3000);
				} catch (InterruptedException e) {
				}
		}

	}
