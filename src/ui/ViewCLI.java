package ui;

import clint.Slig;
import clint.Slog;

import java.io.*;
import java.util.*;

public class ViewCLI implements interfaces.ViewCLI {
	
	private Slig si;
	private Slog so;
	private String fileName = "src/res/default.txt";
	private ArrayList<String> fileContents = new ArrayList<String>();
	private int fileLength = 0;
	private File file;
	private boolean running = true;
	
	public ViewCLI(Slig si, Slog so) {
		this.si = si;
		this.so = so;
		
		fileContents.add("The first line is a zdooobm.");
		++fileLength;
		fileContents.add("Second lines are sore in the butt cheeks.");
		++fileLength;
		fileContents.add("33333 Studnets!");
		++fileLength;
	}
	
	@Override
	public void drawProgramContent() {
		so.print(" FILE | ");
		so.println(fileName);
		so.println("---------------------------------------------------------");
		int lineNumber = 0;
		Iterator it = fileContents.iterator();
		while (it.hasNext()) {
			so.print(Integer.toString(lineNumber) + " |  ");
			so.println((String) it.next());
			++lineNumber;
		}
		so.println("---------------------------------------------------------");
		
		try {
			getCommandInput();
			BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
			it = fileContents.listIterator();
			while (it.hasNext()) {
				String print = (String) it.next();
				bw.write(print);
				bw.newLine();
			}
			bw.close();
		}
		catch (IOException ioe) {
			so.slog("An error occurred retrieving user input.");
		}
		catch (NoSuchElementException nsee) {
			so.slog("An error occurred, the user input was empty.");
		}
	}
	
	@Override
	public void getCommandInput() throws IOException, NoSuchElementException {
		String input = si.getUserInput().stripLeading();
		StringTokenizer st = new StringTokenizer(input);
		
		// Get the command, line position, content, and where the text begins.
		String command = st.nextToken();
		int position = 0;
		String content;
		int length = 0;
		
		// Detect if there is a position given
		try {
			String tok = st.nextToken();
			position = Integer.parseInt(tok);
			length += tok.length();
		}
		catch (NumberFormatException nfe) {
			// No position detected, position defaults to the last line
			so.slog("Defaulting to the last line.");
			position = fileLength;
		}
		
		// Get the command
		if (command.stripLeading().charAt(0) == 'a') {
			if (command.length() > 1 && command.charAt(1) == '+') {
				so.slog("Appending");
				length += 2;
				++position;
			}
			else {
				so.slog("Inserting");
				length += 1;
			}
			
			// Try getting the length from the content token
			content = st.nextToken();
			length = input.indexOf(content);
			
			content = input.substring(length);
			
			// If we default then append, bad things, so stop it.
			if (position > fileLength) {
				position = fileLength;
			}
			fileContents.add(position, content);
			++fileLength;
		}
		else {
			so.slog("No command given.");
		}
		
	}
	
	@Override
	public void openFile(String fileName) throws FileNotFoundException {
		file = new File(fileName);
		Scanner sc = new Scanner(file);
		while (sc.hasNextLine()) {
			fileContents.add(sc.nextLine());
			++fileLength;
		}
	}
	
	@Override
	public void start() {
		so.slog("View CLI started.");
		so.slog("File opening...");
		try {
			openFile(fileName);
		}
		catch (FileNotFoundException e) {
			so.slog("File could not be opened.");
		}
	}
	
	@Override
	public void loop() {
		while (running) {
			so.slog("Enter command...");
			drawProgramContent();
		}
	}
	
	@Override
	public void end() {
		so.slog("Program ending.");
	}
	
	
}
