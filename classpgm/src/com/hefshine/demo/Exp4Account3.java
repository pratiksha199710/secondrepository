package com.hefshine.demo;

public class Exp4Account3 {
	int id;
	String Name;
	double amount,balance;
	public void insertData(int i,String nm)
	{
		id=i;
		Name=nm;
	}
	public void displayData()
	{
		System.out.println("id="+id);
		System.out.println("Name="+Name);
		
	}
	public void Account(double initialBalance)
	{
		balance = initialBalance;
		System.out.println("Initial balance="+balance);
		//interest = initialInterest;
	}

	public void depositeAmount(double amount)
	{
		
			balance = balance + amount;
			System.out.println("amount="+balance);
			
		}

		public void withdraw(double amount)
		{
			balance = balance - amount;
			System.out.println("after withdraw amt="+balance);
		}
		public double checkbal()
		{
			return balance;
			
	}
public static void main(String args[])
{
	Exp4Account3 e=new Exp4Account3();
	e.insertData(1, "pratiksha");
	e.Account(60000);
	e.displayData();
	e.depositeAmount(500000);
	e.withdraw(4000);
	e.checkbal();
}
}
