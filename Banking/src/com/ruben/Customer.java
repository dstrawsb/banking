/**
 * 
 */
package com.ruben;

/**
 * @author Petr Ruben
 *
 *
 * -------------------------
 * Account in the Bank
 * -------------------------
 */
public class Customer {

	private String name = null;
	private String password = null;
	private boolean valid = false;
	
	public Customer(String aName, String aPassword) {
		this.name = aName;
		this.password = aPassword;
		if(this.name != null && this.password != null) {
			this.valid = true;
		}
	}
	/**
	 * getInstance will return a instance of the Customer class, it is defined as static so it can be used without being 
	 * substantiated, ie. Customer.getInstance(username, password)
	 * @param aName
	 * @param aPassword
	 * @return Customer
	 */
	public static Customer getInstance(String aName, String aPassword) {
		return new Customer(aName, aPassword);
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the valid
	 */
	public boolean isValid() {
		return valid;
	}

	/**
	 * @param valid the valid to set
	 */
	public void setValid(boolean valid) {
		this.valid = valid;
	}
}
