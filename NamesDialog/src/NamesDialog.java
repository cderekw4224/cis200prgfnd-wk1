// Fri – Week 1
/* NamesDialog.java
 * Author: Derek Christensen
 * Date: 20180320
*/

/**
	This program demonstrates using dialogs with
	JOptionPane.
*/

import javax.swing.JOptionPane;

public class NamesDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String firstName;     // The user's first name
		String middleName;    // The user's middle name
		String lastName;      // The user's last name
		
		firstName = JOptionPane.showInputDialog("What is " +
		                                        "your first name?");
		
		middleName = JOptionPane.showInputDialog("What is " +
		                                          "your middle name?");
		lastName = JOptionPane.showInputDialog("What is " +
		                                       "your last name?");
		
		JOptionPane.showMessageDialog(null, "Hello " +
		                              firstName + " " + middleName +
		                              " " + lastName);
		
		System.exit(0);

	}  // end main

}  // end class
