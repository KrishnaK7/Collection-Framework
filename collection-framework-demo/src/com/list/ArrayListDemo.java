package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class ArrayListDemo {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		
		System.out.println("---------------------------------------");
		System.out.println(list.get(1));
		System.out.println("---------------------------------------");
		
		for(Integer no:list)
			System.out.println(no);

	}

}
