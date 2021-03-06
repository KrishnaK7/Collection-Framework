package com.set;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		Collection<String> set=new HashSet<String>();
		set.add("nithin");
		set.add("appu");
		set.add("nithin");
		
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
		System.out.println("---------------------------------------------------------------");
		
		for(String name: set)
			System.out.println(name);
		
		System.out.println("Size of set "+set.size());
		System.out.println("To check an element is present "+set.contains("nithin"));
		System.out.println("Removing an element "+set.remove("nithin"));
	}

}
