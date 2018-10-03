
public class LeagueGameStart
	{
		static int enemyTeam;
		static int opponentNumberCounter = 0;
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
			int gamesPlayed = 0;
			boolean hasDoneAdder = false;
			int adder = 0;
			if (gamesPlayed == 3){
				playoffGame();
			}
			else if (GenerateSchedule.team.get(opponentNumberCounter).isPlayer() == true){
				opponentNumberCounter++;
				gameRunner();
			}
			else if (hasDoneAdder == false) {
				switch (GenerateSchedule.team.get((GeneratePlayer.teamNumber)-1).getGroup()){
					case "A":
						break;
					case "B":
						adder = 4;
						break;
					case "C":
						adder = 8;
						break;
					case "D":
						adder = 12;
						break;
					case "E":
						adder = 16;
						break;
					case "F":
						adder = 20;
						break;
					case "G":
						adder = 24;
						break;
					case "H":
						adder = 28;
						break;
				}
				opponentNumberCounter = opponentNumberCounter + adder;
				
			}
			gamesPlayed++;
			Game.intro();
		}
		private static void playoffGame(){
			
		}

	}
