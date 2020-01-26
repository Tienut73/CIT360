import java.util.*;
import java.util.Map.Entry;
public class MapTestExample {
	public static void main(String args[]){  
		  Map<String,String> map=new HashMap<>();  		  
		  map.put("2","South Korea");  		  
		  map.put("4", "Thailand");
		  map.put("1,300","China");
		  map.put("3","Singapore");  

		  Set<String> setCases = map.keySet();
		  Iterator<String> iterator = setCases.iterator();
		  // this retrieves the country and case strings from the hashMap.
		  while (iterator.hasNext()) {
			  String cases = iterator.next();
			  String country = map.get(cases);
			System.out.print("Documented cases of the coronavirus: ");
			System.out.println(cases +" "+ country);
		}  
}  
}
