package com.lawrence;

import java.util.*;
class A {
	public A() {
		System.out.println("A's no-arg constructor is invoked");
}
}
class B extends A {
	@Override
	public String toString(){
		System.out.println("The concept of explicitly calling the superclass constructor is constructor chaining");
		return " ";
	}
}
//public class C {
//public static void main(String[] args) {
//B b = new B();
//}
//}

public class ValidatePass {

	public static void main(String[] args) {
//		StringBuilder sb = new StringBuilder();
		B b = new B();
		System.out.println(b.toString());
		Scanner input = new Scanner(System.in);
		boolean active = true;
		while(active) {
			System.out.println("Enter password");
			String password = input.nextLine();
			if(passvalid(password)) {
				active = false;
			}
			else {
				System.out.println("Invalid password");
				continue;
			}
		}
		System.out.println("Valid password");
//		boolean check = passvalid(password);
//		System.out.println(check);
//		if(check) {
//			System.out.println("Valid password");
//		}
//		else {
//			while(active){
//				System.out.println("Enter password");
//				password = input.nextLine();
//				if(passvalid(password)) {
//					active = false;
//				}
//				else {
//					continue;
//				}
//			
//			}
//		System.out.println("Valid password");
//		}
//		System.out.println(passvalid(password));
//		if(password.length()<=8 && password.length()>=15) {
//			System.out.println("Invalid password");
//		}
//		if(password.contains(" ")) {
//			System.out.println("Invalid password");
//		}
//		if(password.contains())
	
	}
	public static boolean passvalid(String password) {
		if(password.length()<=8){
			return false;
	}
		if(password.length()>=15) {
			return false;
		}
		if(password.contains(" ")) {
			return false;
		}
		if(true) {
			int count = 0;
			for(int i = 0; i<= 9; ++i) {
				String str = String.valueOf(i);
				if(password.contains(str)) {
					count++;
				}
			}
			if(count<1){
				return false;
					}
			}
		if(true) {
			int _count = 0;
			for(int i = 65; i<= 90; ++i) {
				char ch = (char)(i);
				String str1 = Character.toString(ch);
				if(password.contains(str1)) {
					_count++;
				}
			}
			if(_count==0){
				return false;
				}	
		}
		if(true) {
			int count = 0;
			for(int i = 97; i<= 122; ++i) {
				char gh = (char)i;
				String str2 = Character.toString(gh);
				if(password.contains(str2)) {
					count+=1;
				}
			}
			if(count==0) {
				return false;
			}
		}
		return true;
	}
	}
