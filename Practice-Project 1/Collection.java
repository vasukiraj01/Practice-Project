package simplelearn;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("vas");
		list.add("jk");
		list.add("rm");
		
		System.out.println(list);
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}
		

	}

}
