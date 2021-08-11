package com.tcs.bankAssessment;

import java.util.Date;

public class SavingsAccount extends BankAccount {

	public SavingsAccount(int accountNumber, Double balance, String ownerNamer, Date createDate, String type,
			String status) {
		super(accountNumber, balance, createDate, type, status);

	}

}
