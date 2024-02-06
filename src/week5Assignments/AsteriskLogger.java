package week5Assignments;

public class AsteriskLogger implements Logger{

	@Override
	
	
	/**
	 * The log method on the AsteriskLogger 
	 * should print out the String it receives between 3 asterisks on either side of the String 
	 * For example, if the String passed in is “Hello”, 
	 * then it should print ***Hello*** to the console.
	 */
	public void log(String log) {
		
		System.out.println("***" + log + "***");
		
	}

	@Override
	
	/**
	 * The error method on the AsteriskLogger
	 * should print the String it receives inside a box of asterisks, 
	 * with the String preceded by the word “ERROR:”. 
	 * For example, if “Hello” is the argument, the following should be printed: 

	 ****************

	 ***Error: Hello***

	 ****************
	 *
	 *This method makes a better box than asked for by accounting for the length of the string  "Error: " to adjust the box size 
	 */
	public void error(String error) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < error.length() + 7 ; i ++) {
			sb.append("*");
		}
		
		System.out.println("***" + sb + "***");
		System.out.println("***" + "Error: " + error + "***");
		System.out.println("***" + sb + "***");

		
		
		
		
	}


	



}
