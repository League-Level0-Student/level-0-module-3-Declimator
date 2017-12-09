
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "March 22nd";
		String dadsBirthday = "May 9th";
		String myBirthday = "July 27th";
		String brothersBirthday = "February 15th";

		// 2. Find out which birthday the user wants and and store their response in a variable
	String i = JOptionPane.showInputDialog("Who's birthday are you looking for?");
		// 3. Print out what the user typed
		System.out.println(i);
		// 4. if user asked for "mom"
			//print mom's birthday
		if(i.equalsIgnoreCase("mom")) {
			System.out.println(momsBirthday);
		}
		// 5. if user asked for "dad"
			// print dad's birthday
		else if(i.equalsIgnoreCase("dad")) {
			System.out.println(dadsBirthday);
		}
		// 6. if user asked for your name
			// print myBirthday
		else if(i.equalsIgnoreCase("me")) {
			System.out.println(myBirthday);
		}
		else if(i.equalsIgnoreCase("brother")) {
			System.out.println(brothersBirthday);
		}
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
		else {
			JOptionPane.showMessageDialog(null, "Sorry, I don't remember that person's birthday!");
			System.out.println("Sorry, I don't remember that person's birthday!");
		}
	} 
}
