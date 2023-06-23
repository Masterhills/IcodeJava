package com.masterHills;

public class BankIdGenerator extends Bankuser {
	public BankIdGenerator() {
		accountbalance = 0.0;
	}
	public StringBuilder IDgenerator() {
		StringBuilder sb = new StringBuilder("AVS");
		sb.append(String.valueOf((int)Math.random()*(5000-2000+1)+2000));
		return ;
		
	}

}
