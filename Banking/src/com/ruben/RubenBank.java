/**
 * 
 */
package com.ruben;

/**
 * @author Petr Ruben
 *
 */
public class RubenBank {

	/**
	 * two parameters will be used at the command line, first will be the username and the second will be the password.
	 * @param args
	 */
	public static void main(String[] args) {
		//passing in the interest and balance
		CheckingAccount checkingAccount = new CheckingAccount(.05, 4000.00);
		checkingAccount.loadCustomer("Don Strawsburg", "password", AccountTypes.CHECKING);
		checkingAccount.loadCustomer("Petr Ruben", "password", AccountTypes.CHECKING);
		//Lookup customer from CustomerHash using username as the key, verify password
		//if valid username, then go into prompt asking for menu choice, balance, deposit, withdrawal etc

	}
	
	

}
