package com.mrhills;
import java.io.File;
import java.io.IOException;
import java.lang.Object;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Arrayobjectsdiff {

	public static void main(String[] args) throws IOException {
		//Solving the type problem with array
		// TODO Auto-generated method stub
//		System.out.println("");
		Object[] obi = new Object[4];
		Students[] obj = new Students[5]; //obj is a reference variable that points to an array of Students objects
		//The array of students objects contains reference variables that points to a student type object
		Students obj2 = new Students();// obj2 is a reference variable that points to a Student type object
		obj[1] = new Students();
		obj2.name = "lawrence";
		obj[0] = obj2; //A student array object can only store objects of type Students.
		Employee obj3 = new Employee();
		obj[2] = obj3;
		//I am able to store an employee object because it inherits the Students class.
		//It solves the type problem with inheritance without collection.
		obi[0] = new Students();
		obi[2] = new Employee();
		int[] arr = new int[6];
		arr = new int[] {0,1,2,3,5};
//		arr(arr);
		for(int i: arr(arr)){
			System.out.println(i);
			}
//		System.out.println(arr.length);
//		for(int i = arr.length-1;i>=2;--i) {
//			arr[i] = arr[i-1];
//			System.out.println(arr[i]);
//		}
//		arr[1] = 9;
//		System.out.println("");
//		for(int i: arr) {
//			System.out.println(i);
//		}
		File f = new  File("abc.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		Set<Integer> value = new HashSet<>();
		value.add(5);
		value.add(6);
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "lawrence");
		map.put(2,"steven");
		System.out.println(map);
		Set<Integer> key = map.keySet();
		System.out.println(key);
		
		
	}
	public static int[] arr(int[] arr) {
		int i;
		for(i= arr.length-1;i>=2;--i) {
			arr[i] = arr[i-1];
		}
		arr[i] = 9;
		return arr;
		
//		System.out.println(arr[i]);
//		arr[1] = 9;
//		for(int j = 0; j<arr.length-1; ++i) {
//			System.out.println(arr[j]);
//		}
	}
}
