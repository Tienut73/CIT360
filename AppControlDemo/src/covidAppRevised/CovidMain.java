/* package covidAppRevised;

import java.util.HashMap;
import java.util.Scanner;

import covidApp.AmericaData;
import covidApp.ChinaData;
import covidApp.ItalyData;

public class CovidMain {
	
	public CovidMain() {
	}

	public static void main(String[] args) {
		CovidAppController controller = new CovidAppController();
		Scanner scanner = new Scanner(System.in);
		ChinaData myChinaData = new ChinaData();
		ItalyData myItalyData = new ItalyData();
		AmericaData myAmericaData = new AmericaData();
		
		try {
			int action = -1;
			while (action != 0) {
				action = (int)controller.doCommand("displayMenu", GetCommandData("scanner", scanner));
				switch (action) {
				case 1:
					controller.doCommand("displayChinaData", GetCommandData("ChinaData", myChinaData));
					break;
				case 2:
					controller.doCommand("displayItalyData", GetCommandData("ItalyData", myItalyData));
					break;
				case 3:
					controller.doCommand("displayAmericaData", GetCommandData("AmericaData", myAmericaData));
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

	}
	*/
