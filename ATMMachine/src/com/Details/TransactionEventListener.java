package com.Details;

import org.springframework.context.ApplicationListener;

public class TransactionEventListener implements ApplicationListener<WithdrawalEvent> {

	@Override
	public void onApplicationEvent(WithdrawalEvent event) {
		System.out.println(event);
	}

}