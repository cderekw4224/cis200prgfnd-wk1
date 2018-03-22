// Fri – Week 1
/* Factor.java
 * Author: Derek Christensen
 * Date: 20180320
*/

/**
   Factoring a number
*/

import java.util.*;

public class Factor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number to factor: ");
		int num = Integer.parseInt(s.nextLine());
		
		System.out.print(num + " = ");
		
		//We will divide factors out of cur as we find them
		int cur = num;
		
		//For each possible factor i
		for (int i = 2; i <= num-1; i++) {
			//as long as i keeps dividing in evenly
			while (cur % i == 0) {
				//print the factor and divide it out
				System.out.print(i + " ");
				cur /= i;
				if (cur != 1) System.out.print("* ");
			}
		}
		
		if (cur == num) {
			System.out.println("prime");
		}
		else {
			System.out.println();
		}

	}  //end main

}  //end class
