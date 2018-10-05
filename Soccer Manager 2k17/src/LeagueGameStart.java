
public class LeagueGameStart
	{
		static int opponentNumberCounter = 0;
		static int gamesPlayed = 0;
		static boolean hasDoneAdder = false;
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
			int adder = 0;
			if (gamesPlayed == 3){
				playoffGame();
			}
			if (hasDoneAdder == false) {
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
				hasDoneAdder = true;
				gameRunner();
			}
			if (GenerateSchedule.team.get(opponentNumberCounter).isPlayer() == true){
				opponentNumberCounter++;
			}
			gamesPlayed++;
			Game.intro();
		}
		private static void playoffGame(){
			System.out.println("YEET");
		}

	}
