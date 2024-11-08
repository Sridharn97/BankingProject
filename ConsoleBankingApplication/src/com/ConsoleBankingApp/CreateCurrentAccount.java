package com.ConsoleBankingApp;

public class CreateCurrentAccount extends CreateAccount {

	public CreateCurrentAccount(int accountNumber, String name, double initialbalance) {
		super(name, accountNumber, initialbalance);
	}
    public void displaydetails() {
    	super.displaydetails();
    	System.out.println("Type of Account is Current");
    }
}
