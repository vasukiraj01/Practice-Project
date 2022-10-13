package simplelearn;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapEx {
		public static void main(String[] args) {
			LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
			map.put(1,"Anna");
			map.put(5,"Bella");
			map.put(2,"Elsa");
			
			Set<Map.Entry<Integer,String>> entries =map.entrySet();
			for (Map.Entry<Integer, String> data :entries) {
				System.out.println(data.getKey()+" "+data.getValue());
			}
		Set<Integer> keySets = map.keySet();
		for (Integer key : keySets) {
			System.out.println(key);
		}
	}

}


