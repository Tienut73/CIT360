/* package covidAppRevised;

import java.util.HashMap;

import covidApp.AmericaData;
import covidApp.ChinaData;
import covidApp.ItalyData;

public class CovidAppController {
	private HashMap<String, CovidHandler> commands;
	
	public CovidAppController() {
		commands = new HashMap<String, CovidHandler>();
		commands.put("addChina", new ChinaData());
		commands.put("addItaly", new ItalyData());
		commands.put("addAmerica", new AmericaData());	
	}
	
	public Object doCommand(String commandKey, HashMap<String, Object> commandData) throws Exception {
		CovidHandler command = commands.getOrDefault(commandKey, null);
		if (command == null) {
			throw new Exception("There is no command with the key word '" + commandKey + "'.");	
		}
		
		return command.handleIt(commandData);
	}
}
*/
