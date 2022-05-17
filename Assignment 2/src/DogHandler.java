import java.io.IOException;
import java.util.Scanner;

/**
 * DogHandler class for Assignment 2 Submission
 * 
* This is a test class that demonstrates the use of exception handling for Part 2 of the assignment.
* Two Nested classes were declared and both essentially inherits from the Exception superclass.
* In more detail: ExceptionPuppy extends ExceptionDog, while ExceptionDog extends Exception superclass.
* 
* @author Richard Duong
* @version 1.1
* @since javac 11.0.12
*/
public class DogHandler {
	
	/**
	 * First nested class that inherits from Exception superclass. To be used to throw exception when called in case 1's try block in method main(). The following catch block catches the thrown 
	 * exception.
	 * @author Richard Duong
	 */
	static class ExceptionDog extends Exception { }
	
	/**
	 * Second nested class that inherits from ExceptionDog subclass. To be used to throw exception when called in case 2's try block in method main(). The following third catch block catches the 
	 * thrown exception.
	 * @author Richard Duong
	 */
	static class ExceptionPuppy extends ExceptionDog { }
	
	/**
	 * Main method contains code that declares a scanner for the purpose of creating a menu that prompts the user to select which block of try/catch to execute. 
	 * The user must select by entering 1-4. It will loop until a sufficient number is entered.
	 * 
	 * [1] Entering 1 will execute a try block that calls on the exDog() method (which throws ExceptionDog subclass). The catch block catches the exception from the subclass and prints a 
	 * customized error message that describes where the the exception was caught along with the printStackTrace().
	 * 
	 * [2] Entering 2 will execute a try block that calls on the exPup() method (which throws ExceptionDog subclass). The catch block catches the exception from the subclass and prints a 
	 * customized error message that describes where the the exception was caught along with the printStackTrace().
	 * 
	 * [3] Entering 3 will execute a try block that calls on the exNull() method (which unlike the first two, throws NullPointerException superclass). The catch block catches the null pointer 
	 * exception from the superclass and prints a customized error message that describes where the the exception was caught along with the printStackTrace().
	 * 
	 * [4] Entering 4 will execute a try block that calls on the exIo() method (which throws IOException superclass). The catch block catches the IO exception from the superclass and prints a 
	 * customized error message that describes where the the exception was caught along with the printStackTrace().
	 * 
	 * All cases end with finally blocks that closes scanner "input".
	 * 
	 * @param args - Stores Java Command Line Arguments
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice = 0;
		
		do {
			System.out.println("[1]: ExceptionDog   [2]: ExceptionPuppy   [3]: NullPointerException   [4]: IOException");
			System.out.print("Select one of the exceptions above to throw (1 - 4): ");
			choice = input.nextInt();
		} while (choice < 1 || choice > 4);
		
		switch (choice) {
		case 1:
			try {
				exDog();
			}
			catch (Exception exception){
				System.err.println("exDog() method was called, throwing ExceptionDog subclass...");
				System.err.println("Dog Exception was caught by main()");
				exception.printStackTrace();
			}
			finally {
				input.close();
			}
			break;
		case 2:
			try {
				exPup();
			}
			catch (Exception exception){
				System.err.println("exPup() method was called, throwing ExceptionPuppy subclass...");
				System.err.println("Puppy Exception was caught by main()");
				exception.printStackTrace();
			}
			finally {
				input.close();
			}
			break;
		case 3:
			try {
				exNull();
			}
			catch (NullPointerException exception){
				System.err.println("exNull() method was called, throwing the Null Pointer Exception...");
				System.err.println("Null Pointer Exception was caught by main()");
				exception.printStackTrace();
			}
			finally {
				input.close();
			}
			break;
			
		case 4:
			try {
				exIo();
			}
			catch (IOException exception){
				System.err.println("exIo() method was called, throwing the IO Exception...");
				System.err.println("IO Exception was caught by main()");
				exception.printStackTrace();
			}
			finally {
				input.close();
			}
			break;
		}
		
	}
	
	/**
	 * This static method contains code that throws the ExceptionDog (which inherits from Exception superclass) nested class declared
	 * prior to the main method. It is then called within the first try block in main() and evidently caught in the first catch block.
	 * 
	 * @throws DogHandler.ExceptionDog - Throws ExceptionDog class
	 */
	public static void exDog() throws DogHandler.ExceptionDog {
		throw new ExceptionDog();
	}
	
	/**
	 * This static method contains code that throws the ExceptionPup (which directly inherits from ExceptionDog and ultimately the Exception superclass) nested class declared
	 * prior to the main method. It is then called within the second try block in main() and evidently caught in the second catch block.
	 * 
	 * @throws DogHandler.ExceptionPuppy - Throws ExceptionPuppy class
	 */
	public static void exPup() throws DogHandler.ExceptionPuppy {
		throw new ExceptionPuppy();
	}
	
	/**
	 * This static method contains code that throws the NullPointerException class. It is then called within the third try block in main() and evidently caught in the third catch block.
	 * 
	 * @throws NullPointerException - Throws NullPointerException subclass
	 */
	public static void exNull() throws NullPointerException {
		throw new NullPointerException();
	}
	
	/**
	 * This static method contains code that throws the IOException class. java.io.IOException is also imported for usage. It is then called within the fourth try block in main() 
	 * and evidently caught in the fourth catch block.
	 * 
	 * @throws IOException - Throws IOException subclass
	 */
	public static void exIo() throws IOException {
		throw new IOException();
	}

}
