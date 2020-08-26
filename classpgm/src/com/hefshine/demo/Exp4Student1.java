package com.hefshine.demo;

public class Exp4Student1 {
	
int rollno;
String name;
String mobileno;
int marks;
public void print(int rn,String nm,String mb,int m)
{
	rollno=rn;
	name=nm;
	mobileno=mb;
	marks=m;
}
public void display()
{
	System.out.println("rollno="+rollno);
	System.out.println("Name="+name);
	System.out.println("mobileno="+mobileno);
	System.out.println("marks="+marks);
}
}
class stud1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exp4Student1 e=new Exp4Student1();
		e.rollno=1;
		e.name="pratiksha";
		e.mobileno="8552848461";
		e.marks=500;
		e.display();

	}

}

 