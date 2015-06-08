package com.map;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class HashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<>();
		map.put(1, "nithin");
		map.put(2, "appu");
		
		System.out.println(map.containsKey(1));
		
		System.out.println(map.put(2, "anil"));
		
		
		 Set set = map.entrySet();
	     
	      Iterator i = set.iterator();
	      
	      while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.print(me.getKey() + ": ");
	         System.out.println(me.getValue());
	      }
	}

}
