/**
 * CLINT - Command Line Interface N Text
 * 
 * Author - Max Hollywood
 * Copyright 2020
 * 
 * License - open source, contact for specifics
 * 
 * Purpose - recently graduated, looking for work.  Spent some time on holidays now getting back into the action.
 */

package clint;

import interfaces.View;
import ui.ViewCLI;

/**
 * Starts the CLINT window.
 * 
 * @author Max
 *
 */
public class Driver
{

	/**
	 * Main method. Starts the user interface, which can be command line or
	 * graphical.
	 * 
	 * @param args - no parameters accepted
	 */
	public static void main(String[] args)
	{

		// TODO Auto-generated method stub
		System.out.println("Main, eclipse sucks");

		// Dependency Injection / View
		View view = new ViewCLI();
		// View view = new ViewGUI();
	}

}
