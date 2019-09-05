package com.abstraction2;

public class Transaction {

	public static void main(String[] args) {
		ATM atm = new IciciAtm();
		atm.depositing(1000);
		atm.checkBalance();
		atm.withdrawing(100);
		atm.checkBalance();

	}

}
