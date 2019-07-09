package com.visa.prj.client;

import com.visa.prj.entity.Account;

public class AccountClient 
{
	public static void main(String[] args) 
	{
		Account first = new Account("AB");
		Account sec = new Account("SB");

		first.deposit(5000);
		sec.deposit(2500);
		
		System.out.println("first account");
		System.out.println("Balance : " + first.getBalance());
		
		System.out.println("second account");
		System.out.println("Balance : " + sec.getBalance());
		
		System.out.println("*************");
		
		Account rahul = new Account("SB100");
		Account swetha = new Account("SB100");
		
		Account ref = rahul;
		
		System.out.println("Count "+ Account.getCount());
		
		
		if(ref == rahul)
		{
			System.out.println("ref and rahul points to same");
		}
		
		
		if(rahul.equals(swetha))
		{
			System.out.println("Same content !!!");
		}
	}
}
