package com.masterHills;

public interface BankOperations {
	/**
	 * 
	 * @param withdrawAmount The amount the user wants to withdraw from the account
	 */
	public void withdraw(double withdrawAmount);
	/**
	 * 
	 * @param depositAmount The amount the user wants to deposit to the account
	 */
	public void deposit(double depositAmount);
	/**
	 * This method helps you view your account balance
	 */
	public void viewbalance();
}
