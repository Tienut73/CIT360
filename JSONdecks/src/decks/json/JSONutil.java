package decks.json;

import java.io.InputStream;
import java.util.Scanner;

public class JSONutil {
	
	public static String getJSONStringFromFile(String path) {
		Scanner scanner;
		InputStream in = FileHandle.inputStreamFromFile(path);
		scanner = new Scanner(in);
		String json = scanner.useDelimiter("\\z").next();
	scanner.close();
	return json;
	
	}
	public static JSONobject getJSONobjectFromFile(String path) {
		return new JSONobject(getJSONobjectFromFile(path));
	}
	public static boolean objectExists(JSONobject jsonObjects, String key) {
		Object o;
		try {
			o = jsonObject.get(key);
		} catch(Exception e) {
			return false;
			
		}
		return o!= null;
	}
}
