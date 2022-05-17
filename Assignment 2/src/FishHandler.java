/**
 * FishHandler class for Assignment 2 Submission
 * 
* This is a test class that demonstrates the use of exception handling + re-throwing of an exception for Part 3 of the assignment.
* Unlike the previous two classes, there are no declared nested classes. Instead, methods throwing exceptions are declared.
* 
* @author Richard Duong
* @version 1.1
* @since javac 11.0.12
*/
public class FishHandler {
	
	/**
	 * The main method only consists of one try and catch block. The try block calls on method easterStarting() (which tries easterEnding(), catches its exception, and re-throws its exception),
	 * and catches the Exception and prints a customized error message that describes where the the exception was caught along with the printStackTrace().
	 * 
	 * The custom error messages in the try/catch blocks are placed in certain areas to demonstrate the flow of execution:
	 * The first custom error message was printed in the try block, informing the user that the block is calling on method easterStarting(). Once the line of codes in easterStarting() and beyond
	 * are executed, the exception from easterStarting() is then caught. Another custom error message informs the user that the exception is caught in the main method, then prints the stack trace.
	 * 
	 * @param args - Stores Java Command Line Arguments
	 */
	public static void main(String[] args) {
		try {
			System.err.println("[1] Starting from main(), calling on method easterStarting()...");
			easterStarting();
		}
		catch (Exception ex) {
			System.err.println("[6] Exception was caught in main method!");
			ex.printStackTrace();
		}
	}
	
	/**
	 * This method contains one line of code that throws an exception. The string "Thrown Exception!" is passed to indicate that the exception has been thrown. The only time that this method
	 * is called is within the try block of easterStarting().
	 * 
	 * @throws Exception - Throws exception superclass
	 */
	public static void easterEnding() throws Exception {
		throw new Exception("Thrown Exception!");
	}
	
	/**
	 * This method contains a try block that informs the user that this method was called and will not begin calling on method easterEnding().
	 * 
	 * The catch block then retrieves the message from the exception and informs the user that the stack trace will be printed.
	 * Finally, the user is informed via custom error message that the exception will be re-thrown. This re-throw will then be caught within the catch block inside method main().
	 * 
	 * @throws Exception - Throws exception superclass
	 */
	public static void easterStarting() throws Exception {
		try {
			System.err.println("[2] easterStarting() called and now calling on method easterEnding()...");
			easterEnding();
		}
		catch (Exception ex) {
			System.err.println("[3] " + ex.getMessage());
			System.err.println("[4] Caught exception and printing stack trace!");
			ex.printStackTrace();
			System.err.println("[5] Rethrowing exception...");
			throw ex;
		}
	}

}
