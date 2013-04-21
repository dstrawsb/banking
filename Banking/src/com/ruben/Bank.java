package com.ruben;

import java.util.ArrayList;

/**
 * @author Petr Ruben
 *
 */
public class Bank {

	private ArrayList<Account> accounts = new ArrayList<Account>();
	private String name = null;	

	/**
	 * @param name
	 */
	private Bank(String aName) {
		name = aName;
	}
	
	/**
	 * @param account
	 */
	public void addAccount(Account account) {
		//wrap this in a iff statement
		accounts.add(account);		
		// need to run thru the accounts and verify that the account number in account isn't duplicated
	}
	
	/**
	 * @param accountNumber
	 * @return
	 */
	public Account getAccountByNumber(long accountNumber) {
		for(Account ac : accounts) {
			if(ac.getAcctNumber() == accountNumber ) {
				return ac;
			}
		}
		return null;  //will never get here unless if fails for all accounts in ArrayList
	}
	
	/**
	 * @param accountName
	 * @return
	 */
	public Account getAccountByName(String accountName) {
		for(Account ac : accounts) {
			if(ac.getName() == accountName ) {
				return ac;
			}
		}
		return null;  //will never get here unless if fails for all accounts in ArrayList
	}
	
	/**
	 * @param aName
	 * @return Bank
	 */
	public static Bank getInstance(String aName) {
		return new Bank(aName);
	}
	
	/**
	 * @param name the name to set
	 */
	private void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
}
