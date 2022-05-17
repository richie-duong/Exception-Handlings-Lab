
import java.io.IOException;

/**
* OrderHandler class for Assignment 2 Submission
* This is a test class that demonstrates the importance of having the correct arrangement of catch blocks.
* 
* @author Richard Duong
* @version 1.1
* @since javac 11.0.12
*/
public class OrderHandler {
	
	/**
	 * Main method contains two sets of a try block + two catch blocks. 
	 * The first set calls both methods within the try block, and catches the IOException within the first catch block and just the Exception in the second catch block.
	 * The second set calls both methods within the try block, but the Exception catch block occurs before the IOException catch block. This one results in a compilation error, and is commented
	 * out for the purpose of demoing the importance of having the correct arrangement of catch blocks.
	 * 
	 * @param args - Stores Java Command Line Arguments
	 */
	public static void main(String[] args) {
		
		//Exception ex = new Exception();
		//IOException io = new IOException();
		
		try {
			io();
			ex();
		}
		catch (IOException i) {
			System.err.println("IOException was thrown!");
			i.printStackTrace();
		}
		catch (Exception e) {
			System.err.println("Exception was thrown!");
			e.printStackTrace();
		}
		
		
		/*try {
		 	io();
			ex();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		catch (IOException i) {
			i.printStackTrace();
		}*/

	}
	
	/**
	 * This method only throws an exception, that is to be called within the try block in method main().
	 * @throws Exception - Throws exception superclass
	 */
	public static void ex() throws Exception {
		throw new Exception();
	}
	
	/**
	 * This method only throws an IOException, that is to be called within the try block in method main() with ex().
	 * @throws IOException - Throws exception subclass
	 */
	public static void io() throws IOException {
		throw new IOException();
	}
	

}
