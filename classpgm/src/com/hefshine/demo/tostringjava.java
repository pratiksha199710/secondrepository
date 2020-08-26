package com.hefshine.demo;

class stud
{
	stud(String t)
	{
		
	}
	@override public String tostring() {
		return "the taste of india";
	}
}
public class tostringjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object ob=new Object();
		//ob.toString();//return hashcode
		System.out.println(ob.toString());
		stud s=new stud("hpp");
		System.out.println(s.toString());
		String s1=new String("xyz");//override to string i.e xyz
		System.out.println(s1.toString());
		
		System.out.println(s1);
		System.out.println(s);

		

		
	}

}
