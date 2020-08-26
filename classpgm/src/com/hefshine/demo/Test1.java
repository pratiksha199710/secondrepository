package com.hefshine.demo;
 class Test2 {
	int num1, num2;

	void read(int n1, int n2) {
		num1 = n1;
		num2 = n2;
	}

	void display() {
		System.out.println("num1=" + num1);
		System.out.println("num1=" + num2);
	}
}

public class Test1 extends Test2 {
	int num3;

	void read(int n3) {
		super.read(num1, num2);
		num3 = n3;
	}

	void display() {
		super.display();
		System.out.println("num1=" + num3);

	}

	public static void main(String arg[]) {
		Test1 t2 = new Test1();
		t2.read(1, 2);
		t2.read(3);
		t2.display();

	}
}
