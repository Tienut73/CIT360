import java.util.*;
class TreeSetExample implements Comparable<TreeSetExample> {
    	  int id;
    	  String name, author, publisher;
    	  public TreeSetExample(int id, String name, String author, String publisher) {
    		  this.id = id;
    		  this.name = name;
    		  this.author = author;
    		  this.publisher = publisher;
    	  }
		public int compareTo(TreeSetExample b) {
		if(id>b.id) {
			return 1;
		}else if(id<b.id) {
			return -1;
		} else {
			return 0;
		}
      }
		public static void main(String args[]) {
		      Set<TreeSetExample> ts=new TreeSet<TreeSetExample>();
		// This stores the catalog of titles.      
   TreeSetExample b1=new TreeSetExample(633254,"Watership Down","Richard Adams","Rex Collings");
   TreeSetExample b2=new TreeSetExample(3496427,"Plague Dogs","Richard Adams","Allan Lane");
   TreeSetExample b3=new TreeSetExample(1017745832,"Tales from Watership Down","Richard Adams","Hutchinson");

	ts.add(b1);
	ts.add(b2);
	ts.add(b3);
	
		// this calls the information and displays it in order.
		for(TreeSetExample b:ts) {
			System.out.println(b.id+", "+b.name+", "+b.author+", "+b.publisher+", ");
			}
		}
		}