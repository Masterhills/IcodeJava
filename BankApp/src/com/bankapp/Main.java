package com.bankapp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.lang.Object;
//import java.util.Collection;
import java.util.Scanner;
import java.util.regex.*;

public class Main {
	public static void main(String[] args) {
		Collection values = new ArrayList();
		Scanner read = new Scanner(System.in);
		System.out.println("Welcome to AVS bank");
//		int[] twoInput = {1,2};
		System.out.println("Select option 1 to login, 2 to Create an account");
		String optionselect = read.nextLine();
//		int optionSelected = 0;
//		try{
//			optionSelected = read.nextInt();
//		}
//		catch(Exception e) {
//			System.out.println("Enter integer value between 1 and 2");
//		}
//		read.nextLine();
		if(optionValidate(optionselect) == "1"){
			Bankfactory obj = new Bankfactory();
			values.add(obj.defaultAccountNo());
			System.out.println("Enter your name ");
			String _name = read.nextLine();
			if(Pattern.matches("^[a-zA-Z]+$", _name)) {
//				System.out.println("welcome" + _name);
				obj.setAccountName(_name);
				values.add(_name);
				System.out.println("Please enter password");
				String _password = read.nextLine();
			}
//			System.out.println(obj.defaultAccountNo());
//			System.out.println("Enter your name ");
//			nameValidate(_name);
//			obj.setAccountName(_name);
//			System.out.println("Welcome "+ _name);
		}
		if(optionselect == "2") {
		}
			}
	public static String optionValidate(String value) {
		boolean active = true;
		Scanner read = new Scanner(System.in);
		while(active) {
			if(Pattern.matches("^[1-3]+$", value)) {
				break;
			}
			else {
				while(active) {
					System.out.println("Enter values between 1 and 2");
					value = read.nextLine();
					if(Pattern.matches("^[1-3]+$", value)) {
						break;
					}
					continue;		
				}
			}
		}
		return value;
	}
	public static String nameValidate(String name) {
		Scanner input = new Scanner(System.in);
		boolean active = true;
		while(active) {
			if(Pattern.matches("^[a-zA-Z]+$", name)){
				break;
			}
			else {
				System.out.println("Please enter a valid name with alphabetic characters");
				name = input.nextLine();
//				continue;
			}
		}
		return name;
	}
	public static String passwordValidate(String password){
		return password;
	}
	}
