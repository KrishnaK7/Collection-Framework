package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		System.out.println("---------------------------------------");
		list.remove(2);
		List<Integer> b=list.subList(1, 3);
		
		System.out.println("---------------------------------------");
		for(Integer no:b)
			System.out.println(no);
		
		System.out.println("---------------------------------------");
		
		list.addFirst(100);
		
		for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		

	}

	

}
