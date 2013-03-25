package com.ruben;

/**
 * @author Petr Ruben
 *
 *
 * -------------------------
 * Checking account subclass
 * -------------------------
 */ 

public class CheckingAccount extends BankAccount
{
  public CheckingAccount(double i, double b)
  {
    super(i, b);
  }

  public void interest()
  {
    final double MIN_BAL = 100.0;
    final double PENALTY =  10.0;

    super.interest();
    if (balance < MIN_BAL)
      balance -= balance < PENALTY ? balance : PENALTY;
  }
}
