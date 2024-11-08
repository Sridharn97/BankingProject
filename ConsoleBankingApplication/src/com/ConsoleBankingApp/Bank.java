package com.ConsoleBankingApp;
import java.util.HashMap;

public class Bank {
     private HashMap<Integer,CreateAccount> customers=new HashMap<>();
     
     public void AddCustomer(CreateAccount newAccount) {
    	 customers.put(newAccount.accountNumber,newAccount);
     }
     public void getBalance(int accountnumber) {
    	 CreateAccount balance=customers.get(accountnumber);
    	 System.out.println(balance.initialbalance);
    	 
    	 
    	 
     }
     public CreateAccount getCustomer(int accountnumber) {
    	 return customers.get(accountnumber);
     }
}
