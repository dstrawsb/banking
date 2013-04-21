package com.ruben;

import java.util.ArrayList;

public class Bank {

	private ArrayList<Account> accounts = new ArrayList<Account>();
	private String name = null;	

	private Bank(String aName) {
		name = aName;
	}
	
	public void addAccount(Account account) 
	{
		//wrap this in a iff statement
		accounts.add(account);		
		// need to run thru the accounts and verify that the account number in account isn't duplicated
	}
	
	//so if the account number is not declared in the array there will be no return
	public Account getAccountByNumber(long accountNumber) {
		for(Account ac : accounts) {
			if(ac.getAcctNumber() == accountNumber ) {
				return ac;
			}
		}
		return null;  //will never get here unless if fails for all accounts in ArrayList
	}
	
	//and this is if the name is not in the account it will fail?
	public Account getAccountByName(String accountName) {
		for(Account ac : accounts) {
			if(ac.getName() == accountName ) {
				return ac;
			}
		}
		return null;  //will never get here unless if fails for all accounts in ArrayList
	}
	
	public static Bank getInstance(String aName) {
		return new Bank(aName);
	}

	//this is pulling in string name from account
	private void setName(String name) {
		this.name = name;
	}

	//and this is returning the name
	public String getName() {
		return name;
	}
}
