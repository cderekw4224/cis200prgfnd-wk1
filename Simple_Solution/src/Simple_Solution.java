// Wed – Week 1
/* SimpleSolution.java
 * Author: Derek Christensen
 * Date: 20180319
 * This is just a simple program used to introduce the 
   fundamentals concepts of Java
*/

import java.util.Scanner;     // Needed for input
import java.text.DecimalFormat;  // Needed for formatting numbers

public class Simple_Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// System.out.println("Programming is great fun.");
		
		int favInt;
		favInt = 13;
		
		double decimalNumber = 24.598746;
		double result = favInt * decimalNumber;
		
		System.out.println("Favorite Number is " + favInt + ". Oh yeah!");
		System.out.println("Decimal Numner is " + decimalNumber);
		System.out.println("Result = " + result);
		
		System.out.println("13/5.0 = " + 13/5.0);
		System.out.println("13/5 = " + 13/5);
		System.out.println("5/10.0 = " + 5/10.0);
		System.out.println("5/10 = " + 5/10);
		
		System.out.println("13%5 = " + 13%5);
		System.out.println("5%10 = " + 5%10);
		
	// declaring a constant
		final int MAX = 5;
		
		Scanner s = new Scanner (System.in);
		
	// Read in a String input
		System.out.print("Enter your name: ");
		String name = s.nextLine(); // delaring/assigning variable
		System.out.println("Hello, " + name);
		
	// Read in an int
		System.out.print("Enter your favorite whole number: ");
		String response = s.nextLine();
		int favNumber = Integer.parseInt(response);
		System.out.println("favNumber = " + favNumber);
		
	// Read in an double
		System.out.print("Enter you favorite decimal number: ");
		response = s.nextLine();
		double favDecimal = Double.parseDouble(response);
		System.out.println("favDecimal = " + favDecimal);
		
	// Read in an character
		System.out.print("Enter a Y)es or N)o: ");
		response = s.nextLine();
		char ch = response.charAt(0);
		System.out.println("You entered " + ch);
		
	// formatting output
		DecimalFormat df = new DecimalFormat ("$#,###,###.00");
		double totalAmount = 32975.7895;
		System.out.println("Total owed: " + df.format(totalAmount));
		
	// printf - \n required for linefeed after displaying
		System.out.println("Total owed: $" + totalAmount);
		System.out.printf("Total owed: $%5.2f\n",  totalAmount);
		
	// printf - using to display multiple values - %d used for integers
		int radius = 3;
		double PI = 3.14159;
		double area = radius * radius * PI;
		System.out.printf("Circle with radius %d has area %.2f\n", radius, area);
		
	// String.format
		String output = String.format("Total owed: $%.2f", totalAmount);
		System.out.println(output);
	// can also combine statements
		System.out.println(String.format ("Total owed: $%.2f", totalAmount));

	}  // end main

}  // end class
