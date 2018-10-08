import java.util.ArrayList;

public class Bracket
	{
		static ArrayList<Integer> bracket = new ArrayList<Integer>();
		public static void main(String[] args)
			{

			}
		public static void bracketCreator(){
			int firstAdder = 3;
			int secondAdder = 1;
			int counterAdder = 0;
			int counter = 0;
			for (int i = 0; i < 2; i++){
				for (int x = 0; x < 8; x++){
					bracket.add(OtherGameSimultor.playoffTeams.get(counter + counterAdder));
					if (x % 2 == 0){
						counter = counter + firstAdder;
					}
					else {
						counter = counter + secondAdder;
					}
				}
				counter = 2;
				firstAdder = -1;
				secondAdder = 5;
			}
			for (int i = 0; i < bracket.size(); i++){
				System.out.println(GenerateSchedule.team.get(bracket.get(i)).getClubName() + " " + GenerateSchedule.team.get(bracket.get(i)).getPoints());
			}
			System.exit(0);
		}

	}
