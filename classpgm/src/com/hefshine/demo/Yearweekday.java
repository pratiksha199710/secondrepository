package com.hefshine.demo;

import java.util.Scanner;

public class Yearweekday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int years,weeks,days,NoofDays;
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Days: ");
        NoofDays=sc.nextInt();
        
 	    years = NoofDays / 365;
	  	weeks = (NoofDays % 365) / 7;
	  	days = (NoofDays % 365) % 7;
	  	
	 
	    System.out.println("Years="+years);
	    System.out.println("Weeks="+weeks);
	    System.out.println("days="+days);
	    
	}

}
