/**
 * Text Operations
 **/

// Interface outlining textual operations.
public interface TextOps {
	
	/**
	 * Adds a new line of text into the document, either before or after the specified line position (if a line already
	 * exists there).  A new line is entered regardless of any content.
	 *
	 * @param position int
	 * @param content  String
	 * @param before   boolean
	 */
//	addLine(int position, String content, boolean before);
	
	/**
	 * Removes a line of text from the document, either deleting the line or just clearing it of text and keeping the
	 * line.
	 *
	 * @param position int
	 * @param keep     boolean
	 */
//	delLine(int position, boolean keep) throws IndexOutOfBoundsException;
	
	/**
	 * Removes text of a line and replaces it with new content.
	 *
	 * @param position int
	 * @param content  String
	 */
//	repLine(int position, String content) throws IndexOutOfBoundsException;
	
	/**
	 * Adds text to the position inside the line.
	 *
	 * @param position int
	 * @param content  String
	 */
//	addText(int position, String content) throws IndexOutOfBoundsException;
	
	/**
	 * Deletes text in the line at the starting position, to the end position.
	 *
	 * @param positionStart int
	 * @param positionEnd   int
	 */
//	delText(int positionStart, int positionEnd) throws IndexOutOfBoundsException;
	
	/**
	 * Removes text from a position in a line and replaces it with new content.
	 *
	 * @param positionStart int
	 * @param positionEnd   int
	 * @param content       int
	 */
//	repText(int positionStart, int positionEnd, String content) throws IndexOutOfBoundsException;
	
}
