// Wed – Week 1
/* ChangeMaker.java
 * Author: Derek Christensen
 * Date: 20180319
 * Demonstrates the use of the modulus (%) operator
*/

import java.util.Scanner;   // Needed for Scanner class (input)

public class ChangeMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);   // create a Scanner object
		
		int amount, originalAmount, quarters, dimes, nickels, pennies;
		
		System.out.println("\tThis program outputs a combintion of coins");
		System.out.println("\tthat equals the amount of change for the number");
		System.out.println("\tentered in by the user. \n");
		
		System.out.print("Enter a whole number from 1 to 99: ");
		amount = Integer.parseInt(in.nextLine());
		
		originalAmount = amount;
		quarters = amount/25;
		amount = amount%25;
		dimes = amount/10;
		amount = amount%10;
		nickels = amount/5;
		amount = amount%5;
		pennies = amount;
		
		System.out.println(""); // Display a blank line
		System.out.println("0." + originalAmount 
				          + " cents in coins can be given as:");
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nickels + " nickels");
		System.out.println(pennies + " pennies");
		
		System.out.println("");  // display a blank line
		

	}  // end main

}  // end class
