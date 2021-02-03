package interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface View {
	
	public enum Commands {
		ADD,
		DELETE,
		REPLACE,
		INSERT,
		CLEAR,
		MODIFY
	};
	
	public void drawProgramContent();
	
	public void getCommandInput() throws IOException;
	
	public void openFile(String fileName) throws FileNotFoundException;
	
	public void start();
	
	public void loop();
	
	public void end();
	
}
