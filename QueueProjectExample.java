package queueProject;
	import java.util.*;  
	class QueueProjectExample{  
	public static void main(String args[]){  
	Queue<String> q=new LinkedList<>();  
	q.add("Sleepy");  
	q.add("Sneezy");  
	q.add("Bashful");  
	q.add("Grumpy");  
	q.add("Happy"); 
	q.add("Dopey");
	q.add("Doc");
	int size = q.size();
	System.out.println("Number of dwarves: " + size);
	// this draws information from the head of the string.
	String head = q.peek();
	System.out.println("first dwarf in line: "+ head);
	q.remove();  
	q.poll();  
	// this presents the last five in the list.
	System.out.println("After removing the first two dwarves:");  
	Iterator<String> itr=q.iterator();  
	while(itr.hasNext()){  
	System.out.println(itr.next());  
	}  
	}  
	}  
