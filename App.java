package week5Assignment;

import java.lang.System.Logger;

public class App {

	public static void main(String[] args) {
		
// instantiating two instances, ASTERISKLOGGER and SPACEDLOGGER that will implement the Logger instances.
		
		AsteriskLogger AL = new AsteriskLogger();
		AL.Log("Hello"); //prints log from asterisk class
		System.out.println();
		AL.Error("Hello"); // prints error from SpaceLogger
		System.out.println();
		
		SpacedLogger SL = new SpacedLogger();
		SL.Log("Hello"); // prints Log from SpaceLogger class
		System.out.println(); 
		SL.Error("Hello"); // prints the error message from SpaceLogger
		System.out.println();
	}

}

// Making interface for Logger
interface logger {
	// adding two void methods that take String as an argument to the Logger interface
	void Log(String str);
	void Error(String str);
}

class AsteriskLogger implements Logger { // the AsteriskLogger class implements the Logger interface
	public void Log(String str) {
		System.out.println("***" + str + "***"); // this will print the String (Hello) in-between the asterisks
	}
	
	public void Error(String str) { 
		String res = "***" + "Error: " + str + "***"; // to get the stars above and below the error message
		String stars = "";
		for (int i = 0; i < res.length(); i++) stars += "*";
		
		System.out.println( // prints out the pattern used to represent the error message with the stars above and below the String variable
				stars +
				"\n" + res +
				"\n" + stars
				);
	}
}

class SpacedLogger implements Logger { // the SpacedLogger class implements the Logger interface
	public void Log(String str) {
		for (int i = 0; i < str.length(); i++) {
			char curr = str.charAt(i);
			System.out.print(curr + " ");
		}
		System.out.println();
	}
	
	public void Error(String str) {
		System.out.println("Error: ");
		for (int i = 0; i < str.length(); i++) {
			char curr = str.charAt(i);
			System.out.print(curr + " ");
		}
		System.out.println();
	}
}
