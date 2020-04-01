package covidApp;

import java.util.Scanner;

public class AppControlDemo {

 public static void main( String[] args ) {
	 
	 // A map of different commands and how to evoke.
	 try (Scanner input = new Scanner(System.in)) {
		System.out.println("Type China, Italy, or America "
				+ "to see their cases of COVID-19.");
		 AppControl app = new AppControl();
		 app.dispatchRequest(input.next());
	 	}
 	}
}