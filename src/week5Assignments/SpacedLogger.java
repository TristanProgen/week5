package week5Assignments;

public class SpacedLogger implements Logger{

	@Override
	
	/*
	 * The SpacedLogger should add a space or " " between each character of the String argument passed into its methods
	 * If the log method received “Hello” as an argument, it should print H e l l o
	 */ 
	public void log(String log) {
		StringBuilder sp = new StringBuilder();
		for (int i = 0 ; i < (log.length() -1 ); i ++) {
			sp.append(log.charAt(i));
			sp.append(" ");
			
		}
		sp.append(log.charAt(log.length() -1));
		System.out.println(sp);
		
		
		
		
	}

	@Override
	/*
	 * The error method should do the same, but with “ERROR:” preceding the spaced out input (i.e. ERROR: H e l l o)
	 */
	public void error(String error) {
		
		/**
		 * This code is the same code as the log method so we can reuse it 
	    StringBuilder sp = new StringBuilder();
		for (int i = 0 ; i < error.length(); i ++) {
			sp.append(error.charAt(i));
			sp.append(" ");
			
		}
		 */
		
		System.out.print("ERROR: ");
		this.log(error);
		
		
	}

}
