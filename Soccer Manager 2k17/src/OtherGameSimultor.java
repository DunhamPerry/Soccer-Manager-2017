
public class OtherGameSimultor {
	public static void main(String[] args) {
	}
	public static void runner() {
		int counter = 0;
		int firstTeam = 0;
		int secondTeam = 0;
		int thirdTeam = 0;
		int fourthTeam = 0;
		if (LeagueGameStart.gamesPlayed == 1){
			secondTeam = 1;
			thirdTeam = 2;
			fourthTeam = 3;
		}
		else if (LeagueGameStart.gamesPlayed == 2){
			secondTeam = 2;
			thirdTeam = 1;
			fourthTeam = 3;
		}
		else if (LeagueGameStart.gamesPlayed == 3){
			secondTeam = 3;
			thirdTeam = 1;
			fourthTeam = 2;
		}
		int gameNumber1 = firstTeam;
		int gameNumber2 = secondTeam;
		for (int i = 0; i < 8; i++) {
		for (int x = 0; x < 2; x++) {
			System.out.println("i is " + i);
			System.out.println("x is " + x);
			System.out.println(gameNumber1);
			System.out.println(gameNumber2);
			int randomNumber = (int)(Math.random()*10)+1;
			int low = 0;
			int high = 0;
			switch(GenerateSchedule.team.get(gameNumber1).getClubOverall() - GenerateSchedule.team.get(gameNumber2).getClubOverall()) {
			case -5:
				low = 1;
				high = 4;
				break;
			case -4:
				low = 2;
				high = 4;
				break;
			case -3:
				low = 2;
				high = 5;
				break;
			case -2:
				low = 3;
				high = 5;
				break;
			case -1:
				low = 4;
				high = 5;
				break;
			case 0:
				low = 4;
				high = 6;
				break;
			case 1:
				low = 5;
				high = 6;
				break;
			case 2:
				low = 5;
				high = 7;
				break;
			case 3:
				low = 5;
				high = 8;
				break;
			case 4:
				low = 6;
				high = 8;
				break;
			case 5:
				low = 6;
				high = 9;
				break;
			}
			if (randomNumber < low) {
				System.out.println(GenerateSchedule.team.get(gameNumber1).getClubName());
				GenerateSchedule.team.get(gameNumber1).setPoints(GenerateSchedule.team.get(gameNumber1).getPoints()+3);
			}
			else if (randomNumber <= high) {
				System.out.println("draw");
				GenerateSchedule.team.get(gameNumber1).setPoints(GenerateSchedule.team.get(gameNumber1).getPoints()+1);
				GenerateSchedule.team.get(gameNumber2).setPoints(GenerateSchedule.team.get(gameNumber2).getPoints()+1);
			}
			else {
				System.out.println(GenerateSchedule.team.get(gameNumber2).getClubName());
				GenerateSchedule.team.get(gameNumber2).setPoints(GenerateSchedule.team.get(gameNumber2).getPoints()+3);
			}
			System.out.println("counter = " + counter);
			if (counter%2 == 0) {
				gameNumber1 = thirdTeam;
				gameNumber2 = fourthTeam;
				counter++;
			}
		}
		firstTeam = firstTeam + 4;
		secondTeam = secondTeam + 4;
		thirdTeam = thirdTeam + 4;
		fourthTeam = fourthTeam + 4;
		if(counter%2 == 1) {
			gameNumber1 = firstTeam;
			gameNumber2 = secondTeam;
			counter = 0;
		}
		}
		System.out.println("yeet");
		SeasonView.menu();
	}

}
