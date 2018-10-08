//a
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
			if (gamesPlayed > 2){
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
			}
			
			if (GeneratePlayer.teamNumber % 4 == 1) {
					opponentNumberCounter++;
			}
			else if (GeneratePlayer.teamNumber % 4 == 2) {
				switch (gamesPlayed) {
				case 0:
					break;
				case 1:
					opponentNumberCounter = opponentNumberCounter + 3;
					break;
				case 2:
					opponentNumberCounter = opponentNumberCounter - 1;
					break;
				}
			}
			else if (GeneratePlayer.teamNumber % 4 == 3) {
				switch (gamesPlayed) {
				case 0:
					opponentNumberCounter = opponentNumberCounter + 3;
					break;
				case 1:
					opponentNumberCounter = opponentNumberCounter - 3;
					break;
				case 2:
					opponentNumberCounter = opponentNumberCounter + 1;
					break;
				}
			}
			else {
				switch (gamesPlayed) {
				case 0:
					System.out.println("Check");
					opponentNumberCounter = opponentNumberCounter + 2;
					break;
				case 1:
					System.out.println("Check");
					opponentNumberCounter = opponentNumberCounter - 1;
					break;
				case 2:
					System.out.println("Check");
					opponentNumberCounter = opponentNumberCounter - 1;
					break;
				}
			}
			gamesPlayed++;
			Game.intro();
		}
		private static void playoffGame(){
			OtherGameSimultor.endOfGroupStage();
		}

	}
		//1-234
		//2-143
		//3-412
		//4-321