package com.ruben;

// ------------------------
// Savings account subclass
// ------------------------
public class SavingsAccount extends BankAccount
{
  public SavingsAccount(double i, double b)
  {
    super(i, b);
  }

  public void interest()
  {
    final double MIN_BAL = 1000.0,
                 PENALTY =   25.0;

    super.interest();
    if (balance < MIN_BAL)
      balance -= balance < PENALTY ? balance : PENALTY;
  }
}


