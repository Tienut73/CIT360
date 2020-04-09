package jsonTutorial;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class App3 {

	public static void main(String[] args) {
		
		ObjectMapper mapper = new ObjectMapper();
		
		// pull from JSON file.
		try {
			MyPojo3 myPojo3 = mapper.readValue(new File("simpleSimon.json"), MyPojo3.class);
			System.out.println(myPojo3.getId());
			System.out.println(myPojo3.getName());
			System.out.println(myPojo3.getPrice());
			System.out.println(myPojo3.getTags()[0]);
			System.out.println(myPojo3.getTags()[1]);


		
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
