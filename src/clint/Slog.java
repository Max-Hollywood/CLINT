package clint; /**
 * Outputs to the console.
 */


/**
 * Class responsible for printing everything to the console.
 */
public class Slog {
	
	/**
	 * Prints a message to the console.
	 *
	 * @param output String
	 */
	public void slog(String output) {
		System.out.println(" > " + output);
	}
	
	/**
	 * Print wrapper.
	 *
	 * @param output String
	 */
	public void print(String output) {
		System.out.print(output);
	}
	
	/**
	 * Println wrapper.
	 *
	 * @param output String
	 */
	public void println(String output) {
		System.out.println(output);
	}
	
}
