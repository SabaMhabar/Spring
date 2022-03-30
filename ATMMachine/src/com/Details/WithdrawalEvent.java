package com.Details;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.context.ApplicationEvent;

public class WithdrawalEvent extends ApplicationEvent {

	private final double amount;
	private final BankAccount account;
	
	public WithdrawalEvent(Object source, double amount, BankAccount account) {
		super(source);
		this.amount = amount;
		this.account = account;
	}

	@Override
	public String toString() {
		SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy HH:MM:ss");
		return String.format("Amount after withdrawal: %.2f on %s\n%s", this.amount, format.format(new Date()), this.account);
	}
	
	

}