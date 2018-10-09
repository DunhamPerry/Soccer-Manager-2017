import java.util.ArrayList;

//a
public class OtherGameSimultor {
	static ArrayList<Integer> playoffTeams = new ArrayList<Integer>();
	static boolean elimintated = false;
	
	public static void main(String[] args) {
	}

	public static void runner() {
		int counter = 0;
		int firstTeam = 0;
		int secondTeam = 0;
		int thirdTeam = 0;
		int fourthTeam = 0;
		if (LeagueGameStart.gamesPlayed == 1) {
			secondTeam = 1;
			thirdTeam = 2;
			fourthTeam = 3;
		} else if (LeagueGameStart.gamesPlayed == 2) {
			secondTeam = 2;
			thirdTeam = 1;
			fourthTeam = 3;
		} else if (LeagueGameStart.gamesPlayed == 3) {
			secondTeam = 3;
			thirdTeam = 1;
			fourthTeam = 2;
		}
		int gameNumber1 = firstTeam;
		int gameNumber2 = secondTeam;
		System.out.println("|------------------------------------------------|");
		System.out.println("|                     RESULTS                    |");
		System.out.println("|------------------------------------------------|");
		for (int i = 0; i < 8; i++) {
			for (int x = 0; x < 2; x++) {
				if (gameNumber1 == GeneratePlayer.teamNumber - 1 || gameNumber2 == GeneratePlayer.teamNumber - 1) {
				} else {
					int randomNumber = (int) (Math.random() * 10) + 1;
					int low = 0;
					int high = 0;
					switch (GenerateSchedule.team.get(gameNumber1).getClubOverall()
							- GenerateSchedule.team.get(gameNumber2).getClubOverall()) {
					case -7:
						low = 0;
						high = 3;
						break;
					case -6:
						low = 0;
						high = 3;
						break;
					case -5:
						low = 0;
						high = 3;
						break;
					case -4:
						low = 1;
						high = 4;
						break;
					case -3:
						low = 1;
						high = 4;
						break;
					case -2:
						low = 2;
						high = 5;
						break;
					case -1:
						low = 3;
						high = 6;
						break;
					case 0:
						low = 4;
						high = 7;
						break;
					case 1:
						low = 5;
						high = 8;
						break;
					case 2:
						low = 5;
						high = 8;
						break;
					case 3:
						low = 6;
						high = 9;
						break;
					case 4:
						low = 6;
						high = 9;
						break;
					case 5:
						low = 8;
						high = 10;
						break;
					case 6:
						low = 8;
						high = 10;
						break;
					case 7:
						low = 8;
						high = 10;
						break;
					}

					if (randomNumber < low) {
						System.out.print("|");
						System.out.printf("%-15s %-15s %-15s %1s\n",
								GenerateSchedule.team.get(gameNumber1).getClubName(), " BEAT ",
								GenerateSchedule.team.get(gameNumber2).getClubName(), "|");
						System.out.println("|------------------------------------------------|");
						// System.out.println(GenerateSchedule.team.get(gameNumber1).getClubName() + "
						// beat " + GenerateSchedule.team.get(gameNumber2).getClubName());
						GenerateSchedule.team.get(gameNumber1)
								.setPoints(GenerateSchedule.team.get(gameNumber1).getPoints() + 3);
					} else if (randomNumber <= high) {
						System.out.print("|");
						System.out.printf("%-15s %-15s %-15s %1s\n",
								GenerateSchedule.team.get(gameNumber1).getClubName(), " DREW ",
								GenerateSchedule.team.get(gameNumber2).getClubName(), "|");
						System.out.println("|------------------------------------------------|");
						// System.out.println(GenerateSchedule.team.get(gameNumber1).getClubName() + "
						// drew with " + GenerateSchedule.team.get(gameNumber2).getClubName());
						GenerateSchedule.team.get(gameNumber1)
								.setPoints(GenerateSchedule.team.get(gameNumber1).getPoints() + 1);
						GenerateSchedule.team.get(gameNumber2)
								.setPoints(GenerateSchedule.team.get(gameNumber2).getPoints() + 1);
					} else {
						System.out.print("|");
						System.out.printf("%-15s %-15s %-15s %1s\n",
								GenerateSchedule.team.get(gameNumber2).getClubName(), " BEAT ",
								GenerateSchedule.team.get(gameNumber1).getClubName(), "|");
						System.out.println("|------------------------------------------------|");
						// System.out.println(GenerateSchedule.team.get(gameNumber2).getClubName() + "
						// beat " + GenerateSchedule.team.get(gameNumber1).getClubName());
						GenerateSchedule.team.get(gameNumber2)
								.setPoints(GenerateSchedule.team.get(gameNumber2).getPoints() + 3);
					}
				}
				if (counter % 2 == 0) {
					gameNumber1 = thirdTeam;
					gameNumber2 = fourthTeam;
					counter++;
				}
			}
			firstTeam = firstTeam + 4;
			secondTeam = secondTeam + 4;
			thirdTeam = thirdTeam + 4;
			fourthTeam = fourthTeam + 4;
			if (counter % 2 == 1) {
				gameNumber1 = firstTeam;
				gameNumber2 = secondTeam;
				counter = 0;
			}
		}
		SeasonView.menu();
	}

	public static void endOfGroupStage() {
		int firstSpot = 0;
		int secondSpot = 1;
		int first = 0;
		int second = 0;
		for (int i = 0; i < 8; i++) {
			for (int x = 0; x < 4; x++) {
				if (GenerateSchedule.team.get(firstSpot).getPoints() < GenerateSchedule.team.get(second).getPoints()) {
					secondSpot = firstSpot;
					firstSpot = second;
				}
				else if (second % 4 == 0){						
				}
				else if (GenerateSchedule.team.get(second).getPoints() > GenerateSchedule.team.get(secondSpot).getPoints()){
						secondSpot = second;
				}
				second++;
			}
			playoffTeams.add(firstSpot);
			playoffTeams.add(secondSpot);
			first = first + 4;
			firstSpot = first;
			secondSpot = first + 1;
		}
		boolean qualified = false;
		for (int i = 0; i < 16; i++) {
			if ((GeneratePlayer.teamNumber-1) == playoffTeams.get(i)) {
				System.out.println("Congratulations, your team qualified from the group stage to the knockout rounds!");
				qualified = true;
			}
		}
		if (qualified == false) {
			elimintated = true;
			System.out.println("Your team was eliminated from the group stages");
		}
		Bracket.bracketCreator();
	}

}
