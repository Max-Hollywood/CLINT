/**
 * Handles the user input and returns it to the program.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Slig is an input handling class that asks for user input, parses it, and returns it to the caller.
 */
public class Slig {
	
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public String getUserInput() throws IOException {
		String input = br.readLine();
		return input;
	}
	
}
