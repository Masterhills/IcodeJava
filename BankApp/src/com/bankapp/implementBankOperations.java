package com.bankapp;
/**
 * 
 * @author Onwuchekwa Lawrence
 * @see A Class that implements withdraw, deposit and view balance of a User account
 *
 */
public class implementBankOperations extends BankUser implements Bankoperations {
	/***
	 * {@summary} 
	 */
	@Override
	public void withdraw(double withdrawAmount) {
		// TODO Auto-generated method stub
		if(accountbalance<=0) {
			System.out.println("Insufficient funds");
		}
		else {
			accountbalance-=withdrawAmount;
		}
	}

	@Override
	public void deposit(double depositAmount) {
		// TODO Auto-generated method stub
		if(depositAmount<=0) {
			System.out.println("error");
		}
		else {
			accountbalance+=depositAmount;
		}
		
	}

	@Override
	public void viewbalance() {
		// TODO Auto-generated method stub
		System.out.printf("Your balance is {0}", accountbalance);
	}

}
