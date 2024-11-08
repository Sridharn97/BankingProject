package com.ConsoleBankingApp;

public class CreateAccount {
     protected String name;
     protected int accountNumber;
     protected double initialbalance;
	private String customerName;
	public CreateAccount(String name,int accountNumber,double initialbalance) {
		this.name=name;
		this.accountNumber=accountNumber;
		
		this.initialbalance=initialbalance;
	}
    public int getAccountNumber() {
    	return this.accountNumber;
    }
    
    public double getBalance() {
    	return this.initialbalance;
    }
    public String getCustomerName() {
    	return this.customerName;
    }
	public void displaydetails() {
		System.out.println("The Account NUmber is"+this.accountNumber);
		System.out.println("The Account Holder Name is"+this.customerName);
		System.out.println("THe Initial Balance of Custome is"+this.initialbalance);
	}
	public void creditToAccount(double creditamount) {
		initialbalance+=creditamount;
		System.out.println("Amount Credited Succesfully.Your Balance is : "+initialbalance);
	}
	public void withdrawToAccount(double withdrawAmount) {
		initialbalance-=withdrawAmount;
		System.out.println("Amount Withdraw Successfully.Your Balance is :"+initialbalance);
	}
			
	
}
