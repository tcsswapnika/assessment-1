package com.tcs.bankAssessment;

import java.util.Date;

public class CurrentAccount extends BankAccount {
	private double overdraftBalance;

	public CurrentAccount(int accountNumber, Double balance, String ownerNamer, Date createDate, String type,
			String status) {
		super(accountNumber, balance, createDate, type, status);
		this.overdraftBalance = overdraftBalance;

	}

	public double getOverDraftBalance() {
		return overdraftBalance;
	}
}