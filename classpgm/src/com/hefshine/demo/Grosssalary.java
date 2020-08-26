package com.hefshine.demo;

import java.util.Scanner;
public class Grosssalary {
public static void main(String[] args) 
	{
		
		float bs, gs, da, hra;
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Basic Salary= ");
        bs = sc.nextInt();
		if (bs<=10000)
		{
			
		hra=bs*20/100;
		da=bs*80/100;
        }
		else if(bs<=20000)
		{
			hra=bs*25/100;
			da=bs*90/100;
		}
		else
		{
			hra=bs*30/100;
			da=bs*95/100;
		}
		gs=bs + hra + da;
		System.out.println("gross salary = "+gs);
		}

	}

