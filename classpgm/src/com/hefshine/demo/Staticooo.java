package com.hefshine.demo;

public class Staticooo {
	static String str1;
	static String str2;
	String str3,str4;
	static int a,b;
	int c,d,x,y;
	public static void m1(String s1,String s2)
	{
		str1=s1;
		str2=s2;
	}
	public static void display1()
	{   
		System.out.println("thae value of string 1="+str1);
		System.out.println("thae value of string2="+str2);
	}
	public static int m2(int a1,int b2)
	{
		a=a1;
		b=b2;
		return 10;
	}
    
	public static void display2()
	{
		System.out.println("The value of a="+a);
		System.out.println("The value of b="+b);
	}
	public void m3(String s3,String s4)
	{
		str3=s3;
		str4=s4;
	}
	public void display3()
	{
		System.out.println("thae value of string 3="+str3);
		System.out.println("thae value of string 4="+str4);
	}

	public int m4()
	{
		 x=10;
		 y=20;
	
		return 0;
	}
    
	public void display4()
	{
		System.out.println("The value of a="+x);
		System.out.println("The value of b="+y);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		m1("hello", "world");
		display1();
		
		m2(100,200);
		display2();
		
		Staticooo obj=new Staticooo();
		obj.m3("hello","world");
		obj.display3();
		obj.m4();
		obj.display4();
		
		
		
 
	}

}
