package com.hefshine.demo;

 class Test11 {
	int num1 = 10;
	int num2 = 20;

	void display() {
		System.out.println(num1);
		System.out.println(num2);
}
}

public class Test22 extends Test11 {
	int num3 = 30;

	void display() {
		System.out.println(num3);

	}

	public static void main(String args[]) {
		Test22 t2 = new Test22();
		t2.display();
		Test11 t1 = new Test11();

		t1.display();
	}
}
