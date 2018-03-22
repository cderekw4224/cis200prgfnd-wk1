// Fri – Week 1
/* Minimum.java
 * Author: Derek Christensen
 * Date: 20180320
*/

/**
   Finding smallest number from a series of numbers
*/

import java.util.*;

public class Minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 10 numbers.");
		System.out.println("Press Enter after each one.");
		
		int min = Integer.parseInt(s.nextLine());
		for (int i = 1; i < 10; i++) {
			int next = Integer.parseInt(s.nextLine());
			if (next < min) min = next;
		}
		System.out.println("Smallest: " + min);
		
	}  //end main

}  //end class
