package com.Details;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String args[]) {
				ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
				WithdrawalEventPublisher publisher = (WithdrawalEventPublisher) context.getBean("withdrawalEventPublisher");
				BankAccount acc1 = new SavingsAccount(101, "Saba", 70000);
				System.out.println(acc1);
				double balance=acc1.withdraw(20000);
				publisher.publish(balance, acc1);
		}

		}