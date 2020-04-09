package jsonTutorial;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class App2 {
	
	public static void main(String[] args) {
		
		ObjectMapper mapper = new ObjectMapper();
		MyPojo2 myPojo2 = createDummy();
		
		try {
			String jsonString = mapper.writeValueAsString(myPojo2);
			System.out.println(jsonString);
			
		} catch (JsonGenerationException e) {
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
	
	private static MyPojo2 createDummy() {
		
		// convert objects to json.
		// create objects and set values.
		// Schemas are defined on a per-Mapper basis. 
		// One Schema per Mapper. A Mapper represents 
		// the CRUD operations that can be performed 
		// on a Resource, and its Schema represents 
		// the form that the Records of the Mapper will take.
		MyPojo2 myPojo2 = new MyPojo2();
		myPojo2.set$schema("http://json-schema.org/draft-4/schema#");
		myPojo2.setTitle("Garden Anywhere Box");
		myPojo2.setDescription("An Easier Way to Garden!");
		myPojo2.setType("Object");
		
		Properties properties = new Properties();
		
		// Set ID
		Id id = new Id();
		id.setDescription("Starter Kit + Watering System.");
		id.setType("integer");
		
		// Set Name
		Name name = new Name();
		name.setDescription("Garden Anywhere Box");
		name.setType("String");
		
		// Set Price
		Price price = new Price();
		price.setType("number");
		price.setMinimum(0);
		price.setExclusiveMinimum(true);
		
		// Set Tags
		Tags tags = new Tags();
		tags.setType("array");
		
		// Set Items
		Items items = new Items();
		items.setType("String");
		tags.setItems(items);
		tags.setMinItems(1);
		tags.setUniqueItems(true);
		
		myPojo2.setProperties(properties);
		
		String required[] = {"id", "name", "price"};
		myPojo2.setRequired(required);
		
		properties.setId(id);
		properties.setName(name);
		properties.setPrice(price);
		properties.setTags(tags);
		
		return myPojo2;
	}

}
