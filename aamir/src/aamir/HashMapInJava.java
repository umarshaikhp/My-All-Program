package aamir;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class HashMapInJava {

	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("three", 3);
		map.put("three", 3);
		map.put("three", 3);
		map.put("three", 3);
		
		map.putIfAbsent("three", 20);//if same key already exist the does not print other wise print.........
		map.putIfAbsent("five", 20);//it will be print because not exist in map..............
		System.out.println(map.get("one"));//getting value
		System.out.println(map.containsKey("three"));
		System.out.println(map.containsValue(3));//check value
		System.out.println(map.replace("one", 1, 10));//if old exists then replace otherwise not replace
		System.out.println(map.replace("three", 5, 100));
		System.out.println(map.keySet());//return key
		System.out.println(map.values());//return values
		System.out.println(map.remove("one"));//for remove
		System.out.println(map);
		Set<Entry<String,Integer>> entries=map.entrySet();
		for(Entry<String,Integer> entry:entries) {
			entry.setValue(entry.getValue()*100);
		}
		System.out.println(map);
		

	}

}