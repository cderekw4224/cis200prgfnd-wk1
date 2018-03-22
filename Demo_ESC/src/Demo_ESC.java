// Wed – Week 1
/* Demo_ESC.java
 * Author: Derek Christensen
 * Date: 20180319
 * Demo the use of Escape Characters \t, \n, \", \\
 * 	--Some older compiler may require \'
*/

import java.util.Scanner;  // or import jave.util.*

public class Demo_ESC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// Demo use of escape characters
		System.out.println("Your friend says 'Hi'");
		System.out.println("Lincoln was know as \"Honest Abe\" to many\n\n\n");
		System.out.println("\tSpaces added by using tab (\\t) and newline (\\n)\n");
		
	// p. 37 - Code Listing 2-6
		
		System.out.print("These are our top sellers:\n");
		System.out.print("\tComputer games\n\tCoffee\n ");
		System.out.println("\tAspirin");
		
		
		System.out.println("These are out top sellers:\n"
				          + "\tComputer games\n\tCoffee\n "
				          + "\tAspirin");
			
	// String Concatenation
		System.out.println("The following will be printed " +
                "in a tabbed format: " +
                "\n\tFirst = " + 5 * 6 + ", " +
                "\n\tSecond = " + (6 + 4) + "," +
                "\n\tThird = " + 16.7 + "."); 


	}  // end main

}  // end class

