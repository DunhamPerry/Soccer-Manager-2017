import java.util.Scanner;

public class SeasonView
	{

		public static void main(String[] args)
			{
				menu();
			}
		public static void runner(){
			System.out.println("Welcome " + GeneratePlayer.name + " to your first season in charge of " + GeneratePlayer.teamName);
			System.out.println("There are three competitions to compete for this season");
			System.out.println("The League Competition is where every team in a league plays each other twice and gains 3 points for a win, 1 for a draw, and none for a loss");
			System.out.println("The team with the most points at the end of the season is crowned Champions and gets a large parade");
			System.out.println("There is also the Football League Cup which is a tournament with other teams in your league");
			System.out.println("You advance by winning games and the last team standing is crowned Champions and gets a large parade");
			System.out.println("The final competition is the Europa Cup, a tournament competition against the best teams on the continent");
			System.out.println("You can probably guess by now that the winner gets a parade");
			menu();
		}
		public static void menu(){
			Scanner userInput = new Scanner(System.in);
			System.out.println();
			System.out.println("What do you want to do?");
			System.out.println("1) Simulate to the next game");
			System.out.println("2) Look at your roster");
			System.out.println("3) Look at the League Table");
			System.out.println("4) Look at the League Cup Standings");
			System.out.println("5) Look at the Europa Cup Standings");
			int userAnswer = userInput.nextInt();
			switch(userAnswer){
				case 1:
					nextGame();
					break;
				case 2:
					roster();
					break;
				case 3:
					leagueTable();
					break;
				case 4:
					leagueCupStandings();
					break;
				case 5:
					europaCupStandings();
					break;
			}
			
		}
		public static void nextGame(){
			
			menu();
		}
		public static void roster(){
			int counter = 0;
			for (int i = 0; i < 4; i++){
				for (int j = 0; j < GeneratePlayer.rosterDisplay[i].length; j++){
					GeneratePlayer.rosterDisplay[i][j] = GeneratePlayer.Roster.get(counter).getLastName();
					counter++;
				}
			} 
			
			counter = 0;
			for (int i = 0; i < 4; i++){
				for (int j = 0; j < GeneratePlayer.rosterOverall[i].length; j++){
					GeneratePlayer.rosterOverall[i][j] = GeneratePlayer.Roster.get(counter).getOverall();
					counter++;
			
			String spacesLB = "";
			switch (GeneratePlayer.rosterDisplay[i][j].length()){
				case 2:
					spacesLB = "                   ";
					break;
				case 3:
					spacesLB = "                  ";
					break;
				case 4:
					spacesLB = "                 ";
					break;
				case 5:
					spacesLB = "                ";
					break;
				case 6:
					spacesLB = "               ";
					break;
				case 7:
					spacesLB = "              ";
					break;
				case 8:
					spacesLB = "             ";
					break;
				case 9:
					spacesLB = "            ";
					break;
				case 10:
					spacesLB = "           ";
					break;
				case 11:
					spacesLB = "          ";
					break;
				case 12:
					spacesLB = "         ";
					break;
			}
			String spacesCB = "";
			switch (GeneratePlayer.rosterDisplay[i][j].length()){
			case 2:
				spacesCB = "                   ";
				break;
			case 3:
				spacesCB = "                  ";
				break;
			case 4:
				spacesCB = "                 ";
				break;
			case 5:
				spacesCB = "                ";
				break;
			case 6:
				spacesCB = "               ";
				break;
			case 7:
				spacesCB = "              ";
				break;
			case 8:
				spacesCB = "             ";
				break;
			case 9:
				spacesCB = "            ";
				break;
			case 10:
				spacesCB = "           ";
				break;
			case 11:
				spacesCB = "          ";
				break;
			case 12:
				spacesCB = "         ";
				break;
		}
			String spacesCBB = "";
			switch (GeneratePlayer.rosterDisplay[i][j].length()){
			case 2:
				spacesCBB = "                   ";
				break;
			case 3:
				spacesCBB = "                  ";
				break;
			case 4:
				spacesCBB = "                 ";
				break;
			case 5:
				spacesCBB = "                ";
				break;
			case 6:
				spacesCBB = "               ";
				break;
			case 7:
				spacesCBB = "              ";
				break;
			case 8:
				spacesCBB = "             ";
				break;
			case 9:
				spacesCBB = "            ";
				break;
			case 10:
				spacesCBB = "           ";
				break;
			case 11:
				spacesCBB = "          ";
				break;
			case 12:
				spacesCBB = "         ";
				break;
		}
			String spacesRB = "";
			switch (GeneratePlayer.rosterDisplay[i][j].length()){
			case 2:
				spacesRB = "                   ";
				break;
			case 3:
				spacesRB = "                  ";
				break;
			case 4:
				spacesRB = "                 ";
				break;
			case 5:
				spacesRB = "                ";
				break;
			case 6:
				spacesRB = "               ";
				break;
			case 7:
				spacesRB = "              ";
				break;
			case 8:
				spacesRB = "             ";
				break;
			case 9:
				spacesRB = "            ";
				break;
			case 10:
				spacesRB = "           ";
				break;
			case 11:
				spacesRB = "          ";
				break;
			case 12:
				spacesRB = "         ";
				break;
		}
			String spacesCDM = "";
			switch (GeneratePlayer.rosterDisplay[i][j].length()){
			case 2:
				spacesCDM = "                            ";
				break;
			case 3:
				spacesCDM = "                           ";
				break;
			case 4:
				spacesCDM = "                          ";
				break;
			case 5:
				spacesCDM = "                         ";
				break;
			case 6:
				spacesCDM = "                        ";
				break;
			case 7:
				spacesCDM = "                       ";
				break;
			case 8:
				spacesCDM = "                      ";
				break;
			case 9:
				spacesCDM = "                     ";
				break;
			case 10:
				spacesCDM = "                    ";
				break;
			case 11:
				spacesCDM = "                   ";
				break;
			case 12:
				spacesCDM = "                  ";
				break;
		}
			String spacesCDMM = "";
			switch (GeneratePlayer.rosterDisplay[i][j].length()){
			case 2:
				spacesCDMM = "                            ";
				break;
			case 3:
				spacesCDMM = "                           ";
				break;
			case 4:
				spacesCDMM = "                          ";
				break;
			case 5:
				spacesCDMM = "                         ";
				break;
			case 6:
				spacesCDMM = "                        ";
				break;
			case 7:
				spacesCDMM = "                       ";
				break;
			case 8:
				spacesCDMM = "                      ";
				break;
			case 9:
				spacesCDMM = "                     ";
				break;
			case 10:
				spacesCDMM = "                    ";
				break;
			case 11:
				spacesCDMM = "                   ";
				break;
			case 12:
				spacesCDMM = "                  ";
				break;
		}
			String spacesRAM = "";
			switch (GeneratePlayer.rosterDisplay[i][j].length()){
			case 2:
				spacesRAM = "                            ";
				break;
			case 3:
				spacesRAM = "                           ";
				break;
			case 4:
				spacesRAM = "                          ";
				break;
			case 5:
				spacesRAM = "                         ";
				break;
			case 6:
				spacesRAM = "                        ";
				break;
			case 7:
				spacesRAM = "                       ";
				break;
			case 8:
				spacesRAM = "                      ";
				break;
			case 9:
				spacesRAM = "                     ";
				break;
			case 10:
				spacesRAM = "                    ";
				break;
			case 11:
				spacesRAM = "                   ";
				break;
			case 12:
				spacesRAM = "                  ";
				break;
		}
			String spacesCAM = "";
			switch (GeneratePlayer.rosterDisplay[i][j].length()){
			case 2:
				spacesCAM = "                        ";
				break;
			case 3:
				spacesCAM = "                       ";
				break;
			case 4:
				spacesCAM = "                      ";
				break;
			case 5:
				spacesCAM = "                     ";
				break;
			case 6:
				spacesCAM = "                    ";
				break;
			case 7:
				spacesCAM = "                   ";
				break;
			case 8:
				spacesCAM = "                  ";
				break;
			case 9:
				spacesCAM = "                 ";
				break;
			case 10:
				spacesCAM = "                ";
				break;
			case 11:
				spacesCAM = "               ";
				break;
			case 12:
				spacesCAM = "              ";
				break;
		}
			String spacesLAM = "";
			switch (GeneratePlayer.rosterDisplay[i][j].length()){
			case 2:
				spacesLAM = "                           ";
				break;
			case 3:
				spacesLAM = "                          ";
				break;
			case 4:
				spacesLAM = "                         ";
				break;
			case 5:
				spacesLAM = "                        ";
				break;
			case 6:
				spacesLAM = "                       ";
				break;
			case 7:
				spacesLAM = "                      ";
				break;
			case 8:
				spacesLAM = "                     ";
				break;
			case 9:
				spacesLAM = "                    ";
				break;
			case 10:
				spacesLAM = "                   ";
				break;
			case 11:
				spacesLAM = "                  ";
				break;
			case 12:
				spacesLAM = "                 ";
				break;
		}
			String spacesST = "";
			switch (GeneratePlayer.rosterDisplay[i][j].length()){
			case 2:
				spacesST = "              ";
				break;
			case 3:
				spacesST = "             ";
				break;
			case 4:
				spacesST = "            ";
				break;
			case 5:
				spacesST = "           ";
				break;
			case 6:
				spacesST = "          ";
				break;
			case 7:
				spacesST = "         ";
				break;
			case 8:
				spacesST = "        ";
				break;
			case 9:
				spacesST = "       ";
				break;
			case 10:
				spacesST = "      ";
				break;
			case 11:
				spacesST = "     ";
				break;
			case 12:
				spacesST = "    ";
				break;
		}
			
			System.out.println();
			System.out.println("                              "+GeneratePlayer.teamName);
			System.out.println(" ____________________________________________________________ ");
			System.out.println("|                         |          |                       |");
			System.out.println("|                                                            |");
			System.out.println("|                                                            |");
			System.out.println("|                            ______                          |");
			System.out.println("|                           |      |                         |");
			System.out.println("|                           |  "+ GeneratePlayer.rosterOverall[3][0] +"  |                         |");
			System.out.println("|                           |______|                         |");
			System.out.println("|                            " + GeneratePlayer.rosterDisplay[3][0] + spacesST +"                        |");
			System.out.println("|                                                            |");
			System.out.println("|    ______                  ______               ______     |");
			System.out.println("|   |      |                |      |             |      |    |");
			System.out.println("|   |  "+ GeneratePlayer.rosterOverall[2][0] +"  |                |  "+ GeneratePlayer.rosterOverall[2][1] +"  |             |  "+ GeneratePlayer.rosterOverall[2][2] +"  |    |");
			System.out.println("|   |______|                |______|             |______|    |");
			System.out.println("|    "+ GeneratePlayer.rosterDisplay[2][0] + spacesLAM +""+ GeneratePlayer.rosterDisplay[2][1] +spacesCAM+""+GeneratePlayer.rosterDisplay[2][2] +spacesRAM+"     |");
			System.out.println("|                                                            |");
			System.out.println("|                                                            |");
			System.out.println("|                                                            |");
			System.out.println("|                ______                 ______               |");
			System.out.println("|               |      |               |      |              |");
			System.out.println("|               |  "+ GeneratePlayer.rosterOverall[1][0] +"  |               |  "+ GeneratePlayer.rosterOverall[1][1] +"  |              |");
			System.out.println("|               |______|               |______|              |");
			System.out.println("|                "+GeneratePlayer.rosterDisplay[1][0] +spacesCDM+""+GeneratePlayer.rosterDisplay[1][1] +spacesCDMM+"              |");
			System.out.println("|                                                            |");
			System.out.println("|                                                            |");
			System.out.println("|                                                            |");
			System.out.println("|                                                            |");
			System.out.println("|      ______        ______         ______        ______     |");
			System.out.println("|     |      |      |      |       |      |      |      |    |");
			System.out.println("|     |  "+ GeneratePlayer.rosterOverall[0][0] +"  |      |  "+ GeneratePlayer.rosterOverall[0][1] +"  |       |  "+ GeneratePlayer.rosterOverall[0][2] +"  |      |  "+ GeneratePlayer.rosterOverall[0][3] +"  |    |");
			System.out.println("|     |______|      |______|       |______|      |______|    |");
			System.out.println("|      "+GeneratePlayer.rosterDisplay[0][0] +spacesLB+""+GeneratePlayer.rosterDisplay[0][1] +spacesCB+""+GeneratePlayer.rosterDisplay[0][2] +spacesCBB+""+GeneratePlayer.rosterDisplay[0][3] +spacesRB+"|");
			System.out.println("|                                                            |");
			System.out.println("|                            ______                                |");
			System.out.println("|                           |      |                          |");
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
				System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", position, player.getFirstName(), player.getLastName(), player.getOverall(), player.getPace(), player.getShooting(), player.getPassing(), player.getDribbling(), player.getDefending(), player.getPhysical());
			}
				}
			}
			menu();
		}
		public static void leagueTable(){
			System.out.println("                         PREMIER LEAGUE TABLE                         ");
			System.out.print("|----------------------------------------------------------------------");
			
			for(int x = 1; x < 20; x++){
				int counter = 0;
				System.out.println("|");
				System.out.printf("%-2s, %-5s", "| ", x);
				System.out.print("| ");
				System.out.printf("%-51s", generateSchedule.Team.get(counter).getClubName());
				System.out.print("|   ");
				System.out.printf("%-5s", generateSchedule.Team.get(counter).getPoints());
				System.out.println("|");
				System.out.println("|----------------------------------------------------------------------|");
				counter++;
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
