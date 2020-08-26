package com.hefshine.demo;

import java.util.Scanner;

public class Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		int unit,bill = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your unit=");
		unit=sc.nextInt();
		if(unit<=50)
		{
			bill=(int) (unit*0.50);
			System.out.println("Your total boll="+bill);
		}
		else if(unit<=100)
		{
			bill=(int) (25+((unit-50)*0.75f));
			System.out.println("Your total bill="+bill);
		}
	
		else if(unit<=250)
		{
			bill=(int) (100+((unit-150)*1.20));
			System.out.println("Your total bill="+bill);

	}else if(unit>250)
	{
		bill=(int) (220+(unit-250)*1.50);
		System.out.println("Your unit bill="+bill);

}
		float sch=(float) (bill*0.20);
		float tbill=bill+sch;
		System.out.println("Electricity by adding charges Bill="+tbill);
}
}
