import java.io.IOException;

/**
 * MAIN
 **/

// Stuff


public class Main {
	
	public static void main(String[] args) {
		Slig si = new Slig();
		Slog so = new Slog();
		
		so.slog("Write something.");
		
		try {
			so.slog("stuff: " + si.getUserInput());
		}
		catch (IOException ioe) {
			so.slog("error");
		}
	}
	
}



