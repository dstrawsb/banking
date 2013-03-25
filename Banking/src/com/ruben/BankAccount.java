package com.ruben;

import java.util.HashMap;

/**
 * @author Petr Ruben
 *
 *
 * -------------------------
 * Bank account subclass
 * -------------------------
 */
public class BankAccount
{
  protected double interest_rate;
  protected double balance;
  private HashMap<String, Customer> customers = new HashMap<String, Customer>();

  public BankAccount(double i, double b)
  {
    interest_rate = i;
    balance       = b;
  }

  /**
 * @return
 */
  public double getBalance() {
	  return balance;
  } 
  
  /**
 * interest
 */
  public void interest() {
	  balance *= 1.0 + interest_rate;
  }
  
  /**
 * @return true if customers were loaded, false if no customers exist
 */
public boolean loadCustomer(String aName, String aPassword, AccountTypes aAccountType) {
	customers.put(aName, Customer.getInstance(aName, aPassword, aAccountType));
		if (customers.isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

/**
 * @param username
 * @param password
 * @return
 */
public boolean verifyPassword(String username, String password){
	Customer customer = null;
	if(customers.containsKey(username)) {
		customer = customers.get(username);
		if(customer.getPassword().equals(password)) {
			return true;
		} else {
			return false;
		}
	} else {
		return false;
	}
}
}
