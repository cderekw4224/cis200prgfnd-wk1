// Lab 1 � Week 1
/* Lab1Conditionals.java
 * Author: Derek Christensen
 * Date: 20180321
*/

/**
   Calculating factorial given n.
*/

import java.util.Scanner;   // Needed for Scanner class (input)
import java.text.DecimalFormat;  // Needed for formatting numbers

public class Lab1Conditionals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);   // create a Scanner object
		
		final int A = 4, B = 3, C = 2, D = 1, F = 0;  //constants for grade values
		int hours = 0, points = 0;  //initiate class hours and points
		int cumHours = 0;  //total semester hours
		int cumPoints = 0;  //total semester points
		char grade = 'Z';  //letter grade received for class
		double gpa;  //gpa for the semester
		
		
		String message = "Java is Great Fun!";
		String upper = message.toUpperCase();
		System.out.printf("%s\n", message);
		System.out.printf("%s\n", upper);
		
		for (int i = 1; i < 5; i++) {
			
			grade = 'Z';  //re-initialize grade to non-acceptable value
			
			//have user enter number of credit hours
			System.out.print("Enter class " + i + " credit hours: ");
			hours = Integer.parseInt(in.nextLine());
			cumHours += hours;
			
			//while ((grade != 'A') || (grade != 'B') || (grade != 'C') ||
			//		(grade != 'D') || (grade != 'F')) {
				
			while (grade < 'A' || grade > 'F' || grade == 'E') {	
				//have user enter the letter grade received
				System.out.print("Enter class " + i + " letter grade: ");
				String response = (in.nextLine()).toUpperCase();
				grade = response.charAt(0);
				
				System.out.println("Grade entered is: " + grade);
				//grade = (in.nextLine()).charAt(0);
				//grade = grade.toUpperCase();
				
			}  //end while
			
			switch(grade) {
			    //case 'a':
			    case 'A':
			    	points = A;
			    	break;
			    //case 'b':
			    case 'B':
			    	points = B;
			    	break;
			    //case 'c':
			    case 'C':
			    	points = C;
			    	break;
			    //case 'd':
			    case 'D':
			    	points = D;
			    	break;
			    //case 'f':
			    case 'F':
			    	points = F;
			    	break;
		    	default:
		    		System.out.println("Invalid choice.");    
			}  //end switch
			
			//calculate total number of grade points for the semester
			cumPoints += hours * points;
			
		} //end for
		
		//calculate gpa
		gpa = (double)cumPoints / cumHours;
		
		//display the resulting semester gpa
	    System.out.printf("GPA for the semester is: %.2f\n", gpa);
	    

	}  //end main()

}  //end Class
