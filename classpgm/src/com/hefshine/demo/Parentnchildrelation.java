package com.hefshine.demo;
class Shape{
	public void area(float a)
	{
		a=a*a;
		System.out.println("area of parent=");
	}
	public void m1()
	{
		System.out.println("parent clss mi");
		
	}
	public void mshape()
	{
		System.out.println("paraent clss m2");
	}
	
}
class Square extends Shape{
	public void area(float a)
	{
		a=a*a*a;
		System.out.println("area of child="+a);
	}
	public void m1()
	{
		System.out.println("child clss mi");
		
	}
	public void m2()
	{
		System.out.println("child clss m2");
	}
}
	
public class Parentnchildrelation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape parent=new Shape();
		Square child=new Square();
		parent=(Shape)child;
	    parent.area(5);
	    parent.m1();
	    parent.mshape();
	    child.m1();
	    
		

	}

}
