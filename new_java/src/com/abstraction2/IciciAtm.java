package com.abstraction2;

public class IciciAtm implements ATM {
	int balance;
	@Override
	public void depositing(int depositeAmount)
	{
		balance=balance+depositeAmount;
		System.out.println("SUCCESSFULLY DEPOSITED!!!!");
	}
	
		@Override
		public void withdrawing(int withdrawalAmount)
		{
			if(withdrawalAmount<=balance)
			{
				
			balance=balance-withdrawalAmount;
			}
			else {
				System.out.println("Insufficient balance please retry");
			}
		}
		
			@Override
			public void checkBalance()
			{
			System.out.println("balance Amount is "+balance);
				
	}

}
