/*
 * Matthew Homan
 * February 15, 2023
 * CMIS 141 6383
 * Assignment 5 - Week 6
 * 
 * My program prompts the user to:
 * 
 * 1. Convert cubic feet to U.S. bushels
 * 2. Convert miles to kilometers
 * 3. Determine graduation with honors title
 * 4. Exit program
 * 
 * From there, it calls the appropriate method related to the user's selection
 * and performs the necessary actions to complete the request. The program will
 * continue prompting the user until the user selects to exit.
 */

import java.util.Scanner;

public class HomanMatthew_Wk6_Assignment5 {
	
	//main method
	public static void main(String[] args) {
		
		//Initialize variables and open Scanner
		int selection;
		Scanner scanner = new Scanner(System.in);
		
		//Do-While loop to repeat prompt until user exits
		do {
			//Print menu
			System.out.print("\nMENU\n"
					+ "1: Convert cubic feet to U.S. bushels\n"
					+ "2: Convert miles to kilometers\n"
					+ "3: Determine graduation title with honors\n"
					+ "9: Exit program\n\n"
					+ "Enter your selection: ");
			selection = scanner.nextInt();
			
			//If loops to perform correct action based on user selection
			if (selection == 1) {
				
				//Open Scanner and get feet
				Scanner cubic = new Scanner(System.in);
				System.out.print("\nEnter cubic feet: ");
				int feet = cubic.nextInt();

				//Call CubicCoversion if 1
				CubicConversion(feet);
			} else if (selection == 2) {

				//Open Scanner and get miles
				Scanner milesCon = new Scanner(System.in);
				System.out.print("\nEnter miles: ");
				int mile = milesCon.nextInt();
				
				//Call MilesConverstion if 2
				MilesConverstion(mile);
			} else if (selection == 3) {

				//Open Scanner and get GPA
				Scanner grad = new Scanner(System.in);
				System.out.print("\nEnter GPA: ");
				double gpa = grad.nextDouble();
				
				//Call Graduation if 3
				Graduation(gpa);
			}
		
		} while (selection != 9);
		
		//Print goodbye message
		System.out.println("\nThank you for using the program. Goodbye!");
		
		scanner.close();
	}

	//CubicConversion method
	public static void CubicConversion(int feet) {
		
		//Initialize variables
		double FOOTBUSHEL= 0.803564;
		
		//Print result
		System.out.println(feet + " cubic feet = " + (feet * FOOTBUSHEL));
	}
	
	//MilesConversion method
	public static void MilesConverstion(int mile) {
		
		//Initialize variables
		double MILETOKM = 1.60934;
		
		//Print result
		System.out.println(mile + " miles = " + (mile * MILETOKM));
	}

	//Graduation method
	public static void Graduation(double gpa) {
		
		//Convert double to string
		String gpaString = String.valueOf(gpa);
		
		//Switch statement printing appropriate result
		switch (gpaString) {
		  case "5.0":
		    System.out.println("Congratulations, you have graduated Summa Cum Laude");
		    break;
		  case "4.9":
			    System.out.println("Congratulations, you have graduated Summa Cum Laude");
			    break;
		  case "4.8":
			    System.out.println("Congratulations, you have graduated Summa Cum Laude");
			    break;
		  case "4.7":
			    System.out.println("Congratulations, you have graduated Summa Cum Laude");
			    break;
		  case "4.6":
			    System.out.println("Congratulations, you have graduated Summa Cum Laude");
			    break;
		  case "4.5":
			    System.out.println("Congratulations, you have graduated Summa Cum Laude");
			    break;
		  case "4.4":
			    System.out.println("Congratulations, you have graduated Summa Cum Laude");
			    break;
		  case "4.3":
			    System.out.println("Congratulations, you have graduated Summa Cum Laude");
			    break;
		  case "4.2":
			    System.out.println("Congratulations, you have graduated Summa Cum Laude");
			    break;
		  case "4.1":
			    System.out.println("Congratulations, you have graduated Summa Cum Laude");
			    break;
		  case "4.0":
			    System.out.println("Congratulations, you have graduated Summa Cum Laude");
			    break;
		  case "3.9":
			    System.out.println("Congratulations, you have graduated Magna Cum Laude");
			    break;
		  case "3.8":
			    System.out.println("Congratulations, you have graduated Magna Cum Laude");
			    break;
		  case "3.7":
			    System.out.println("Congratulations, you have graduated Cum Laude");
			    break;
		  case "3.6":
			    System.out.println("Congratulations, you have graduated Cum Laude");
			    break;
		  case "3.5":
			    System.out.println("Congratulations, you have graduated Cum Laude");
			    break;
		  default:
			    System.out.println("Sorry, your GPA falls outside of our range to graduate with honors.");
		}
		
	}
}
