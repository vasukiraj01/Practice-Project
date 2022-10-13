package simplelearn;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class HashMapExample {
	
	public class HashMap1 {
	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1,"Anna");
		map.put(5,"Bella");
		map.put(2,"Elsa");
		
		Set<Map.Entry<Integer,String>> entries =map.entrySet();
		for (Map.Entry<Integer, String> data :entries) {
			System.out.println(data.getKey()+" "+data.getValue());
		}
	}
		}
	
}
	
