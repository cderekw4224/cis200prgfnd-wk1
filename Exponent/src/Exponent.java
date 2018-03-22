// Fri – Week 1
/* Exponent.java
 * Author: Derek Christensen
 * Date: 20180320
*/

/**
   Calculating exponent from given base and exponent.
*/

import java.util.*;

public class Exponent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter base: ");
		int b = Integer.parseInt(s.nextLine());
		System.out.print("Enter exponent: ");
		int n = Integer.parseInt(s.nextLine());
		
		int exp = 1;
		for (int i = 0; i < n; i++) {
			exp *= b;
		}
		System.out.println(b + "^" + n + " = " + exp);
		
	}  //end main

}  //end class
