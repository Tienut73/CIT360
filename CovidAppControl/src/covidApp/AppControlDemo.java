package covidApp;

import java.util.HashMap;
import java.util.Scanner;

public class AppControlDemo {
	
	public AppControlDemo() {
		
	}

 public static void main( String[] args ) {
	 AppControl controller = new AppControl();
		Scanner scanner = new Scanner(System.in);		
	 
	 // A map of different commands and how to evoke.
	 try {
		 int action = -1;
			while (action != 0) {
				action = (int)controller.doCommand("displayMenu", GetCommandData("scanner", scanner));
				switch (action) {
				case 1:
					controller.doCommand("displayChinaData", GetCommandData("scannerChina", scanner));
					break;
				case 2:
					controller.doCommand("displayItalyData", GetCommandData("scannerItaly", scanner));
					break;
				case 3:
					controller.doCommand("displayAmericaData", GetCommandData("scannerAmerica", scanner));
					break;
				case 0:
					System.out.println("Goodbye");
					break;
				default:
					System.out.println("Invalid selection. Please try again.");
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			scanner.close();
		}
	}
 	public static HashMap<String, Object> GetCommandData(String key, Object value) {
		HashMap<String, Object> data = new HashMap<String, Object>();
		data.put(key, value);
		return data;
	 	}
 	}
