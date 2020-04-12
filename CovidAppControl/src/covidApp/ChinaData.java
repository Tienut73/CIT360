package covidApp;

import java.util.HashMap;
import java.util.Scanner;

// Each command has a contract interface.
public class ChinaData implements ShowMethodInterface {
	
	@Override
	public Object handleIt(HashMap<String, Object> data) {
	
		System.out.println("3/31/20 Data:"
				+ " Country: China"
				+ " COVID-19 Cases: 81,518"
				+ " COVID-19 Deaths: 3,305");

		Scanner scannerChina = (Scanner) data.get("scannerChina");
		return scannerChina;

		}
	}

