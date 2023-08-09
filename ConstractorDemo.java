package Nikhil;

public class ConstractorDemo {
	public int mid;
	public String mname;
	public float msalary;
	public String mcity;
	
	public ConstractorDemo(int id)
	{
		mid=id;
		
	}
	public ConstractorDemo(String name,float salary)
	{
		mname=name;
		msalary=salary;
	}
	public ConstractorDemo()
	{
		mcity="pune";
	}
	
	public void Display()
	{
		System.out.println("ID"+mid+"\n"+"Name"+mname+"\n"+"Salary"+msalary+"\n"+"City"+mcity);
	}
}
