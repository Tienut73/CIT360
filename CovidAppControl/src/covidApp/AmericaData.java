package covidApp;

import java.util.HashMap;
import java.util.Scanner;

// Each command has a contract interface.
public class AmericaData implements ShowMethodInterface {
	
	@Override
	public Object handleIt(HashMap<String, Object> data) {

		System.out.println("3/31/20 Data: "
				+ " Country: America"
				+ " COVID-19 Cases: 187,729"
				+ " COVID-19 Deaths: 3,867");
		Scanner scannerAmerica = (Scanner) data.get("scannerAmerica");
		return scannerAmerica;
	}

}