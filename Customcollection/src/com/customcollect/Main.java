package com.customcollect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
//		showroom
//		Bike obj1 = new Bike();
		Factory obj2 = new Factory();
		obj2.produceBike(4);
//		System.out.println(obj2.produceBike(4));
//		obj2.printin(diff);
		Collection value = new ArrayList();
		value.add(4);
		value.add("uche");
		List<Integer> obj = new ArrayList<>();
		System.out.println("Enter 1 to deposit. Enter 2 to withdraw");
		int optionsanswer = input.nextInt();
		if(optionsanswer == 1) {
			System.out.println("Enter amount you want to deposit");
			int amountDeposit = input.nextInt();
			obj.add(amountDeposit);
			int answer = sumInt(obj);
			System.out.println("The total sum is "+ answer);
			
		}
		System.out.println(value);
		List<Double> obj1 = new ArrayList<>();
		obj1.add(4.2);
		obj1.add(2.0);
		obj1.add(1.5);
		obj1.add(-1.0);
		obj1.add(deposit(3.5));
		Collections.sort(obj1);
//		System.out.println(sum(obj1));
		var seen = sum(obj1);
		if(seen < deposit(7.0)){
			System.out.println("Insufficient balance");
		}
		else {
			obj1.add(deposit(-7.0));
			System.out.println(sum(obj1));
		}
		Iterator it = obj1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(it.hasNext());
//		ArrayList values = new ArrayList();

	}
	public static int sumInt(List<Integer> obj) {
		Iterator it = obj.iterator();
		int count = 0;
		int total = 0;
		while(it.hasNext()) {
			count+=(int)it.next();
		}
//		for(Object o: obj) {
//			total+=(double)o;  //How to iterate a non generic list using the enhanced for loop.
//			}
//		System.out.println(total);
		return count;			
		
	}
	public static double sum(List<Double> obj) {
		Iterator it = obj.iterator();
		double count = 0.0;;
		double total = 0.0;
		while(it.hasNext()) {
			count+=(double)it.next();
		}
//		for(Object o: obj) {
//			total+=(double)o;  //How to iterate a non generic list using the enhanced for loop.
//			}
//		System.out.println(total);
		return count;			
		
	}
	public static double deposit(double amount) {
		return amount;
	}
	public static double withraw(double amount) {
		return amount;
	}

}
