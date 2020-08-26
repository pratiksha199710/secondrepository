package com.hefshine.demo;

public class pattern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cnt=0,countj=0,i,j,sum=0;
		
	for(i=0;i<3;i++)
	{
		
		for(j=0;j<3;j++)
		{
			cnt=cnt+1;
			
			if(i==0 ||j ==0)
			{
				sum=sum+cnt;
			}
			System.out.println(cnt+"");
		}
		System.out.println();
	

}
	System.out.println("The value of sum="+sum);
	}
}