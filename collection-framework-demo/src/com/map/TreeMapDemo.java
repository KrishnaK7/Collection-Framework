package com.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		Map<Integer, String> map=new TreeMap<>();
		map.put(2, "nithin");
		map.put(1, "appu");
		
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
