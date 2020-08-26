package com.hefshine.demo;

import java.util.Scanner;
public class exp3salaryexample {
	String name;
	double sal,Exp;
	void read()
	{
	Scanner sc=new Scanner(System.in);
	//System.out.println("Enter student id here=");
	//id=sc.nextInt();
	System.out.println("Enter Emp Name here=");
	name=sc.nextLine();
	System.out.println("Enter Emp Expirence=");
	Exp=sc.nextDouble();
	System.out.println("Enter basic salary=");
	sal=sc.nextDouble();
	
	}
	double cal() {
		System.out.println("Enter basic salary="+sal);
		if(Exp>=5) 
			
	return(35*sal)/100;
		else if(Exp<5)
	return(15*sal)/100;
		//System.out.println("Total="+sal);
		else
	return 0;
		}
	public static void main(String[] args) {
		
	exp3salaryexample e=new exp3salaryexample();
	e.read();
	
	System.out.println("Total salary="+e.cal());
	}

}

		
