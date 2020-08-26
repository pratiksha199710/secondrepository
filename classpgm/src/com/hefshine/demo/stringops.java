package com.hefshine.demo;

import java.util.Scanner;

public class stringops {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter str1=");
		String str1=sc.nextLine();
		System.out.println("String 1="+str1);

		System.out.println("Enter str2=");
		String str2=sc.nextLine();
		System.out.println("String 2="+str2);
		
		String str3=str1.concat(str2);
		System.out.println("After Performing concat="+str3);
		
		boolean str4=str1.equals(str2);
		System.out.println("After Performing equals="+str4);
		
		boolean str5=str1.equalsIgnoreCase(str2);
		System.out.println("After Performing eqalignorecase="+str5);
		
		boolean str7=str1.endsWith(str1);
		System.out.println("After Performing endswith="+str5);
		
		CharSequence a = null;
		boolean str6=str1.contains(str1);
		System.out.println("After Performing contain="+str6);
		
}

}
