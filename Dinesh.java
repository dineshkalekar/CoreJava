package coreJava;

public class Dinesh{
	
	private int day,months,year;
	
	public Dinesh() {
		// TODO Auto-generated constructor stub
		this.day=day;
		this.months=months;
		this.year=year;
	}
	public void Accept(int day,int months,int year) 
	{
		this.day=day;
		this.months=months;
		this.year=year;
		
	}
	public void display()
	{
		System.out.println("Info of date");
		System.out.println("date="+day);
		System.out.println("Month="+months);
		System.out.println("Year="+year);
	}
	public  String toString() 
	{
		return("Date"+day+" "+months+" "+year+" ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dinesh dt=new Dinesh();
		dt.Accept(13, 2, 2023);
		dt.display();
	}

}
