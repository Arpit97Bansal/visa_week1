package com.visa.prj.entity;

/**
 * This is an entity class to represent account business data.
 * 
 * @author root
 * @version 1.0
 *
 */

public class Account 
{
	private double balance; //state of object [instance variable]
	private String accNo;
	private static int count ;
	
	public Account(String no)
	{
		count ++;
		//System.out.println(count);
		this.accNo = no;
	}
	
	public static int getCount()
	{
		return count;
	}
	
	/**
	 * method to credit amount into account
	 * 
	 * @param amt
	 */
	
	public void deposit(double amt)
	{
		balance += amt;
	}
	
	/**
	 * gives the status of current balance
	 * 
	 * @return
	 */
	
	public double getBalance()
	{
		return balance;
	}
	
	public String getAccno()
	{
		return accNo;
	}

	@Override
	public boolean equals(Object obj) 
	{
		Account other = (Account) obj;
		return this.accNo.equals(other.accNo);
	}
}
