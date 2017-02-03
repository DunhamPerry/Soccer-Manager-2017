import java.util.ArrayList;
import java.util.Scanner;

public class GeneratePlayer
	{
		static int teamOverall = 0;
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
					switch (rosterDisplay[i][j].length()){
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
					switch (rosterDisplay[i][j].length()){
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
					switch (rosterDisplay[i][j].length()){
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
					switch (rosterDisplay[i][j].length()){
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
					switch (rosterDisplay[i][j].length()){
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
					switch (rosterDisplay[i][j].length()){
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
					switch (rosterDisplay[i][j].length()){
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
					switch (rosterDisplay[i][j].length()){
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
					switch (rosterDisplay[i][j].length()){
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
						teamOverall = teamOverall + player.getOverall();
						System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", position, player.getFirstName(), player.getLastName(), player.getOverall(), player.getPace(), player.getShooting(), player.getPassing(), player.getDribbling(), player.getDefending(), player.getPhysical());
					}
					teamOverall = teamOverall / 10;
						}
					Scanner userInput = new Scanner(System.in);
					System.out.println("Are you ready to begin the season?");
					System.out.println("1) Yes");
					int userAnswer = userInput.nextInt();
					seasonRunner();
					} 
				}
				public static void seasonRunner(){
					generateSchedule.generateTeams();
				}
			}
				

