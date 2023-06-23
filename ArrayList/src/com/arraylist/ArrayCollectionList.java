package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayCollectionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> obj = new ArrayList<>();
//		obj.add("ifeanyi");
		obj.add(1);
//		obj.add(true);
		obj.add(2);
		obj.add(4);
		obj.add(3);
		System.out.println(obj);
		obj.remove((Integer)4);
		System.out.println(obj);
		obj.removeIf(ele->ele == 1);
		System.out.println(obj);
		
//		To get the index of the object
		obj.add(1);
		obj.add(6);
		obj.add(2);
		System.out.println(obj);
		System.out.println(obj.indexOf(2));
		System.out.println(obj.lastIndexOf(2));
		
//		Replace
		obj.set(1,98);
		System.out.println(obj);
		
//		For getting objects
		System.out.println("----------------------------------");
		
		Iterator<Integer> it = obj.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println(" ");
		for(int i: obj) {
			System.out.println(i);
		}
		
//		Sorting
	}

}
