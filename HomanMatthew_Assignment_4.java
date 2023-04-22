/*
 * Matthew Homan
 * February 11, 2023
 * Week 5 Assignment 4
 * CMIS 141 6383
 * 
 * My first program prompts the user for the number of rows (e.g. 7) and 
 * output the right- side triangle pattern.
 * 
 * My second program takes in an integer from the user and prints a square
 * with the outer layer being the input integer and then each layer 
 * within the square printing the integer minus 1 until reaching the 
 * exact center printing 1.  
 * 
 * I decided to build the program breaking the whole square into 
 * quadrants. Q1 is the top left, Q2 is the top right, Q3 is the 
 * bottom left, and Q4 is the bottom right.  In each quadrant, I broke
 * the problem into triangles.  First the left triangle prints with
 * nested for loops and then the right triangle. 
 * 
 * To achieve this result, I had to use lots of extra variables, so
 * my code is a bit difficult to read.  I have attempted to clean it up 
 * but I apologize for the mess. Enjoy!
 * 
 */

import java.util.Scanner;

public class HomanMatthew_Assignment_4 {

	public static void main(String[] args) {
		
		//Program 1
		//Get input integer from user
		System.out.print("\nEnter a number of rows: ");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println();
		
		//First for loop to print rows
		for (int i = 1; i <= num; i++) {
			
			//Nested for loop to print columns
			//Variable 'j' will print the number of the row
			//adding 1 to itself each loop to maintain accurate printing
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			//Print statement to move to next row
			System.out.println();
		}
		
		
		
		
		//Program 2
		//Get input integer from user
		System.out.print("\nEnter a number: ");
		Scanner scanner2 = new Scanner(System.in);
		int total = scanner2.nextInt();
		System.out.println();
				
		//Initialize variables
		int a = total;
		int b = total;
		int c = total;
		int d = total;
		int e = 2;
		int f = 3;
		int endCol = total * 2 - 1;
		int count = -1;
		int count2 = 0;
		int tri3 = total + 1;
		int tri4 = endCol;
		int tri7 = total + 1;
		int tri8 = total + 2;
				
		//Q1 and Q2 - TOP HALF SECTION
				
		for (int i = 1; i <= total; i++) {			
			//Triangle 1
			a = total;
			for (int j = 1; j <= i; j++) {
				System.out.print(a + " ");
				a--;
			}
			//Triangle 2
			for (int j = 1; j <= total - i; j++) {
				System.out.print(b + " ");
			}
			b--;
					
			//Triangle 3
			for (int j = tri3; j <= endCol; j++) {
				if (c != 1) {
					System.out.print(c + " ");
				}
			}
			tri3++;
			c--;
					
			//Triangle 4
			d = total - count;
			for (int j = tri4; j < endCol; j++) {
				if (d != 1) {
					System.out.print(d + " ");
				}
				d++;
			}
			count++;
			tri4--;
					
			//Print statement to move to next row
			System.out.println();
		}
				
		//Q3 and Q4 - BOTTOM HALF SECTION
				
		a = 2;
		for (int i = 1; i < total; i++) {
			b = total;
					
			//Triangle 5
			for (int j = 1; j <= total - i; j++) {
				System.out.print(b + " ");
				b--;
			}
					
			//Triangle 6
			for (int j = 1; j <= i; j++) {
				System.out.print(a + " ");
			}
			a++;
					
			//Triangle 7
			for (int j = total + 1; j <= tri7; j++) {
							System.out.print(e + " ");
			}
			tri7++;
			e++;
			f = 3 + count2;
					
			//Triangle 8
			for ( int j = tri8; j <= endCol; j++) {
				System.out.print(f + " ");
				f++;
			}
			tri8++;
			count2++;
					
			//Print statement to move to next row
			System.out.println();
		}		
		//Close Scanners
		scanner.close();
		scanner2.close();
	}
}