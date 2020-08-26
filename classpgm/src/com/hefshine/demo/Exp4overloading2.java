package com.hefshine.demo;

class Exp4overloading1
	{
		int area;
		float b,h1;
	   public void area(int l,int w)
	    {
	    	area=(l*w);
	        System.out.println("the area of Retcangle is ="+area);
	    }
	    public void area(int l)
	    {
	    	area=(l*l);
	        System.out.println("the area of Square is ="+area);
	    }
	    public void area(float b,float h)
	    {
	    	 area = (int) (( b*h1) / 2) ;  
             System.out.println("Area of Triangle is: "+area);  
	    }
	}
	public class Exp4overloading2 extends Exp4overloading1
	{
	     public static void main(String args[]) 
		{
	       Exp4overloading1  ob = new Exp4overloading1();
		   ob.area(5,5);
		   ob.area(5);
		   ob.area(4,4);
	        }
	}


