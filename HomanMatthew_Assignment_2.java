import java.util.Scanner;

/*
 * Matthew Homan
 * 27 January 2023
 * CMIS 141/6383
 * Assignment 2
 * 
 * This program Prompts a user to enter two numbers between 200 and 1000 
 * and a symbol for operation such as ‘+’, ‘-‘, ‘*’, and ‘/’.  If the 
 * provided symbol is valid, displays the input data along with the 
 * result of the calculation to the console. Otherwise displays an 
 * error message.
 * 
 */
public class HomanMatthew_Assignment_2 {

	public static void main(String[] args) {
		
		//Accept input from user - two numbers between 200 and 1000 separated by a space
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nEnter two integer numbers between 200 and 1000 separated by a space: ");
		String input [] = scanner.nextLine().split(" ");
		
		//Initialize numbers array to accept result of changing string to int
		int numbers [] = {0,0};

		//For loop to traverse through string to change input to integers
		for(int i = 0; i < input.length; i++) {
			numbers[i] = Integer.parseInt(input[i]);
		}
		
		//Initialize variables for each individual number entered by user and set values
		int firstNum = numbers[0];
		int secondNum = numbers[1];
		
		//Accept input from user - operation symbol
		System.out.print("\nEnter operation symbol (+, -, *, or /): ");
		char operationSymbol = scanner.next().charAt(0);
		
		//Initialize 'result' variable 
		int result = 0;
		
		//if statement to check if the operation symbol is acceptable
		if ((operationSymbol == '+') || (operationSymbol == '-') || (operationSymbol == '*') || (operationSymbol == '/')) {
			
			//nested if operation symbol +, add numbers
			if (operationSymbol == '+') {
				result = firstNum + secondNum;
				
				//Display result
				System.out.print("\nEvaluation: " + firstNum + " " + operationSymbol + " " + secondNum + " = " + result);
			}
			//nested if operation symbol -, subtract numbers
			if (operationSymbol == '-') {
				result = firstNum - secondNum;
				
				//Display result
				System.out.print("\nEvaluation: " + firstNum + " " + operationSymbol + " " + secondNum + " = " + result);
			}
			//nested if operation symbol *, multiply numbers
			if (operationSymbol == '*') {
				result = firstNum * secondNum;
				
				//Display result
				System.out.print("\nEvaluation: " + firstNum + " " + operationSymbol + " " + secondNum + " = " + result);
			}
			//nested if operation symbol /, divide numbers
			if (operationSymbol == '/') {
				//Set firstNum, secondNum, and result to double variables
				Double firstNumDbl = Double.valueOf(firstNum);
				Double secondNumDbl = Double.valueOf(secondNum);
				Double resultDbl = Double.valueOf(result);

				resultDbl = firstNumDbl / secondNumDbl;
				
				//Display result
				System.out.print("\nEvaluation: " + firstNum + " " + operationSymbol + " " + secondNum + " = " + resultDbl);
			}			
		} else {
			//Display error message if operation symbol input was unacceptable
			System.out.println("\nNot valid operation symbol");				
		}
		//Close scanner
		scanner.close();
	}
}