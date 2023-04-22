/*
 * Matthew Homan
 * CMIS 141/6383
 * February 3, 2023
 * Week 3 Assignment
 * This program calculates a gamer's total XP score with a bonus per level
 */
import java.util.Scanner;

public class HomanMatthew_Assignment3 {

	public static void main(String[] args) {
		
		//Initialize variables
		int score1, score2, score3, score4;
		float total;
		String startProgram, startProgram2, playerName;
		
		//Print welcome message and ask if user wants to enter data
		System.out.print("\nWelcome to the Total XP calculation program!\n\n"
				+ "Do you want to enter gamer's data? Yes/No => ");
		Scanner scanner = new Scanner(System.in);
		startProgram = scanner.nextLine();
		
		//if-statement to determine if user answered 'yes' or 'no' - use equalsIgnoreCase
		if (startProgram.equalsIgnoreCase("yes")) {
			
			//do-while loop to perform data gathering, calculation, print result, and ask if user wants to enter another gamer
			do {
				//Input gamer's name
				Scanner player = new Scanner(System.in);
				System.out.print("\nEnter gamer's name => ");
				playerName = player.nextLine();
				
				//Input gamer's scores
				Scanner scanScore = new Scanner(System.in);
				System.out.print("\nEnter gamer's Level XP scores separated by space: L1 L2 L3 ES => ");
				score1 = scanScore.nextInt();
				score2 = scanScore.nextInt();
				score3 = scanScore.nextInt();
				score4 = scanScore.nextInt();
				
				//Print input data
				System.out.print("\nGamer Name: " + playerName + " L1=" + score1 + " L2=" + score2 + " L3=" + score3 + " ES=" + score4);
				
				//Calculate score
				total = score1 + ((score1 * 2) / 10) + score2 + ((score2 * 3) / 10) + score3 + (score3 / 2) + score4 + ((score4 * 6)/10);
				
				//Change float to int for integer answers
				int intTotal = (int) total;
				
				//Print final score
				System.out.print("\nFinal XP score with bonuses=" + intTotal);
				
				//Ask user if they want to continue with another user
				Scanner scanner2 = new Scanner(System.in);
				System.out.print("\n\nDo you want to enter another gamer's data? Yes/No => ");
				startProgram2 = scanner2.nextLine();
				
			} //while part of do-while loop to analyze if 'yes' or 'no' 
			while (startProgram2.equalsIgnoreCase("yes"));
		}
		
		//Print thank you end note
		System.out.print("\nThank you for using the Total XP calculation program!");

		//close scanner
		scanner.close();
	}

}
