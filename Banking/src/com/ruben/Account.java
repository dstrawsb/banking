package com.ruben;

import java.text.NumberFormat;

public class Account {
	
	private static final double RATE = 0;
	private String name;
	private long acctNumber;
	private double balance;
	
	public Account (String owner, long account, double initial)	{
		name = owner;
		acctNumber = account;
		balance = initial;
	}
	
	public double deposit (double amount) {
		balance = balance + amount;
		return balance;
	}
	
	public double withdraw (double amount, double fee){
		balance = balance - amount - fee;
		return balance;
	}
	
	public double addInterest () {
		balance += (balance * RATE);
		return balance;
	}
	
	public double getBalance ()
	{
		return balance;
	}
	
	public String toString ()
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		return acctNumber + "\t" + name + "\t" + fmt.format(balance);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the acctNumber
	 */
	public long getAcctNumber() {
		return acctNumber;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/**
	 * @param name the name to set
	 */
	private void setName(String name) {
		this.name = name;
	}

	/**
	 * @param acctNumber the acctNumber to set
	 */
	private void setAcctNumber(long acctNumber) {
		this.acctNumber = acctNumber;
	}
}