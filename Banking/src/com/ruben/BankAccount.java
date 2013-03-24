package com.ruben;

// -----------------------
// Bank account superclass
// -----------------------
public class BankAccount
{
  protected double interest_rate,
                   balance;

  public BankAccount(double i, double b)
  {
    interest_rate = i;
    balance       = b;
  }

  public double getBalance() {return balance;}
  public void   interest()   {balance *= 1.0 + interest_rate;}
}
