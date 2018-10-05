import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;
//a
public class GeneratePlayer
	{
		static int teamOverall = 0;
		static int pickPosition = 0;
		static int pickCounter = 0;
		static String userTeamName = "";
		static int teamNumber;
		static int rosterFull = 0;
		static String [][]rosterDisplay = {{"2","3","4","5"},{"6","7"},{"8","9","10"},{"11"}};
		static int [][]rosterOverall = {{2,3,4,5},{6,7},{8,9,10},{11}};
		static ArrayList<Player> draftPicks = new ArrayList<Player>();
		static ArrayList<TeamPlayer> Roster = new ArrayList<TeamPlayer>();
		static String []rosterPlayerName = {"", ""};
		static int []rosterPlayerStats = {0,0,0,0,0,0,0,0,0,0};
		static int counter = 1;
		
		public static void main(String[] args){
			GenerateSchedule.generateTeams();
		}
		public static void runner(){
			Scanner userInput = new Scanner(System.in);
			System.out.println("Welcome to The World Cup");
			System.out.println("A Beautifully Crafted Masterpiece by Dunham Perry");
			System.out.println("Pick Your Team");
			for (int i = 0; i < 32; i++){
				System.out.println((i+1) + ") " + GenerateSchedule.team.get(i).getClubName());
			}
			teamNumber = userInput.nextInt();
			GenerateSchedule.team.get(teamNumber-1).setPlayer(true);
			userTeamName = GenerateSchedule.team.get(teamNumber-1).getClubName();
			System.out.println(userTeamName);
			System.out.println("Welcome to " + userTeamName);
			System.out.println("Are You Ready to Pick a Roster?");
			System.out.println("1) YES");
			int ready = userInput.nextInt();
			if (ready == 1){
			generatePlayer();
			//SeasonView.runner();
			}
			else {
			generatePlayer();
			//SeasonView.runner();
			}
			//yes
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
				
						
						draftPicks.add(new Player(firstNameGenerator, lastNameGenerator, overallGenerator,paceGenerator, shootingGenerator, passingGenerator, dribblingGenerator, defendingGenerator, physicalGenerator));
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
					System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", "NUMBER", "FIRST NAME", "LAST NAME", "OVERALL", "PACE", "SHOOTING", "PASSING", "DRIBBLING", "DEFENDING", "PHYSICAL");
					for (int i = 0; i < draftPicks.size(); i++){
					System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", counter, draftPicks.get(i).getFirstName(), draftPicks.get(i).getLastName(), draftPicks.get(i).getOverall(), draftPicks.get(i).getPace(), draftPicks.get(i).getShooting(), draftPicks.get(i).getPassing(), draftPicks.get(i).getDribbling(), draftPicks.get(i).getDefending(), draftPicks.get(i).getPhysical());
					counter++;
					//delay();
					}
					counter = 1;
					System.out.println();
					pickPlayer();
				}
				
				public static void pickPlayer(){
					String[]position = {"Left Back", "Center Back", "Center Back", "Right Back", "Center Defensive Midfielder", "Center Defensive Midfielder", "Left Attacking Midfielder", "Center Attacking Midfielder", "Right Attacking Midfielder", "Striker"};
					System.out.println("Pick a " + position[pickPosition]);
					Scanner userInput = new Scanner(System.in);
					//int playerDraft = userInput.nextInt();
					int playerDraft = 1;
					Roster.add(new TeamPlayer(draftPicks.get(playerDraft - 1).getFirstName(), draftPicks.get(playerDraft - 1).getLastName(), pickPosition + 1, draftPicks.get(playerDraft - 1).getOverall(),draftPicks.get(playerDraft - 1).getPace(), draftPicks.get(playerDraft - 1).getShooting(), draftPicks.get(playerDraft - 1).getPassing(), draftPicks.get(playerDraft - 1).getDribbling(), draftPicks.get(playerDraft - 1).getDefending(), draftPicks.get(playerDraft - 1).getPhysical()));
					draftPicks.clear();
					pickPosition++;
					rosterFull++;
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
				
					System.out.println();
					System.out.println("                              "+userTeamName);
					System.out.println(" ____________________________________________________________ ");
					System.out.println("|                         |          |                       |");
					System.out.println("|                                                            |");
					System.out.println("|                                                            |");
					System.out.println("|                            ______                          |");
					System.out.println("|                           |      |                         |");
					System.out.println("|                           |  9   |                         |");
					System.out.println("|                           |______|                         |");
					System.out.print("|                            ");
					System.out.printf("%-10s", rosterDisplay[3][0]);
					System.out.println("                      |");
					System.out.println("|                                                            |");
					System.out.println("|    ______                  ______               ______     |");
					System.out.println("|   |      |                |      |             |      |    |");
					System.out.println("|   |  11  |                |  8   |             |  10  |    |");
					System.out.println("|   |______|                |______|             |______|    |");
					System.out.print("|   ");
					System.out.printf("%-10s", rosterDisplay[2][0]);
					System.out.print("              ");
					System.out.printf("%-10s", rosterDisplay[2][1]);
					System.out.print("           ");
					System.out.printf("%-10s", rosterDisplay[2][2]);
					System.out.println("  |");
					System.out.println("|                                                            |");
					System.out.println("|                                                            |");
					System.out.println("|                                                            |");
					System.out.println("|                ______                 ______               |");
					System.out.println("|               |      |               |      |              |");
					System.out.println("|               |  7   |               |  6   |              |");
					System.out.println("|               |______|               |______|              |");
					System.out.print("|                ");
					System.out.printf("%-10s", rosterDisplay[1][0]);
					System.out.print("             ");
					System.out.printf("%-10s", rosterDisplay[1][1]);
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
					System.out.printf("%-10s", rosterDisplay[0][0]);
					System.out.print("    ");
					System.out.printf("%-10s", rosterDisplay[0][1]);
					System.out.print("     ");
					System.out.printf("%-10s", rosterDisplay[0][2]);
					System.out.print("    ");
					System.out.printf("%-10s", rosterDisplay[0][3]);
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
					System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s\n", "POSITION", "FIRST NAME", "LAST NAME", "OVERALL", "PACE", "SHOOTING", "PASSING", "DRIBBLING", "DEFENDING", "PHYSICAL");
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
						delay();
					}
					teamOverall = teamOverall / 100;
					Scanner userInput = new Scanner(System.in);
					System.out.println("Are you ready to begin the season?");
					System.out.println("1) Yes");
					int userAnswer = userInput.nextInt();
					seasonRunner();
					} 
				public static void seasonRunner(){
					SeasonView.runner();
				}
				public static void delay()
					{
			        try
							{
							Thread.sleep(100);
							} catch (InterruptedException e)
							{
							e.printStackTrace();
							}
					}
			}
				

