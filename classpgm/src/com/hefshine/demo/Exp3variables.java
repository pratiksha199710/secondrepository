package com.hefshine.demo;

public class Exp3variables {

	int a=50;    //instance variable or class vari
	static int b=100; // static variable
	void display()
	{
		int c=150;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c); //local variable
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exp3variables e=new Exp3variables();
		e.display();

	}

}
