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

  public double getBalance() {return balance;}
  public void   interest()   {balance *= 1.0 + interest_rate;}
}
