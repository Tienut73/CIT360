package setProject;
	import java.util.*; 
	class SetProjectExample {
	  public static void main(String args[]) {  
		  Set<Integer> a = new HashSet<Integer>(); 
	        a.addAll(Arrays.asList(new Integer[] {0, 3, 6, 9, 12, 15, 18})); 
	        Set<Integer> b = new HashSet<Integer>(); 
	        b.addAll(Arrays.asList(new Integer[] {2, 4, 6, 8, 10, 12, 14, 16})); 
	        
	        // this shows commonality between a and b.
	        Set<Integer> common = new HashSet<Integer>(a); 
	        common.retainAll(b); 
	        System.out.print("Numbers featured in both sets: "); 
	        System.out.println(common); 
	        
	        // This shows all the numbers without repeating multiples of the same number.
	        Set<Integer> uniqueNumbers = new HashSet<Integer>(a);
	        uniqueNumbers.addAll(b); 
	        System.out.print("Unique numbers in the sets: "); 
	        System.out.println(uniqueNumbers); 
	  
	        // removing all the numbers from b shows the unique numbers in a.
	        Set<Integer> exclusive = new HashSet<Integer>(a); 
	        exclusive.removeAll(b); 
	        System.out.print("Exclusive numbers in the first set: "); 
	        System.out.println(exclusive); 
	    } 
	}
	   
