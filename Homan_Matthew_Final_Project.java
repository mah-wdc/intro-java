/*
 * Matthew Homan
 * March 4, 2023
 * CMIS 141 6383
 * Final Project
 * 
 * This program manages new and existing customers and their order-related data. 
 * A menu is displayed with 5 options plus exit. A user can select any option continuously
 * until they select EXIT. User can add one or many customers, display all customers, 
 * retrieve specific customer data, retrieve customers based on sales values range, 
 * and exit. 
 * 
 */

import java.util.Scanner;

public class Homan_Matthew_Final_Project {
	
	//main method
	public static void main(String[] args) {

		//Open scanner and initialize variables
		Scanner selection = new Scanner(System.in);
		int input = 0;
		int totalCount = 0;
		String[] customerNames = new String [100];
		int[] customerIDs = new int [100];
		float[] customerSales = new float [100];
		
		//Do-while to prompt user for menu selection
		do {
			//Print menu
			System.out.print("\n\tMENU\n");
			System.out.println("1: Add multiple new customers");
			System.out.println("2: Add single new customer");
			System.out.println("3: Display all customers");
			System.out.println("4: Retrieve specific customer's data");
			System.out.println("5: Retrieve customers with orders based on range");
			System.out.println("9: Exit program");
			System.out.print("\nEnter your selection:  ");
		
			input = selection.nextInt();
		
			//if statements to call correct methods based on selection
			if (input == 1) {
				totalCount = addMultipleCustomers(customerNames, customerIDs, customerSales, totalCount);
			} else if (input == 2) {
				totalCount = addSingleCustomers(customerNames, customerIDs, customerSales, totalCount);
			} else if (input == 3) {
				displayAllCustomers(customerNames, customerIDs, customerSales, totalCount);
			} else if (input == 4) {
				retrieveCustomer(customerNames, customerIDs, customerSales, totalCount);
			} else if (input == 5) {
				retrieveOrderRange(customerNames, customerIDs, customerSales, totalCount);
			}

		} while (input != 9);
		
		//Print end message
		System.out.println("\nThank you. Good bye.");

	}

	//addMultipleCustomers method
	public static int addMultipleCustomers (String [] customerNames, int [] customerIDs, float [] customerSales, int totalCount) {
		
		//Initialize variables
		int count = 0;
		int numCustomers = 0;
		String customerName;
		int customerID;
		float customerSale;
		
		//Open scanners
		Scanner scanNum = new Scanner(System.in);
		Scanner scanCustomerName = new Scanner(System.in);
		Scanner scanCustomerID = new Scanner(System.in);
		Scanner scanCustomerTotal = new Scanner(System.in);
		
		//Prompt user for input
		System.out.print("\nEnter the number of customers you want to load: ");
		numCustomers = scanNum.nextInt();
		
		//Do-while to collect customer data
		do {
			System.out.print("\nEnter customer name: ");
			customerName = scanCustomerName.nextLine();
			System.out.print("\nEnter customer ID: ");
			customerID = scanCustomerID.nextInt();
			System.out.print("\nEnter customer total sales: ");
			customerSale = scanCustomerTotal.nextFloat();
			
			
			//Set input data into correct array and index for new customers
			customerNames[totalCount] = customerName;
			customerIDs[totalCount] = customerID;
			customerSales[totalCount] = customerSale;					
			totalCount++;			
			count++;
			
		} while (count < numCustomers);
		
		//Return totalCount
		return totalCount;
	}
	
	//addSingleCustomers method
	private static int addSingleCustomers(String[] customerNames, int[] customerIDs, float[] customerSales, int totalCount) {
		
		//Initialize variables
		String customerName;
		int customerID;
		float customerSale;
		
		//Open Scanners
		Scanner scanNum = new Scanner(System.in);
		Scanner scanCustomerName = new Scanner(System.in);
		Scanner scanCustomerID = new Scanner(System.in);
		Scanner scanCustomerTotal = new Scanner(System.in);
		
		//Prompt user for customer data
		System.out.print("\nEnter customer name: ");
		customerName = scanCustomerName.nextLine();
		System.out.print("\nEnter customer ID: ");
		customerID = scanCustomerID.nextInt();
		System.out.print("\nEnter customer total sales: ");
		customerSale = scanCustomerTotal.nextFloat();
		
		//Set input data into correct array and index
		customerNames[totalCount] = customerName;
		customerIDs[totalCount] = customerID;
		customerSales[totalCount] = customerSale;
		
		totalCount++; 
		
		//Return totalCount
		return totalCount;
	}
	
	//displayAllCustomers method
	private static void displayAllCustomers(String[] customerNames, int[] customerIDs, float[] customerSales, int totalCount) {
	
		System.out.println("Line\tName\t\t\tID\tTotal Sales\n");
		
		//For loop to display all customers
		for (int i = 0; i < totalCount; i++) {
			System.out.println((i+1) + "\t" + customerNames[i] + "\t\t" + customerIDs[i] + "\t" + customerSales[i]);
		}
	}

	//retrieveCustomer method
	private static void retrieveCustomer(String[] customerNames, int[] customerIDs, float[] customerSales, int totalCount) {
	
		//Prompt user for Customer ID
		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter the customer ID: ");
		int searchID = scan.nextInt();
	
		//For loop to find ID and print data
		for (int i = 0; i < totalCount; i++) {
			if (searchID == customerIDs[i]) {
				System.out.println("ID\tName\t\t\tTotal Sales\n");
				System.out.println(customerIDs[i] + "\t" + customerNames[i] + "\t" + customerSales[i]);
				break;
			}
		}
				
	}

	//retrieveOrderRange method
	private static void retrieveOrderRange(String[] customerNames, int[] customerIDs, float[] customerSales, int totalCount) {
	
		//Prompt user for min and max totals for range query
		Scanner minTotal = new Scanner(System.in);
		System.out.print("\nEnter the lowest sales total for range: ");
		float min = minTotal.nextFloat();
	
		Scanner maxTotal = new Scanner(System.in);
		System.out.print("\nEnter the highest sales total for range: ");
		float max = maxTotal.nextFloat();
	
		System.out.println("\n\nLine\tName\tID\tTotal Sales\n");
	
		//For loop to find sales values within the range
		for (int i = 0; i < totalCount; i++) {
			if ((min <= customerSales[i]) && (customerSales[i] <= max)) {
				System.out.println((i+1) + "\t" + customerNames[i] + "\t" + customerIDs[i] + "\t" + customerSales[i]);
			}
		}
	
	}
}
