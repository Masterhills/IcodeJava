package com.bankuser;

public interface BankUser {
//	All fields in an interface are public, static and final by default
	void getAccountNumber();
	void depositMoney(int amount);
	void withdrawMoney(int amount);
	void checkBalance();
	void changeTransactpin();
}
