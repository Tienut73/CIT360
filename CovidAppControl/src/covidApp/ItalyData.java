package covidApp;

import java.util.HashMap;
import java.util.Scanner;

// Each command has a contract interface.
public class ItalyData implements ShowMethodInterface {
	
	@Override
	public Object handleIt(HashMap<String, Object> data) {

		System.out.println("3/31/20 Data:"
				+ " Country: Italy"
				+ " COVID-19 Cases: 105,792"
				+ " COVID-19 Deaths: 12,428");
		Scanner scannerItaly = (Scanner) data.get("scannerItaly");
		return scannerItaly;	}
}