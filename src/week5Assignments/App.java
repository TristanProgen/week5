package week5Assignments;

public class App {

	public static void main(String[] args) {
		
		// instantiating a AsteriskLogger object 
		Logger astlgr = new AsteriskLogger();
		
		// passing the log method of the AsteriskLogger object a string 
		astlgr.log("AsteriskTest-Log");
		
		
		// adding some white space for better readability 
		System.out.println("\n" + "\n");
		
		
		// passing the error method of the AsteriskLogger object  a string 
		astlgr.error("AsteriskTest-Error");
		
		
		// adding some white space for better readability 
		System.out.println("\n" + "\n");

		
		// instantiating a SpacedLOgger object 
		Logger splgr = new SpacedLogger();
		
		
		// passing the log method of the SpacedLogger object a string 
		splgr.log("SpacedLoggerLogTest");
		
		// adding some white space for better readability 
		System.out.println("\n" + "\n");
		
		// passing the error method of the SpacedLogger object  a string 
		splgr.error("SpacedLoggerErrorTest");
		
		
	}

}


