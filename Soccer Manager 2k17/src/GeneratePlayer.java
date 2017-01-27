import java.util.ArrayList;
import java.util.Scanner;

public class GeneratePlayer
	{
		static int pickPosition = 0;
		static int pickCounter = 0;
		static String teamName = "";
		static String name = "";
		static int rosterFull = 0;
		static String [][]rosterDisplay = {{"2","3","4","5"},{"6","7"},{"8","9","10"},{"11"}};
		static int [][]rosterOverall = {{2,3,4,5},{6,7},{8,9,10},{11}};
		static ArrayList<Player> draftPicks = new ArrayList<Player>();
		static ArrayList<TeamPlayer> Roster = new ArrayList<TeamPlayer>();
		static String []rosterPlayerName = {"", ""};
		static int []rosterPlayerStats = {0,0,0,0,0,0,0,0,0,0};
		static int counter = 1;
		
		public static void main(String[] args){
			Scanner userInput = new Scanner(System.in);
			System.out.println("Welcome to Soccer Manager");
			System.out.println("A Beuatifully Crafted Masterpiece by Dunham Perry");
			System.out.println("What is your name?");
			name = userInput.nextLine();
			System.out.println("Pick a Name for Your Team");
			teamName = userInput.nextLine();
			System.out.println("Wonderful Choice");
			System.out.println("Are You Ready to Pick a Team?");
			System.out.println("1) YES");
			int ready = userInput.nextInt();
			if (ready == 1){
			generatePlayer();
			}
			else {
			generatePlayer();
			}
		}
		
				public static void generatePlayer(){
					for (int i = 0; i < 10; i++){
						String firstNameGenerator = NameDatabase.firstNameArray[(int)(Math.random()*160)+1];
						String lastNameGenerator = NameDatabase.lastNameArray[(int)(Math.random()*999)+1];
						int paceGenerator = (int)((Math.random()*29)+1)+70;
						int shootingGenerator = (int)((Math.random()*29)+1)+70;
						int passingGenerator = (int)((Math.random()*29)+1)+70;
						int dribblingGenerator = (int)((Math.random()*29)+1)+70;
						int defendingGenerator = (int)((Math.random()*29)+1)+70;
						int physicalGenerator = (int)((Math.random()*29)+1)+70;
						int overallGenerator = (paceGenerator + shootingGenerator + passingGenerator + dribblingGenerator + defendingGenerator + physicalGenerator) / 6;
				
						
						draftPicks.add(new Player(firstNameGenerator, lastNameGenerator, overallGenerator,paceGenerator, passingGenerator, dribblingGenerator, defendingGenerator, physicalGenerator, physicalGenerator));
						}
						
					
					if(pickCounter < 10){
						pickCounter++;
						printList();
					}
					else{
						rosterFieldView();
					}
				}
				
				public static void printList(){
					System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", "Number", "First Name", "Last Name", "Overall", "Pace", "Shooting", "Passing", "Dribbling", "Defending", "Physical");
					for (int i = 0; i < draftPicks.size(); i++){
					System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", counter, draftPicks.get(i).getFirstName(), draftPicks.get(i).getLastName(), draftPicks.get(i).getOverall(), draftPicks.get(i).getPace(), draftPicks.get(i).getShooting(), draftPicks.get(i).getPassing(), draftPicks.get(i).getDribbling(), draftPicks.get(i).getDefending(), draftPicks.get(i).getPhysical());
					counter++;
					}
					counter = 1;
					System.out.println();
					pickPlayer();
				}
				
				public static void pickPlayer(){
					String[]position = {"Left Back", "Center Back", "Center Back", "Right Back", "Center Defensive Midfielder", "Center Defensive Midfielder", "Left Attacking Midfielder", "Center Attacking Midfielder", "Right Attacking Midfielder", "Striker"};
					System.out.println("Pick a " + position[pickPosition]);
					Scanner userInput = new Scanner(System.in);
					int playerDraft = userInput.nextInt();
					Roster.add(new TeamPlayer(draftPicks.get(playerDraft - 1).getFirstName(), draftPicks.get(playerDraft - 1).getLastName(), pickPosition + 1, draftPicks.get(playerDraft - 1).getOverall(),draftPicks.get(playerDraft - 1).getPace(), draftPicks.get(playerDraft - 1).getPassing(), draftPicks.get(playerDraft - 1).getShooting(), draftPicks.get(playerDraft - 1).getDribbling(), draftPicks.get(playerDraft - 1).getDefending(), draftPicks.get(playerDraft - 1).getPhysical()));
					draftPicks.clear();
					pickPosition++;
					rosterFull++;
					System.out.println(rosterFull);
					if (rosterFull == 10){
						System.out.println("Complete");
						rosterFieldView();
					}
					else {
						generatePlayer();
					}
				}
				
				public static void rosterFieldView(){
					int counter = 0;
					for (int i = 0; i < 4; i++){
						for (int j = 0; j < rosterDisplay[i].length; j++){
							rosterDisplay[i][j] = Roster.get(counter).getLastName();
							counter++;
						}
					} 
					
					counter = 0;
					for (int i = 0; i < 4; i++){
						for (int j = 0; j < rosterOverall[i].length; j++){
							rosterOverall[i][j] = Roster.get(counter).getOverall();
							counter++;
					
					String spacesLB = "";
					switch (rosterDisplay[i][j].length()){
						case 2:
							spacesLB = "                   ";
						case 3:
							spacesLB = "                  ";
						case 4:
							spacesLB = "                 ";
						case 5:
							spacesLB = "                ";
						case 6:
							spacesLB = "               ";
						case 7:
							spacesLB = "              ";
						case 8:
							spacesLB = "             ";
						case 9:
							spacesLB = "            ";
						case 10:
							spacesLB = "           ";
						case 11:
							spacesLB = "          ";
						case 12:
							spacesLB = "         ";
					}
					String spacesCB = "";
					switch (rosterDisplay[i][j].length()){
					case 2:
						spacesCB = "                   ";
					case 3:
						spacesCB = "                  ";
					case 4:
						spacesCB = "                 ";
					case 5:
						spacesCB = "                ";
					case 6:
						spacesCB = "               ";
					case 7:
						spacesCB = "              ";
					case 8:
						spacesCB = "             ";
					case 9:
						spacesCB = "            ";
					case 10:
						spacesCB = "           ";
					case 11:
						spacesCB = "          ";
					case 12:
						spacesCB = "         ";
				}
					String spacesCBB = "";
					switch (rosterDisplay[i][j].length()){
					case 2:
						spacesCBB = "                   ";
					case 3:
						spacesCBB = "                  ";
					case 4:
						spacesCBB = "                 ";
					case 5:
						spacesCBB = "                ";
					case 6:
						spacesCBB = "               ";
					case 7:
						spacesCBB = "              ";
					case 8:
						spacesCBB = "             ";
					case 9:
						spacesCBB = "            ";
					case 10:
						spacesCBB = "           ";
					case 11:
						spacesCBB = "          ";
					case 12:
						spacesCBB = "         ";
				}
					String spacesRB = "";
					switch (rosterDisplay[i][j].length()){
					case 2:
						spacesRB = "                   ";
					case 3:
						spacesRB = "                  ";
					case 4:
						spacesRB = "                 ";
					case 5:
						spacesRB = "                ";
					case 6:
						spacesRB = "               ";
					case 7:
						spacesRB = "              ";
					case 8:
						spacesRB = "             ";
					case 9:
						spacesRB = "            ";
					case 10:
						spacesRB = "           ";
					case 11:
						spacesRB = "          ";
					case 12:
						spacesRB = "         ";
				}
					String spacesCDM = "";
					switch (rosterDisplay[i][j].length()){
					case 2:
						spacesCDM = "                            ";
					case 3:
						spacesCDM = "                           ";
					case 4:
						spacesCDM = "                          ";
					case 5:
						spacesCDM = "                         ";
					case 6:
						spacesCDM = "                        ";
					case 7:
						spacesCDM = "                       ";
					case 8:
						spacesCDM = "                      ";
					case 9:
						spacesCDM = "                     ";
					case 10:
						spacesCDM = "                    ";
					case 11:
						spacesCDM = "                   ";
					case 12:
						spacesCDM = "                  ";
				}
					String spacesCDMM = "";
					switch (rosterDisplay[i][j].length()){
					case 2:
						spacesCDMM = "                            ";
					case 3:
						spacesCDMM = "                           ";
					case 4:
						spacesCDMM = "                          ";
					case 5:
						spacesCDMM = "                         ";
					case 6:
						spacesCDMM = "                        ";
					case 7:
						spacesCDMM = "                       ";
					case 8:
						spacesCDMM = "                      ";
					case 9:
						spacesCDMM = "                     ";
					case 10:
						spacesCDMM = "                    ";
					case 11:
						spacesCDMM = "                   ";
					case 12:
						spacesCDMM = "                  ";
				}
					String spacesRAM = "";
					switch (rosterDisplay[i][j].length()){
					case 2:
						spacesRAM = "                            ";
					case 3:
						spacesRAM = "                           ";
					case 4:
						spacesRAM = "                          ";
					case 5:
						spacesRAM = "                         ";
					case 6:
						spacesRAM = "                        ";
					case 7:
						spacesRAM = "                       ";
					case 8:
						spacesRAM = "                      ";
					case 9:
						spacesRAM = "                     ";
					case 10:
						spacesRAM = "                    ";
					case 11:
						spacesRAM = "                   ";
					case 12:
						spacesRAM = "                  ";
				}
					String spacesCAM = "";
					switch (rosterDisplay[i][j].length()){
					case 2:
						spacesCAM = "                        ";
					case 3:
						spacesCAM = "                       ";
					case 4:
						spacesCAM = "                         ";
					case 5:
						spacesCAM = "                     ";
					case 6:
						spacesCAM = "                    ";
					case 7:
						spacesCAM = "                   ";
					case 8:
						spacesCAM = "                  ";
					case 9:
						spacesCAM = "               ";
					case 10:
						spacesCAM = "                ";
					case 11:
						spacesCAM = "               ";
					case 12:
						spacesCAM = "              ";
				}
					String spacesLAM = "";
					switch (rosterDisplay[i][j].length()){
					case 2:
						spacesLAM = "                           ";
					case 3:
						spacesLAM = "                          ";
					case 4:
						spacesLAM = "                            ";
					case 5:
						spacesLAM = "                                ";
					case 6:
						spacesLAM = "                          ";
					case 7:
						spacesLAM = "                      ";
					case 8:
						spacesLAM = "                   ";
					case 9:
						spacesLAM = "                    ";
					case 10:
						spacesLAM = "                   ";
					case 11:
						spacesLAM = "                  ";
					case 12:
						spacesLAM = "                 ";
				}
					String spacesST = "";
					switch (rosterDisplay[i][j].length()){
					case 2:
						spacesST = "              ";
					case 3:
						spacesST = "             ";
					case 4:
						spacesST = "            ";
					case 5:
						spacesST = "           ";
					case 6:
						spacesST = "          ";
					case 7:
						spacesST = "         ";
					case 8:
						spacesST = "        ";
					case 9:
						spacesST = "       ";
					case 10:
						spacesST = "      ";
					case 11:
						spacesST = "     ";
					case 12:
						spacesST = "    ";
				}
					
					System.out.println();
					System.out.println("                              "+teamName);
					System.out.println(" ____________________________________________________________ ");
					System.out.println("|                         |          |                       |");
					System.out.println("|                                                            |");
					System.out.println("|                                                            |");
					System.out.println("|                            ______                          |");
					System.out.println("|                           |      |                         |");
					System.out.println("|                           |  "+ rosterOverall[3][0] +"  |                         |");
					System.out.println("|                           |______|                         |");
					System.out.println("|                            " + rosterDisplay[3][0] + spacesST +"                        |");
					System.out.println("|                                                            |");
					System.out.println("|    ______                  ______               ______     |");
					System.out.println("|   |      |                |      |             |      |    |");
					System.out.println("|   |  "+ rosterOverall[2][0] +"  |                |  "+ rosterOverall[2][1] +"  |             |  "+ rosterOverall[2][2] +"  |    |");
					System.out.println("|   |______|                |______|             |______|    |");
					System.out.println("|    "+ rosterDisplay[2][0] + spacesLAM +""+ rosterDisplay[2][1] +spacesCAM+""+rosterDisplay[2][2] +spacesRAM+"     |");
					System.out.println("|                                                            |");
					System.out.println("|                                                            |");
					System.out.println("|                                                            |");
					System.out.println("|                ______                 ______               |");
					System.out.println("|               |      |               |      |              |");
					System.out.println("|               |  "+ rosterOverall[1][0] +"  |               |  "+ rosterOverall[1][1] +"  |              |");
					System.out.println("|               |______|               |______|              |");
					System.out.println("|                "+rosterDisplay[1][0] +spacesCDM+""+rosterDisplay[1][1] +spacesCDMM+"              |");
					System.out.println("|                                                            |");
					System.out.println("|                                                            |");
					System.out.println("|                                                            |");
					System.out.println("|                                                            |");
					System.out.println("|      ______        ______         ______        ______     |");
					System.out.println("|     |      |      |      |       |      |      |      |    |");
					System.out.println("|     |  "+ rosterOverall[0][0] +"  |      |  "+ rosterOverall[0][1] +"  |       |  "+ rosterOverall[0][2] +"  |      |  "+ rosterOverall[0][3] +"  |    |");
					System.out.println("|     |______|      |______|       |______|      |______|    |");
					System.out.println("|      "+rosterDisplay[0][0] +spacesLB+""+rosterDisplay[0][1] +spacesCB+""+rosterDisplay[0][2] +spacesCBB+""+rosterDisplay[0][3] +spacesRB+"|");
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
					for(TeamPlayer player: Roster){
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
					Scanner userInput = new Scanner(System.in);
					System.out.println("Are you ready to begin the season?");
					System.out.println("1) Yes");
					int userAnswer = userInput.nextInt();
					seasonRunner();
						}
					} 
				}
				public static void seasonRunner(){
					SeasonView.runner();
				}
			}
				

