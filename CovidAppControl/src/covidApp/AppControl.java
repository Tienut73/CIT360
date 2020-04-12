package covidApp;

import java.util.HashMap;

public class AppControl {
		 
	private HashMap<String, ShowMethodInterface> commands;
		
		public AppControl() {
			commands = new HashMap<String, ShowMethodInterface>();
			commands.put("displayChinaData", new ChinaData());
			commands.put("displayItalyData", new ItalyData());
			commands.put("displayAmericaData", new AmericaData());
			commands.put("displayMenu", new DisplayMenu());	
		}

		public Object doCommand(String commandKey, HashMap<String, Object> commandData) throws Exception {
			ShowMethodInterface command = commands.getOrDefault(commandKey, null);
			if (command == null) {
				throw new Exception("There is no command with the key word ' " + commandKey + "'.");
				
			}
			
			return command.handleIt(commandData);
			
		}
}
