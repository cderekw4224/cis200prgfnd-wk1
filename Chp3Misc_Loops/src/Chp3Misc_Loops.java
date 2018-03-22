// Fri – Week 1
/* Chp3Misc_Loops.java
 * Author: Derek Christensen
 * Date: 20180320
*/

/**
   Practice Loops 
*/

import java.util.Scanner;  // Needed for the Scanner class

public class Chp3Misc_Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		
	// WHILE LOOPS
		
		int sum = 0; // keep track of sum
		int count = 0;  // keep track of how many elements we've asked for
		
		Scanner s = new Scanner(System.in);
		
		// keep looping while we haven't asked for 100 (10) elements
		while (count < 10) {
			// ask for next number
			System.out.print("Enter a number: ");
			int num = Integer.parseInt(s.nextLine());
			
			// only add the number if it is positive
			if (num > 0) {
				// add the number to the current sum
				sum += num;
				// add one to our count
				count += 1;
			}  // end if
			
			// otherwise, print an error
			else {
				System.out.println(num + " is not positive");
			}  // end else
			
		}  // end while
		
		// loop is over - sum now hold the sum of 100 (10) values
		
		// print the sum
		System.out.println("The sum is: " + sum);
*/
/*	
	// DO-WHILE LOOP
		
		int num, sum;  // declare several variables of the same type
		
		Scanner s = new Scanner(System.in);
		sum = 0;
		do {
			System.out.print("Enter an integer: ");
			num = Integer.parseInt(s.nextLine());
			sum += num;
		} while (num != 0);
		
		System.out.println("The sum is " + sum);
*/
/*
	// FOR LOOP
		// Equivalent While Loop adds numbers from 1 to 4:
		int tot = 0, count = 1;
		while (count < 5) {
			tot += count;
			count += 1;
		}
		System.out.println("Sum: " + tot);
		
		int sum = 0;
		for (int num = 1; num < 5; num++) {
			sum += num;
		}
		System.out.println("The sum is " + sum);
		
		for (int num = 1; num <= 20; num+=2) {
			System.out.println(num);
		}
*/
/*
	// BREAK
		int sum = 0, count = 0;
		Scanner s = new Scanner(System.in);
		while (count < 10) {
			System.out.print("Enter a number: ");
			int num = Integer.parseInt(s.nextLine());
			sum += num;
			
			// Exit loop if num was 0
			if (num == 0) break;
			count++;
		}
		
		System.out.println("Sum is: " + sum);
*/
/*		
	// CONTINUE
		int sum = 0, count = 0;
		Scanner s = new Scanner(System.in);
		while (count < 10) {
			System.out.print("Enter a number: ");
			int num = Integer.parseInt(s.nextLine());
			
			// Ask for next number if a negative number is entered
			if (num < 0) continue;
			sum += num;
			count++;
			
		}
		
		System.out.println("Sum is: " + sum);
*/
/*		
	// VARIABLE SCOPE
		// now num is visible everywhere in this code fragment
		int num = 0;
		int sum = 0, count = 0;
		Scanner s = new Scanner(System.in);
		while (count < 10) {
			System.out.print("Enter a number: ");
			num = Integer.parseInt(s.nextLine());
			sum += num;
			count++;
			
		}
		
		System.out.println("The last numner was: " + num);
		System.out.println("The sum is: " + sum);
*/		
/*		
	// REDECLARING VARIABLES
		int num = 10;
		int count = 0, sum = 0;
		while (count < 5) {
			num = 2;
			sum += num;
			count += num;
		}
		
		System.out.println(num);
		System.out.println(sum);
*/
		
	// NESTED LOOPS
		/*
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		/*
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		*/
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		
	// FACTORING A NUMBER
		
		
		
	
		
		
		

	}  // end main

} // end class
