package com.hefshine.demo;

public class pattern 
{

	public static void main(String[] args) 
	{

		int i, j, n = 1;
		
		for (i = 1; i <= 4; i++) 
		{
			for (j = 1; j <= i; j=j+1) 
			{
				System.out.println(j);
				
				System.out.println(n);

			}
			System.out.println(j);
			
			System.out.println();
		}
	}
}
