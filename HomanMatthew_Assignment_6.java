/*
 * 
 * Matthew Homan
 * Feb 22, 2023
 * CMIS 141 6383
 * Assignment 6
 * 
 *  This program will allow the user to determine the placement 
 *  of robotics teams participating in a regional competition 
 *  based on the aggregate score from the panel of judges.
 * 
 */

import java.util.Scanner;

public class HomanMatthew_Assignment_6 {

	public static void main(String[] args) {
		
		//Initialize variables and open scanners
		Scanner scannerStr = new Scanner(System.in);
		Scanner scannerInt = new Scanner(System.in);
		String inputName;
		int numTeams;
		int inputScore;
		
		//Prompt user for number of teams
		System.out.print("\nHow many teams do you want to enter: ");
		numTeams = scannerInt.nextInt();
		
		//Initialize arrays using input from user
		String [] teamNames = new String [numTeams];
		int [] teamScores = new int [numTeams];
		
		//for loop to place input in an array - team name followed by team score
		for (int i = 0; i < teamNames.length; i++){
			System.out.println("\nTeam " + (i+1) + ": ");
			System.out.print("\tEnter the team's name: ");
			inputName = scannerStr.nextLine();
			teamNames[i] = inputName;
			
			System.out.print("\tEnter the team's score (400-1000): ");
			inputScore = scannerInt.nextInt();
			teamScores[i] = inputScore;
		}
		
		//Initialize variables to use when finding lowest and highest score
		int min = teamScores[0], max = teamScores[0], indexMin = 0, indexMax = 0;
		
		//Spacer print line
		System.out.println();
		
		//for loop to print the team names and scores
		for (int i = 0; i < teamNames.length; i++) {
			System.out.println(teamNames[i] + "\t" + teamScores[i]);
		}
		
		//for loop to find the min and max scores
		for (int i = 1; i < teamScores.length; i++) {
			//if statement to find min score
			if (teamScores[i] < min) {
				indexMin = i;
				min = teamScores[i];
			}
			//if statement to find max score
			if (teamScores[i] > max) {
				indexMax = i;
				max = teamScores[i];
			}
		}
		
		//Print results with highest team and their score followed by lowest team and their score
		System.out.print("\n\nThe " + teamNames[indexMax] + " have the highest score at " + teamScores[indexMax] + " and the " + 
				teamNames[indexMin] + " have the lowest score at " + teamScores[indexMin] + ".");

		//Close scanners
		scannerStr.close();
		scannerInt.close();
	}

}
