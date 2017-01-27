
public class SeasonView
	{

		public static void main(String[] args)
			{

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
			System.out.println();
			menu();
		}
		public static void menu(){
			System.out.println("What do you want to do first?");
		}

	}
