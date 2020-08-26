package com.hefshine.demo;

public class staticdemo {
	int a1,b1;
	static int x1,x2;
	staticdemo()
	{
		this.a1=0;
		this.b1=0;
		staticdemo.x1=0;
		staticdemo.x2=0;
	}
	public static void main(String[] args) {
		
	
	staticdemo d1=new staticdemo();
	d1.a1=23;
	d1.x1=10;
	staticdemo d2=new staticdemo();
	d2.x2=121;
	d2.x1=11;
	staticdemo d3=new staticdemo();
	d3.a1=45;
	staticdemo.x1=47;
	System.out.println(d1);
	System.out.println(d2);
	System.out.println(d3);

	
	}
	public String toString()
	{   
		System.out.println("=========================");
		System.out.println("value x1="+staticdemo.x1);
		System.out.println("value x1="+staticdemo.x2);
		return "staticdemo[a1="+a1+",b1="+b1+"]";
		
	}
}

