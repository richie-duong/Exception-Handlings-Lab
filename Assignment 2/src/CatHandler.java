/**
 * CatHandler class for Assignment 2 Submission
 * 
* This is a test class that demonstrates the use of exception handling with inheritance concepts.
* Nested classes were declared and all essentially inherits from the Exception superclass.
* In more detail: ExceptionGammer extends ExceptionBeta, while ExceptionBeta extends ExceptionAlpha. Finally, ExceptionAlpha extends the Exception class.
* 
* @author Richard Duong
* @version 1.1
* @since javac 11.0.12
*/
public class CatHandler {
	
	/**
	 * First nested class that inherits from Exception superclass. To be used to throw exception when called in the third try block in method main(). The third catch block catches the thrown exception.
	 * @author Richard Duong
	 */
	static class ExceptionAlpha extends Exception {	}
	
	/**
	 * Second nested class that inherits from ExceptionAlpha subclass. To be used to throw exception when called in the second try block in method main(). The third catch block catches the thrown exception.
	 * @author Richard Duong
	 */
	static class ExceptionBeta extends ExceptionAlpha { }
	
	/**
	 * First nested class that inherits from ExceptionBeta subclass. To be used to throw exception when called in the third try block in method main(). The first catch block catches the thrown exception.
	 * @author Richard Duong
	 */
	static class ExceptionGammer extends ExceptionBeta { }
	
	/**
	 * The Main method contains three try-catch blocks and executes each of the blocks.
	 *  
	 * The first try block throws ExceptionGammer(), a subclass that inherits from Exception superclass. The first catch block catches the exception the subclass inherited from ExceptionBeta, 
	 * and prints a customized error message that describes where the the exception was caught along with the printStackTrace().
	 * 
	 * The second try block throws ExceptionBeta(), a subclass that inherits from Exception superclass. The following catch block catches the exception it inherited from ExceptionAlpha, 
	 * and prints a customized error message that describes where the the exception was caught along with the printStackTrace().
	 * 
	 * The third try block throws ExceptionAlpha(), a subclass that inherits from Exception superclass. The following catch block catches the exception it inherited from Exception superclass, 
	 * and prints a customized error message that describes where the the exception was caught along with the printStackTrace().
	 * 
	 * In total, there will be three Exception warnings displayed in Console for the three specified subclasses mentioned above.
	 * 
	 * @param args - Stores Java Command Line Arguments
	 */
	public static void main(String[] args) {
		
		try {
			throw new ExceptionGammer();
		}
		catch (Exception ex) {
			System.err.println("ExceptionGammer subclass was thrown...");
			System.err.println("Gammer Exception was caught by main()");
			ex.printStackTrace();
		}
		
		try {
			throw new ExceptionBeta();
		}
		catch (Exception ex) {
			System.err.println("ExceptionBeta subclass was thrown...");
			System.err.println("Beta Exception was caught by main()");
			ex.printStackTrace();
		}
		
		try {
			throw new ExceptionAlpha();
		}
		catch (Exception ex) {
			System.err.println("ExceptionAlpha subclass was thrown...");
			System.err.println("Alpha Exception was caught by main()");
			ex.printStackTrace();
		}
	}
}


