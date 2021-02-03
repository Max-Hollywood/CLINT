/**
 * CLINT - Command Line Interface aNd Text
 * <p>
 * Author - Max Hollywood Copyright 2020
 * <p>
 * License - open source, contact for specifics
 * <p>
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
public class Driver {
	static Slig si = new Slig();
	static Slog so = new Slog();
	
	/**
	 * Main method. Starts the user interface, which can be command line or
	 * graphical.
	 *
	 * @param args - no parameters accepted
	 */
	public static void main(String[] args) {
		
		// Dependency Injection / View
		View view = new ViewCLI(si, so);
		// View view = new ViewGUI();
		
		view.start();
		view.loop();
		view.end();
	}
	
}
