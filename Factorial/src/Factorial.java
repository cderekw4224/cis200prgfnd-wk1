// Fri – Week 1
/* Factorial.java
 * Author: Derek Christensen
 * Date: 20180320
*/

/**
   Calculating factorial given n.
*/

import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter a positive integer bound: ");
		int bound = Integer.parseInt(s.nextLine());
		if (bound >= 1) {
			int n = bound;
			for (int i = 1; i <= n; i++) {
				int fact = 1;
				for (int j = i; j >= 1; j--) {
					fact *= j;
				}
				System.out.println(i + "! = " + fact);
			}
		}
		else {
			System.out.println("Bound must be positive.");
		}

	}  //end main

}  //end class
