package com.hefshine.demo;

public class AdditiondemoExp3 {
	
	
	int no1=20,no2=20,result;
	
	public void addition()
	{
		result=no1+no2;
		System.out.println("Result="+result);
	}
	public void sub()
	{
		result=no1-no2;
		System.out.println("Result="+result);
	}
	public void mul()
	{
		result=no1*no2;
		System.out.println("Result="+result);
	}
	public void div()
	{
		result=no1/no2;
		System.out.println("Result="+result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AdditiondemoExp3 a=new AdditiondemoExp3();
		a.addition();
		a.sub();
		a.mul();
		a.div();
		

	}

}
