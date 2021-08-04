package Lec_50_51;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Demo_HashMaps {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
//		O(1) put or addding a pair of Key and Value in your HashMap
		map.put("AAA",10);
		map.put("CCC", 20);
		map.put("BBB", 30);
		map.put("A", 1010);
		
		map.put("A1", 1001);
		map.put("A1", 100100);
		map.put("A3", 1090);
		
		
		System.out.println(map);
		
//		O(1) get ?! returns the Value mapped to that key
		System.out.println(map.get("A1"));
		System.out.println(map.get("A2"));
		System.out.println(map.get("A3"));
		
//		O(1) Does .ContainsKey(K) ? K exist in your map ?
		System.out.println(map.containsKey("A2"));
		System.out.println(map.containsKey("A3"));
		System.out.println(map.containsKey("ZZZZ"));
		
//		O(1) remove
		System.out.println(map.remove("A1"));
		System.out.println(map.remove("A"));
		System.out.println(map);
		
		System.out.println("---------------------");
//		How to get keys!!
		
//		A 1 :
		Set<String> Keys = map.keySet();
		for(String Key : Keys) {
			System.out.println(Key+ " -> "+map.get(Key));
		}
		System.out.println("---------------------");
//		A 2 :
		for(String Key : map.keySet()) {
			System.out.println(Key+ " -> "+map.get(Key));
		}
		System.out.println("---------------------");
		
		ArrayList<String> AL = new ArrayList<>(map.keySet());
		System.out.println(AL);
	}
	
}
