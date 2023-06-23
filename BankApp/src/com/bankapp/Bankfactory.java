package com.bankapp;
import com.bankapp.*;


//Generatess account number
public class Bankfactory extends BankUser {
	public Bankfactory() {
		accountbalance = 0.0;
	}
	public StringBuilder defaultAccountNo() {
		StringBuilder sb = new StringBuilder("AVS");
		sb.append(String.valueOf((int)Math.random()*(5000-2000+1)+2000));
		return sb;	
	}	
}
