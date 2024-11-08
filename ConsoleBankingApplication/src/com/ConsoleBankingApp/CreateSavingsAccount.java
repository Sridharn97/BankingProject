package com.ConsoleBankingApp;

public class CreateSavingsAccount extends CreateAccount {
	protected int transactionLimit;
	

	public CreateSavingsAccount(int accountNumber, String name, double initialbalance,int transactionLimit) {
		
		super(name, accountNumber, initialbalance);
		this.transactionLimit=transactionLimit;
		
	}
	
	public int getTransactionLimit() {
		return this.transactionLimit;
	}
	@Override
	public void displaydetails() {
		super.displaydetails();
		System.out.println("This Account is Savings");
	}
    	
    
}
