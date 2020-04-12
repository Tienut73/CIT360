package covidApp;

import java.util.HashMap;
import java.util.Scanner;

public class DisplayMenu implements ShowMethodInterface {
		
		public DisplayMenu() {
			
		}
		
		@Override
		public Object handleIt(HashMap<String, Object> data) {
			
			System.out.println("Menu:");
			System.out.println("\t1-China Data");
			System.out.println("\t2-Italy Data");
			System.out.println("\t3-America Data");
			System.out.println("\t0-Exit");
			System.out.println("Selection(1,2,3, or 0:)");
			
			Scanner scanner = (Scanner) data.get("scanner");
			int selection = GetNextInt(scanner);
			return selection;	
			
		}

		private int GetNextInt(Scanner scanner) {
			String input = scanner.nextLine();
			try {
				int result = Integer.parseInt(input);
				return result;
				
			} catch (Exception e) {
				System.out.println("Please enter a number from the menu.");
				return -1;
				
			}
	 	}
	}
