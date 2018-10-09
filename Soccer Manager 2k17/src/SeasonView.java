import java.util.Scanner;
//a
public class SeasonView
	{
		static int numberOfGamesPlayed = 0;
		static String[] results = {" "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "," "};
		public static void main(String[] args)
			{
				GenerateSchedule.generateTeams();
			}
		public static void runner(){
			
			menu();
		}
		public static void menu(){
			Scanner userInput = new Scanner(System.in);
			System.out.println();
			System.out.println("What do you want to do?");
			if (LeagueGameStart.gamesPlayed == 3) {
			System.out.println("1) ADVANCE TO NEXT ROUND");
			}
			else {
			System.out.println("1) NEXT GAME");
			}
			System.out.println("2) ROSTER");
			System.out.println("3) STANDINGS");
			int userAnswer = userInput.nextInt();
			switch(userAnswer){
				case 1:
					nextGame();
					break;
				case 2:
					roster();
					break;
				case 3:
					standings();
					break;
			}
			
		}
		public static void nextGame(){
			//LeagueGameStart.otherTeamPoints();
			LeagueGameStart.gameRunner();
		}
		public static void roster(){
			int counter = 0;
			for (int i = 0; i < 4; i++){
				for (int j = 0; j < GeneratePlayer.rosterDisplay[i].length; j++){
					GeneratePlayer.rosterDisplay[i][j] = GeneratePlayer.Roster.get(counter).getLastName();
					counter++;
				}
			} 
			System.out.println();
			System.out.println("                              "+GeneratePlayer.userTeamName);
			System.out.println(" ____________________________________________________________ ");
			System.out.println("|                         |          |                       |");
			System.out.println("|                                                            |");
			System.out.println("|                                                            |");
			System.out.println("|                            ______                          |");
			System.out.println("|                           |      |                         |");
			System.out.println("|                           |  9   |                         |");
			System.out.println("|                           |______|                         |");
			System.out.print("|                            ");
			System.out.printf("%-10s", GeneratePlayer.rosterDisplay[3][0]);
			System.out.println("                      |");
			System.out.println("|                                                            |");
			System.out.println("|    ______                  ______               ______     |");
			System.out.println("|   |      |                |      |             |      |    |");
			System.out.println("|   |  11  |                |  8   |             |  10  |    |");
			System.out.println("|   |______|                |______|             |______|    |");
			System.out.print("|   ");
			System.out.printf("%-10s", GeneratePlayer.rosterDisplay[2][0]);
			System.out.print("              ");
			System.out.printf("%-10s", GeneratePlayer.rosterDisplay[2][1]);
			System.out.print("           ");
			System.out.printf("%-10s", GeneratePlayer.rosterDisplay[2][2]);
			System.out.println("  |");
			System.out.println("|                                                            |");
			System.out.println("|                                                            |");
			System.out.println("|                                                            |");
			System.out.println("|                ______                 ______               |");
			System.out.println("|               |      |               |      |              |");
			System.out.println("|               |  7   |               |  6   |              |");
			System.out.println("|               |______|               |______|              |");
			System.out.print("|                ");
			System.out.printf("%-10s", GeneratePlayer.rosterDisplay[1][0]);
			System.out.print("             ");
			System.out.printf("%-10s", GeneratePlayer.rosterDisplay[1][1]);
			System.out.println("           |");
			System.out.println("|                                                            |");
			System.out.println("|                                                            |");
			System.out.println("|                                                            |");
			System.out.println("|                                                            |");
			System.out.println("|      ______        ______         ______        ______     |");
			System.out.println("|     |      |      |      |       |      |      |      |    |");
			System.out.println("|     |  5   |      |  4   |       |  3   |      |  2   |    |");
			System.out.println("|     |______|      |______|       |______|      |______|    |");
			System.out.print("|      ");
			System.out.printf("%-10s", GeneratePlayer.rosterDisplay[0][0]);
			System.out.print("    ");
			System.out.printf("%-10s", GeneratePlayer.rosterDisplay[0][1]);
			System.out.print("     ");
			System.out.printf("%-10s", GeneratePlayer.rosterDisplay[0][2]);
			System.out.print("    ");
			System.out.printf("%-10s", GeneratePlayer.rosterDisplay[0][3]);
			System.out.println(" |");
			System.out.println("|                                                            |");
			System.out.println("|                            ______                          |");
			System.out.println("|                           |      |                         |");
			System.out.println("|                           |  GK  |                         |");
			System.out.println("|                           |______|                         |");
			System.out.println("|                                                            |");
			System.out.println("|_________________________|__________|_______________________|");
			System.out.println();
			System.out.println("STATISTICAL VIEW");
			System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", "POSITION", "FIRST NAME", "LAST NAME", "OVERALL", "PACE", "SHOOTING", "PASSING", "PASSING", "DRIBBLING", "DEFENDING", "PHYSICAL");
			for(TeamPlayer player: GeneratePlayer.Roster){
				String position = "";
				if (player.getPosition() == 1){
					position = "LB";
				}
				else if (player.getPosition() == 2){
					position = "CB";
				}
				else if (player.getPosition() == 3){
					position = "CB";
				}
				else if (player.getPosition() == 4){
					position = "RB";
				}
				else if (player.getPosition() == 5){
					position = "CDM";
				}
				else if (player.getPosition() == 6){
					position = "CDM";
				}
				else if (player.getPosition() == 7){
					position = "LAM";
				}
				else if (player.getPosition() == 8){
					position = "CAM";
				}
				else if (player.getPosition() == 9){
					position = "RAM";
				}
				else if (player.getPosition() == 10){
					position = "ST";
				}
				GeneratePlayer.teamOverall = GeneratePlayer.teamOverall + player.getOverall();
				System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", position, player.getFirstName(), player.getLastName(), player.getOverall(), player.getPace(), player.getShooting(), player.getPassing(), player.getDribbling(), player.getDefending(), player.getPhysical());
			}
			menu();
				}
		public static void standings(){
			int counter = 0;
			for (int i = 0; i < 8; i++) {
			System.out.println("                             GROUP " + (i+1) +"                                 ");
			System.out.println("|----------------------------------------------------------------------|");
			for (int x = 0; x < 4; x++) {
				System.out.print("|  ");
				System.out.printf("%-3s", (x+1));
				System.out.print("| ");
				System.out.printf("%-54s", GenerateSchedule.team.get(counter).getClubName());
				System.out.print("|   ");
				System.out.printf("%-5s", GenerateSchedule.team.get(counter).getPoints());
				System.out.println("|");
				System.out.println("|----------------------------------------------------------------------|");
				counter++;
			}
			System.out.println();
			}
			menu();
		}
		public static void leagueCupStandings(){
			System.out.println("                         LEAGUE CUP STANDINGS                          ");
			System.out.println("");
			menu();
		}
		public static void europaCupStandings(){
			System.out.println("                         EUROPA CUP STANDINGS                          ");
			menu();
		}

	}
