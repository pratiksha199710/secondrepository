package com.hefshine.demo;

import java.util.Scanner;

public class weekday {

	public static void main(String[] args) {
	
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Input number: ");
		        int day = sc.nextInt();
		        
		        System.out.println(getDayName(day));//here we call getday method
		                                    }
		    public static String getDayName(int day) 
		    {
		        String dayName = "";
		        switch (day) 
		        {
		            case 1: dayName = "Monday"; 
		            break;
		            case 2: dayName = "Tuesday"; 
		            break;
		            case 3: dayName = "Wednesday"; 
		            break;
		            case 4: dayName = "Thursday"; 
		            break;
		            case 5: dayName = "Friday"; 
		            break;
		            case 6: dayName = "Saturday"; 
		            break;
		            case 7: dayName = "Sunday"; 
		            break;
		            
		            default:dayName = "***You enter invalid number***";
		        }

		        return dayName;
		    }
		

	}


