import.java.text.NumberFormat;

public class Account
{
	private final double RATE = 0.055;
	
	private long acctNumber;
	private double balance;
	private String name;
	
	//defines owner, account number, and balance
	public Account (String owner, long account, double initial)
	{
		name = owner;
		acctNumber = account;
		balance = initial;
	}
	//deposits amount into the account
	public double deposit (double amount)
	{
	balance = balance +amount;
	return balance;
	}
	//withdraws amount and fee
	public double withdraw (double amount, double fee)
	{
	balance = balance - amount - fee;
	return balance;
	}
	//adds interest
	public double addInterest()
	{
	balance+= (balance * RATE);
	return balance;
	}
	
	//returns current balance
	public double getBalance ()
	{
	return balance;
	}
	
	//return account info
	public String toString ()
	{
	NumberFormat fmt = NumberFormat.getCurrencyInstance();
	return acctNumber + "\t" + name + "\t" + fmt.format(balance);
	}
}