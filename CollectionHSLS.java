package simplelearn;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
public class CollectionHSLS {

	public static void main(String[] args) {
		HashSet<String> data = new HashSet<>();
		data.add("Ana");
		data.add("Ben");
		data.add("Dev");
		data.add("Ellon");
		for (String d:data) 
			System.out.println(d);
	      System.out.println("\n");
			
		//linkedlist
	     System.out.println("linkedlist");
		LinkedList<String> names=new LinkedList<String>();  
		names.add("Alex");  
		names.add("John");  	      
		Iterator<String> itr=names.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}
		
		//LinkedHashset
		System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(11);  
	       set2.add(13);  
	       set2.add(12);
	       set2.add(14);	       
	       System.out.println(set2); 

	}
}


