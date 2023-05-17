package javaExceptions;

public class JavaExceptions {
	final static String nam = null;
	//JavaExceptions-->Throw and Throws-->How to handle this exceptions-->types of exceptions
		// final/finally/finalize-->most important question
		//try/catch/finally
	//Exception handling-->is one of the powerful mechanism to handle the runtime errors
	//types of exceptions
	/*
	 * Checked exceptions--> Compile time exceptions-->IOException,SQl Exception,Classnotfound exceptions etc.,
	 * Checked exceptions are checked at compile time
	 * Unchecked Exceptions--> Runtime Exceptions-->NullPoint Exception, ArrayindexoutofbioundExceptions, Arthemetic exceptions  etc.,
	 * unchecked exceptions are not checked at compile time
	 * Error--> Error is irrecoverable.-->OutofMemory,VirtualMachine, AssertionError
	 * 
	 * Handle this exception
	 * -->Try--Catch--Finally
	 * -->Throw and throws
	 * 
	 * important points to remember
	 * 1. Without try we cannot use other blocks
	 * 2. Multiple catch we can use, but first we need to add userdefined catch block
	 * 3. Finally block will execute compulsory, even if try/catch fails
	 */
	
	public static void main(String[] args) throws Exception {
		try {
			SystemExit();
		}
		
		catch(NullPointerException e) {
			throw new NullPointerException("This is Nullpoint exception");
		}
		/*
		finally {
			System.out.println("this is finally block");
		}
		*/
	}
	
	public static void SystemExit() {
		System.out.println("One");
		System.out.println("One");
		System.out.println("One");
		System.out.println("One");
		System.out.println("One");
		System.out.println("One");
		System.out.println("One");
		System.exit(0);
	}
}
