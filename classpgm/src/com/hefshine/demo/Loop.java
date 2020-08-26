package com.hefshine.demo;

public class Loop {

	public static void main(String[] args) {
		
		int i=0,j=0,cnt=0,cnti=0;
		
		for (i=1;i<=5;i=i+2)
		{
			for(j=1;j<=10;j=j+3)
			{
				//System.out.println(i);
				j=j-1;
				cnt=cnt+1;
			}
			cnti=cnti+1;
		}
			System.out.println("the value of i="+i);
			System.out.println("The value of j="+j);
			System.out.println("The value of cnt="+cnt);
			System.out.println("The value of cnt="+cnti);

	}

}

