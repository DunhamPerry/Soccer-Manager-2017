import java.util.ArrayList;

public class Bracket {
	static int userTeamBracketPosition;
	static ArrayList<Integer> bracket = new ArrayList<Integer>();
	static ArrayList<Integer> quaterFinal = new ArrayList<Integer>();
	static ArrayList<Integer> semiFinal = new ArrayList<Integer>();
	static ArrayList<Integer> Final = new ArrayList<Integer>();

	public static void main(String[] args) {
	}

	public static void bracketCreator() {
		int firstAdder = 3;
		int secondAdder = 1;
		int counterAdder = 0;
		int counter = 0;
		for (int i = 0; i < 2; i++) {
			for (int x = 0; x < 8; x++) {
				bracket.add(OtherGameSimultor.playoffTeams.get(counter + counterAdder));
				if (x % 2 == 0) {
					counter = counter + firstAdder;
				} else {
					counter = counter + secondAdder;
				}
			}
			counter = 2;
			firstAdder = -1;
			secondAdder = 5;
		}
		userTeamFinder();
	}
	private static void userTeamFinder() {
		for (int i = 0; i < bracket.size(); i++) {
			if ((GeneratePlayer.teamNumber-1) == bracket.get(i)) {
				userTeamBracketPosition = i;
			}
		}
		System.out.println(userTeamBracketPosition);
		bracketPrinter();
	}
	private static void bracketPrinter() {
		System.out.println("                                                                                         ");
		System.out.printf("%-11s %-71s %-11s\n", GenerateSchedule.team.get(bracket.get(0)).getClubName(),"                                                                                            ", GenerateSchedule.team.get(bracket.get(8)).getClubName());
		System.out.println("------------                                                                                            ------------");
		System.out.printf("%-11s %-71s %-11s\n", GenerateSchedule.team.get(bracket.get(1)).getClubName(),"|------------                                                                  ------------|", GenerateSchedule.team.get(bracket.get(9)).getClubName());
		System.out.println("------------             |                                                                |             ------------");
		System.out.printf("%-11s %-71s %-11s\n", GenerateSchedule.team.get(bracket.get(2)).getClubName(),"             |------------                                        ------------|             ", GenerateSchedule.team.get(bracket.get(10)).getClubName());
		System.out.println("-------------            |            |                                      |            |             ------------");
		System.out.printf("%-11s %-71s %-11s\n", GenerateSchedule.team.get(bracket.get(3)).getClubName(),"|------------             |                WINNER                |             ------------|", GenerateSchedule.team.get(bracket.get(11)).getClubName());
		System.out.println("------------                          |            |------------|            |                          ------------");
		System.out.printf("%-11s %-71s %-11s\n", GenerateSchedule.team.get(bracket.get(4)).getClubName(),"                          |------------|            |------------|                          ", GenerateSchedule.team.get(bracket.get(12)).getClubName());
		System.out.println("------------                          |            |------------|            |                          ------------");
		System.out.printf("%-11s %-71s %-11s\n", GenerateSchedule.team.get(bracket.get(5)).getClubName(),"|------------             |                                      |             ------------|", GenerateSchedule.team.get(bracket.get(13)).getClubName());
		System.out.println("------------             |            |                                      |            |             ------------");
		System.out.printf("%-11s %-71s %-11s\n", GenerateSchedule.team.get(bracket.get(6)).getClubName(),"             |------------                                        ------------|             ", GenerateSchedule.team.get(bracket.get(14)).getClubName());
		System.out.println("------------             |                                                                |             ------------");
		System.out.printf("%-11s %-71s %-11s\n", GenerateSchedule.team.get(bracket.get(7)).getClubName(),"|------------                                                                  ------------|", GenerateSchedule.team.get(bracket.get(15)).getClubName());
		System.out.println("------------                                                                                            ------------");
		SeasonView.menu();
	}

}
