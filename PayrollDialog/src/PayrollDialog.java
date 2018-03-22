// Fri – Week 1
/* PayrollDialog.java
 * Author: Derek Christensen
 * Date: 20180320
*/

/**
	This program demonstrates using dialogs with
	JOptionPane. Converts string input to numeric.
*/

import javax.swing.JOptionPane;

public class PayrollDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String inputString;     // For reading input
		String name;            // The user's name
		int hours;              // The number of hours worked
		double payRate;         // The user's hourly pay rate
		double grossPay;        // The user's gross pay
		
		name = JOptionPane.showInputDialog("What is " +
		                                   "your name?");
		
		inputString = JOptionPane.showInputDialog("How many hours " +
				                                  "did you work this week?");
		
		hours = Integer.parseInt(inputString);
		
		inputString = JOptionPane.showInputDialog("What is your " +
		                                          "hourly pay rate?");
		
		payRate = Double.parseDouble(inputString);
		
	// Calculate the gross pay.
		
		grossPay = hours * payRate;
		
		JOptionPane.showMessageDialog(null, "Hello " +
		                              name + ". Your gross pay is $" + 
				                      grossPay);
		
		System.exit(0);

	}  // end main

}  // end class
