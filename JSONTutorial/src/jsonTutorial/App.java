package jsonTutorial;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class App {

	public static void main(String[] args) {
		
		ObjectMapper mapper = new ObjectMapper();
		MyPojo myPojo = createDummy();
		
		// Create JSON string
		
		try {
			String jsonString = mapper.writeValueAsString(myPojo);
			System.out.println(jsonString);
		
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	// Before returning the object
	// set values for each of the
	// properties within the object
	
	private static MyPojo createDummy() {
		MyPojo myPojo = new MyPojo();
		myPojo.setId(1);
		myPojo.setName("A green door");
		myPojo.setPrice(12.50f);
		
		String tags [] = {"home", "green"};
		
		myPojo.setTags(tags);
		
		return myPojo;
	}

}
