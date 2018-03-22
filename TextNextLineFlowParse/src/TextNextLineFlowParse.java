// Wed � Week 1
/* TextNextLineFlowParse.java
 * Author: Derek Christensen
 * Date: 20180319
 * This program demonstrates the Scanner class.
*/

import java.util.Scanner;  // Needed for the Scanner class

/**
   This program demonstrates the Scanner class.
*/

public class TextNextLineFlowParse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name;         // To hold a name
	      int hours;           // Hours worked
	      double payRate;      // Hourly pay rate
	      double grossPay;     // Gross pay
	      
	    // Create a Scanner object to read input.
	      Scanner keyboard = new Scanner(System.in);
	/*
	    // Get the user's name.
	      System.out.print("What is your name? ");
	      name = keyboard.nextLine();
	*/      
	    // Get the number of hours worked this week.
	      System.out.print("How many hours did you work this week? ");
		  //hours = keyboard.nextInt();
	      hours = Integer.parseInt(keyboard.nextLine());

	    // Get the user's hourly pay rate.
	      System.out.print("What is your hourly pay rate? ");
	      //payRate = keyboard.nextDouble();
	      payRate = Double.parseDouble(keyboard.nextLine());
	      
	      //keyboard.nextLine();   //without this line program will not work
	      
	   // Get the user's name.
	      System.out.print("What is your name? ");
	      name = keyboard.nextLine();

	    // Calculate the gross pay.
	      grossPay = hours * payRate;
	      
	    // Display the resulting information.
	      System.out.println("Hello, " + name);
	      System.out.println("Your gross pay is $" + grossPay);

	} 

}
