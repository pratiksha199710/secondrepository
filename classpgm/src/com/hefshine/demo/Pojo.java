package com.hefshine.demo;

class stud11
{
	private int id;
	private String name;
	private String mb;
	private String city;
	private int pincode;
	stud11()
	{
		
	}
	public int getid()
	{
		return id;
	}
	public void setid(int id)
	{
		this.id=id;
	}
	public String getname()
	{
		return name;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getmb()
	{
		return name;
	}
	public void setmb(String mb)
	{
		this.mb=mb;
	}
	public String getcity()
	{
		return name;
	}
	public void setcity(String city)
	{
		this.city=city;
	}
	public String getpincode()
	{
		return name;
	}
	public void setpincode(int pincode)
	{
		this.pincode=pincode;
	}
	{
		
	}
	
}
public class Pojo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
stud11 s=new stud11();
s.setid(1);
s.setname("pratiksha");
s.setmb("8552848461");
s.setcity("pune");
s.setpincode(411641);
/*System.out.println(s.getid());
System.out.println();
System.out.println(s.getmb());
System.out.println(s.getcity());
System.out.println(s.getpincode());*/

System.out.println("===================");
System.out.println(s.toString());
	}

}
