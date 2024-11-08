package com.ConsoleBankingApp;
import java.util.*;

public class Main {

	

	public static void main(String[] args) {
		 Bank bankobj = new Bank();
	        Scanner sc = new Scanner(System.in);
	        boolean running = true;
	        
	        while(running) {
	            System.out.println("\nBanking Operations");
	            System.out.println("1. Create Account");
	            System.out.println("2. Credit Amount");
	            System.out.println("3. WithDraw Amount");
	            System.out.println("4. Account Details");
	            System.out.println("Choose an operation");
	            int choice = sc.nextInt();
	            sc.nextLine();
	            
	            switch(choice) {
	                case 1:
	                    System.out.print("Enter the account number: ");
	                    int accountNumber = sc.nextInt();
	                    sc.nextLine(); // Consume newline
	                    System.out.print("Enter the Account Holder Name: ");
	                    String accountHolderName = sc.nextLine();
	                    System.out.print("Enter the initial balance: ");
	                    double balance = sc.nextDouble();
	                    sc.nextLine(); // Consume newline
	                    System.out.print("Enter the account type (Savings/Current): ");
	                    String accountType = sc.nextLine();
	                    
	                    CreateAccount createaccount = null;
	                    if(accountType.equalsIgnoreCase("Savings")) {
	                        System.out.print("Enter the Transaction Limit: ");
	                        int transactionLimit = sc.nextInt();
	                        sc.nextLine(); // Consume newline
	                        createaccount = new CreateSavingsAccount(accountNumber, accountHolderName, balance, transactionLimit);
	                    } else {
	                        createaccount = new CreateCurrentAccount(accountNumber, accountHolderName, balance);
	                    }
	                    
	                    bankobj.AddCustomer(createaccount);
	                    createaccount.displaydetails();
	                    break;

	                case 2:
	                    System.out.println("ENter the Account Num to credit: ");
	                    int accNumDebit=sc.nextInt();
	                    System.out.println("Enter the amount to credit: ");
	                    double credit=sc.nextDouble();
	                    CreateAccount depositAccount=bankobj.getCustomer(accNumDebit);
	                    depositAccount.creditToAccount(credit);
	                    break;
	                
	                case 3:
	                	System.out.println("ENter the Account Num to withdraw: ");
	                    int accNumWithdraw=sc.nextInt();
	                    System.out.println("Enter the amount to credit: ");
	                    double withdraw=sc.nextDouble();
	                    CreateAccount depositwithdrawAccount=bankobj.getCustomer(accNumWithdraw);
	                    depositwithdrawAccount.withdrawToAccount(withdraw);
	                	break;
	                case 4:
	                	System.out.println(displaydetails());
	                	break;
	                	
	                	
	                
	                default:
	                    System.out.println("Invalid operation. Please choose a valid option.");
	                    break;
	            }
	        }
		}

	private static char[] displaydetails() {
		// TODO Auto-generated method stub
		return null;
	}

}
